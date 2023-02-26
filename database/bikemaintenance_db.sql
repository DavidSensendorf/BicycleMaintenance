BEGIN TRANSACTION;



DROP TABLE IF EXISTS bicycle, brake_pad, bike_part, cables, cassette, bicycle_chain, chainring, custom_part, cyclist, derailleur, disc_brakes,
frame, rim_brakes, tire, wheel CASCADE;

CREATE TABLE cyclist (
    cyclist_id int GENERATED ALWAYS AS IDENTITY,
    cyclist_name varchar(20) NOT NULL,
    CONSTRAINT PK_cyclist PRIMARY KEY(cyclist_id)
);


CREATE TABLE bicycle (
    bicycle_id int GENERATED ALWAYS AS IDENTITY,
    bicycle_frame int REFERENCES frame(frame_id),
    cyclist_id int REFERENCES cyclist(cyclist_id),
    name varchar(100) NOT NULL,
    CONSTRAINT PK_bicycle PRIMARY KEY (bicycle_id),
    CONSTRAINT FK_cyclist_bicycle FOREIGN KEY (cyclist_id) REFERENCES cyclist(cyclist_id)
);


CREATE TABLE bike_part (
    bike_part_id int GENERATED ALWAYS AS IDENTITY,
    bicycle_id int REFERENCES bicycle(bicycle_id),
    name varchar(100) NOT NULL,
    description varchar(1000),
    install_date DATE,
    distance_in_meters int,
    age_interval int,
    distance_interval int,
    manufacturer varchar(50),
    model varchar(50),
    model_year int,
    part_type varchar(50),
    pad_type varchar(25),
    speeds int,
    part_size varchar(25),
    lube_type varchar(50),
    days_since_lube int,
    meters_since_lube int,
    waxed boolean,
    tubeless boolean,
    style varchar(25),
    electric boolean,
    front boolean,
    material varchar(25),
    sealant_age int,
    CONSTRAINT PK_bike_part PRIMARY KEY (bike_part_id),
    CONSTRAINT FK_bike_part_bicycle FOREIGN KEY (bicycle_id) REFERENCES bicycle(bicycle_id)
	);

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