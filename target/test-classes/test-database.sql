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


COMMIT;

