BEGIN TRANSACTION;

DROP TABLE IF EXISTS bicycle, cyclist, brake_pad, cables, cassette, chainring, custom_part, derailleur, disc_brakes,
frame, rim_brakes, tire, wheel CASCADE;

CREATE TABLE cyclist (
    cyclist_id int GENERATED ALWAYS AS IDENTITY,
    cyclist_name varchar(20) NOT NULL,
    CONSTRAINT PK_cyclist PRIMARY KEY(cyclist_id)
);

CREATE TABLE frame (
    frame_id int GENERATED ALWAYS AS IDENTITY,
    name varchar(100) NOT NULL,
    install_date DATE,
    distance_in_meters int,
    age_interval int,
    distance_interval int,
    manufacturer varchar(50),
    model varchar(50),
    manufacture_year int,
    CONSTRAINT PK_cables PRIMARY KEY (cables_id),
);

CREATE TABLE bicycle (
    bicycle_id int GENERATED ALWAYS AS IDENTITY,
    bicycle_frame int REFERENCES frame(frame_id),
    cyclist_id int REFERENCES cyclist(cyclist_id),
    name varchar(100) NOT NULL,
    CONSTRAINT PK_bicycle PRIMARY KEY (bicycle_id),
    CONSTRAINT FK_cyclist_bicycle FOREIGN KEY (cyclist_id) REFERENCES cyclist(cyclist_id)
);

CREATE TABLE brake_pad (
    brake_pad_id int GENERATED ALWAYS AS IDENTITY,
    bicycle_id int REFERENCES bicycle(bicycle_id),
    name varchar(100) NOT NULL,
    pad_type varchar(25),
    install_date DATE,
    distance_in_meters int,
    age_interval int,
    distance_interval int,
    manufacturer varchar(50),
    model varchar(50),
    manufacture_year int,
    CONSTRAINT PK_brake_pad PRIMARY KEY (brake_pad_id),
    CONSTRAINT FK_brake_pad_bicycle FOREIGN KEY (bicycle_id) REFERENCES bicycle(bicycle_id)
	);

CREATE TABLE cables (
    cables_id int GENERATED ALWAYS AS IDENTITY,
    bicycle_id int REFERENCES bicycle(bicycle_id),
    name varchar(100) NOT NULL,
    install_date DATE,
    distance_in_meters int,
    age_interval int,
    distance_interval int,
    manufacturer varchar(50),
    model varchar(50),
    manufacture_year int,
    CONSTRAINT PK_cables PRIMARY KEY (cables_id),
    CONSTRAINT FK_cables_bicycle FOREIGN KEY (bicycle_id) REFERENCES bicycle(bicycle_id)
);

CREATE TABLE cassette (
    cassette_id int GENERATED ALWAYS AS IDENTITY,
    bicycle_id int REFERENCES bicycle(bicycle_id),
    name varchar(100) NOT NULL,
    install_date DATE,
    distance_in_meters int,
    age_interval int,
    distance_interval int,
    manufacturer varchar(50),
    model varchar(50),
    manufacture_year int,
    speeds int,
    gear_size varchar(50),
    CONSTRAINT PK_cassette PRIMARY KEY (cassette_id),
    CONSTRAINT FK_casstte_bicycle FOREIGN KEY (bicycle_id) REFERENCES bicycle(bicycle_id)
);

CREATE TABLE chain (
    chain_id int GENERATED ALWAYS AS IDENTITY,
    bicycle_id int REFERENCES bicycle(bicycle_id),
    name varchar(100) NOT NULL,
    install_date DATE,
    distance_in_meters int,
    age_interval int,
    distance_interval int,
    manufacturer varchar(50),
    model varchar(50),
    manufacture_year int,
    lube_type varchar(50),
    speeds int,
    is_waxed BOOLEAN NOT NULL,
    CONSTRAINT PK_chain PRIMARY KEY (chain_id),
    CONSTRAINT FK_chain_bicycle FOREIGN KEY (bicycle_id) REFERENCES bicycle(bicycle_id)
);

CREATE TABLE chainring (
    chainring_id int GENERATED ALWAYS AS IDENTITY,
    bicycle_id int REFERENCES bicycle(bicycle_id),
    name varchar(100) NOT NULL,
    install_date DATE,
    distance_in_meters int,
    age_interval int,
    distance_interval int,
    manufacturer varchar(50),
    model varchar(50),
    manufacture_year int,
    gear_size varchar(50),
    speeds int,
    CONSTRAINT PK_ PRIMARY KEY (_id),
    CONSTRAINT FK_cables_bicycle FOREIGN KEY (bicycle_id) REFERENCES bicycle(bicycle_id)
);

COMMIT;



INSERT INTO quiz (quiz_name) VALUES ('test_quiz');
--Question 1
INSERT INTO question (question_text, correct_answer) VALUES ('What color is the sky?', 2);
INSERT INTO answer (question_id, answer_number, answer_text)
VALUES (lastval(), 1, 'yellow'), (lastval(), 2, 'blue'), (lastval(), 3, 'green'), (lastval(), 4, 'red');
INSERT INTO quiz_question (quiz_id, question_id, question_number)
VALUES ((SELECT quiz_id FROM quiz WHERE quiz_name = 'test_quiz'), lastval(), 1);
--Question 2
INSERT INTO question (question_text, correct_answer) VALUES ('A skeleton walks into a bar, and says to the bartender, "Give me a beer and a ..."', 3);
INSERT INTO answer (question_id, answer_number, answer_text)
VALUES (lastval(), 1, 'hair brush'), (lastval(), 2, 'dry erase marker'), (lastval(), 3, 'mop'), (lastval(), 4, 'yo-yo');
INSERT INTO quiz_question (quiz_id, question_id, question_number)
VALUES ((SELECT quiz_id FROM quiz WHERE quiz_name = 'test_quiz'), lastval(), 2);

COMMIT;
