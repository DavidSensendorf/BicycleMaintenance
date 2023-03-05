BEGIN TRANSACTION;



DROP TABLE IF EXISTS bicycle, bike_part, cyclist, brake, drivetrain_component, wheel_tire CASCADE;

CREATE TABLE cyclist (
    cyclist_id int GENERATED ALWAYS AS IDENTITY,
    name varchar(20) NOT NULL,
    active boolean DEFAULT true,
    date_deleted timestamp,
    CONSTRAINT PK_cyclist PRIMARY KEY(cyclist_id)
    );


CREATE TABLE bicycle (
    bicycle_id int GENERATED ALWAYS AS IDENTITY,
    cyclist_id int REFERENCES cyclist(cyclist_id),
    name varchar(100) NOT NULL,
    description varchar(1000),
    active boolean DEFAULT true,
    date_deleted timestamp,
    CONSTRAINT PK_bicycle PRIMARY KEY (bicycle_id),
    CONSTRAINT FK_cyclist_bicycle FOREIGN KEY (cyclist_id) REFERENCES cyclist(cyclist_id)
    );


CREATE TABLE bike_part (
    bike_part_id int GENERATED ALWAYS AS IDENTITY,
    bicycle_id int REFERENCES bicycle(bicycle_id),
    name varchar(100) NOT NULL,
    description varchar(1000),
    manufacturer varchar(50),
    model varchar(50),
    model_year int,
    part_type varchar(50),
    install_date DATE,
    distance_in_meters int,
    age_interval int,
    distance_interval int,
    material varchar(25),
    style varchar(50),
    part_number varchar(100),
    active boolean DEFAULT true,
    date_deleted timestamp,
    CONSTRAINT PK_bike_part PRIMARY KEY (bike_part_id),
    CONSTRAINT FK_bike_part_bicycle FOREIGN KEY (bicycle_id) REFERENCES bicycle(bicycle_id)
    );

    CREATE TABLE brake (
    bike_part_id int REFERENCES bike_part(bike_part_id),
    pad_type varchar(25),
    front boolean,
    active boolean DEFAULT true,
    date_deleted timestamp,
    CONSTRAINT FK_bike_part FOREIGN KEY (bike_part_id) REFERENCES bike_part(bike_part_id)
    );

    CREATE TABLE drivetrain_component(
    bike_part_id int REFERENCES bike_part(bike_part_id),
    speeds int,
    gear_size varchar(25),
    lube_type varchar(50),
    waxed boolean,
    active boolean DEFAULT true,
    date_deleted timestamp,
    CONSTRAINT FK_bike_part FOREIGN KEY (bike_part_id) REFERENCES bike_part(bike_part_id)
    );

    CREATE TABLE wheel_tire(
    bike_part_id int REFERENCES bike_part(bike_part_id),
    tubeless boolean,
    front boolean,
    active boolean DEFAULT true,
    date_deleted timestamp,
    CONSTRAINT FK_bike_part FOREIGN KEY (bike_part_id) REFERENCES bike_part(bike_part_id)
    );


INSERT INTO cyclist (name)
VALUES
('Person1'),
('Person2'),
('Person3'),
('Person4');

INSERT INTO bicycle (cyclist_id, name, description)
VALUES
('1', 'Bike1', 'Description1'),
('1', 'Bike2', 'Description2'),
('1', 'Bike3', 'Description3'),
('2', 'Bike1', 'Description1'),
('3', 'Bike1', 'Description1'),
('3', 'Bike2', 'Description2'),
('3', 'Bike3', 'Description3'),
('4', 'Bike1', 'Description1'),
('4', 'Bike2', 'Description2');

INSERT INTO bike_part (bicycle_id, name, description, manufacturer, model, model_year, part_type, install_date, distance_in_meters,
 age_interval, distance_interval, material, style)
 VALUES
 (1, 'part1', 'description1', 'manufacturer1', 'model1', 1971, 'Frame1', '2020-1-1', 2001, 141, 4001, 'carbon1', 'road1'),
 (1, 'part2', 'description2', 'manufacturer2', 'model2', 1972, 'Frame2', '2021-1-1', 2002, 142, 4002, 'carbon2', 'road2'),
 (1, 'part3', 'description3', 'manufacturer3', 'model3', 1973, 'Frame2', '2022-1-1', 2003, 143, 4003, 'carbon3', 'road3'),
 (2, 'part4', 'description4', 'manufacturer4', 'model4', 1974, 'Frame4', '2023-1-1', 2004, 144, 4004, 'carbon4', 'road4'),
 (2, 'part5', 'description5', 'manufacturer5', 'model5', 1975, 'Frame5', '2024-1-1', 2005, 145, 4005, 'carbon5', 'road5'),
 (3, 'part6', 'description6', 'manufacturer6', 'model6', 1976, 'Frame6', '2025-1-1', 2006, 146, 4006, 'carbon6', 'road6'),
 (4, 'part7', 'description7', 'manufacturer7', 'model7', 1977, 'Frame7', '2026-1-1', 2007, 147, 4007, 'carbon7', 'road7'),
 (5, 'part8', 'description8', 'manufacturer8', 'model8', 1978, 'Frame8', '2027-1-1', 2008, 148, 4008, 'carbon8', 'road8');
 


COMMIT;

