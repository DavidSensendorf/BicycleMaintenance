BEGIN TRANSACTION;



DROP TABLE IF EXISTS bicycle, bike_part, cyclist, brake, drivetrain_component, wheel_tire CASCADE;

CREATE TABLE cyclist (
    cyclist_id int GENERATED ALWAYS AS IDENTITY,
    cyclist_name varchar(20) NOT NULL,
    active boolean,
    date_deleted timestamp,
    CONSTRAINT PK_cyclist PRIMARY KEY(cyclist_id)
    );


CREATE TABLE bicycle (
    bicycle_id int GENERATED ALWAYS AS IDENTITY,
    cyclist_id int REFERENCES cyclist(cyclist_id),
    name varchar(100) NOT NULL,
    description varchar(1000),
    active boolean,
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
    active boolean,
    date_deleted timestamp,
    CONSTRAINT PK_bike_part PRIMARY KEY (bike_part_id),
    CONSTRAINT FK_bike_part_bicycle FOREIGN KEY (bicycle_id) REFERENCES bicycle(bicycle_id)
    );

    CREATE TABLE brake (
    bike_part_id int REFERENCES bike_part(bike_part_id),
--    bicycle_id int REFERENCES bicycle(bicycle_id),
--    name varchar(100) NOT NULL,
--    description varchar(1000),
--    manufacturer varchar(50),
--    model varchar(50),
--    model_year int,
--    part_type varchar(50),
--    install_date DATE,
--    distance_in_meters int,
--    age_interval int,
--    distance_interval int,
--    material varchar(25),
    pad_type varchar(25),
    front boolean,
    active boolean,
    date_deleted timestamp,
    CONSTRAINT PK_brake_part PRIMARY KEY (brake_part_id),
    CONSTRAINT FK_brake_part_bicycle FOREIGN KEY (bicycle_id) REFERENCES bicycle(bicycle_id)
    );

    CREATE TABLE drivetrain_component(
    drivetrain_component_part_id int GENERATED ALWAYS AS IDENTITY,
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
    speeds int,
    gear_size varchar(25),
    lube_type varchar(50),
    waxed boolean,
    active boolean,
    date_deleted timestamp,
    CONSTRAINT PK_drivetrain_component_part PRIMARY KEY (drivetrain_component_part_id),
    CONSTRAINT FK_drivetrain_component_part_bicycle FOREIGN KEY (bicycle_id) REFERENCES bicycle(bicycle_id)
    );

    CREATE TABLE wheel_tire(
    wheel_tire_part_id int GENERATED ALWAYS AS IDENTITY,
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
    tubeless boolean,
    front boolean,
    active boolean,
    date_deleted timestamp,
    CONSTRAINT PK_wheel_tire_part PRIMARY KEY (wheel_tire_part_id),
    CONSTRAINT FK_wheel_tire_part_bicycle FOREIGN KEY (bicycle_id) REFERENCES bicycle(bicycle_id)
    );


--    days_since_lube int,
--    meters_since_lube int,
--
--    tubeless boolean,
--    style varchar(25),
--    electric boolean,
--
--
--    sealant_age int,


COMMIT;

--CREATE TABLE  (
--    _id int GENERATED ALWAYS AS IDENTITY,
--    bicycle_id int REFERENCES bicycle(bicycle_id),
--    name varchar(100) NOT NULL,
--    install_date DATE,
--    distance_in_meters int,
--    age_interval int,
--    distance_interval int,
--    manufacturer varchar(50),
--    model varchar(50),
--    manufacture_year int,
--    CONSTRAINT PK_ PRIMARY KEY (_id),
--    CONSTRAINT FK_ FOREIGN KEY (bicycle_id) REFERENCES bicycle(bicycle_id)
--);