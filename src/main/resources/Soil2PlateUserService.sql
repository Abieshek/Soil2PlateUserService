-- Ignore Safe Mode Restrictions
SET SQL_SAFE_UPDATES=0;

use soil2plateuserservice;

CREATE TABLE `consumers` (
  `consumer_id` INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  `email` VARCHAR(255),
  `password` VARCHAR(255),
  `name` VARCHAR(255),
  `phone_number` BIGINT,
  `subscribed` BOOL NOT NULL DEFAULT false,
  `reward_points` FLOAT NOT NULL DEFAULT 0,
  `carbon_offset` FLOAT NOT NULL DEFAULT 0,
  `unit_number` INT,
  `street_name` VARCHAR(255),
  `city`  VARCHAR(255),
  `state`  VARCHAR(255),
  `zip_code` INT
);

CREATE TABLE `farmers` (
  `farmer_id` INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  `email` VARCHAR(255),
  `password` VARCHAR(255),
  `name` VARCHAR(255),
  `phone_number` BIGINT ,
  `certifications` VARCHAR(255),
  `energy_usage` INT NOT NULL DEFAULT 0,
  `unit_number` INT,
  `street_name` VARCHAR(255),
  `city`  VARCHAR(255),
  `state`  VARCHAR(255),
  `zip_code` INT
);


ALTER TABLE consumers ENGINE = InnoDB;
ALTER TABLE farmers ENGINE = InnoDB;


INSERT INTO consumers (email, password, name, phone_number, subscribed, reward_points, carbon_offset, unit_number, street_name, city, state, zip_code)
VALUES ('sample@gmail.com', 'password', 'FirstName LastName', 302302302, True, 2.1, 2.1, 123, 'street', 'city', "state", 30040);

INSERT INTO farmers (email, password, name, phone_number, certifications, energy_usage, unit_number, street_name, city, state, zip_code)
VALUES ('samplefarmer@gmail.com', 'password', 'FirstName LastName', 302302302, 'certification information', 201, 123, 'street', 'city', "state", 30040);


Select* from farmers;



