-- SAS1.DB.1.3

-- SAS1.DB.CREATE
DROP DATABASE IF EXISTS SAS1;
CREATE DATABASE SAS1;
USE SAS1;



-- PLAYER SAS1.DB.PLAYER.TABEL

CREATE TABLE IF NOT EXISTS players(
  player_id INT PRIMARY KEY NOT NULL UNIQUE AUTO_INCREMENT,
  player_name VARCHAR(45) NOT NULL
);



-- SAS1.DB.MAP.TABEL
CREATE TABLE oceans
(
	ocean_id INT UNIQUE NOT NULL,
    ocean_x INT NOT NULL,
    ocean_y INT NOT NULL
);


-- SAS1.DB.WIND.TABEL
CREATE TABLE winds
(
    wind_id INT UNIQUE NOT NULL,
    wind_direction VARCHAR(2) NOT NULL,
    wind_speed INT NOT NULL
);

-- PLAYER SAS1.DB.GAMESTATE.TABEL

CREATE TABLE IF NOT EXISTS games(
    game_id INT PRIMARY KEY NOT NULL UNIQUE AUTO_INCREMENT,
    ocean_id INT,
    wind_id INT,
     FOREIGN KEY (ocean_id) REFERENCES oceans (ocean_id),
     FOREIGN KEY (wind_id) REFERENCES winds (wind_id)
);

CREATE TABLE IF NOT EXISTS rounds(
    round_id INT PRIMARY KEY NOT NULL UNIQUE AUTO_INCREMENT,
    game_id INT,
    wind_id INT,
    FOREIGN KEY (game_id) REFERENCES games (game_id),
    FOREIGN KEY (wind_id) REFERENCES winds (wind_id)
);


-- SAS1.DB.SHIP_TYPE.TABLE

DROP TABLE IF EXISTS ship_type;

CREATE TABLE ship_type
(
	ship_type_id  INT  PRIMARY KEY NOT NULL AUTO_INCREMENT,
    ship_type_name VARCHAR(45)  NOT NULL,
    ship_type_nationality VARCHAR(45)  NOT NULL,
    ship_type_max_number_sailors INT  NOT NULL,
    ship_type_number_gun_rows INT  NOT NULL,
    ship_type_number_guns_pr_row INT NOT NULL,
    ship_type_sailors_for_guns INT NOT NULL,
    ship_type_max_hull_quality INT NOT NULL,
    ship_type_max_number_sails INT NOT NULL,
    ship_type_max_sail INT NOT NULL,
    ship_type_sailors_for_sails INT NOT NULL,
    ship_type_max_speed INT NOT NULL,
    ship_type_max_speed_change INT NOT NULL,
    ship_type_turns_pr_turn INT NOT NULL
);
 
 
-- SAS1.SHIP_ACTUAL.TABLE

DROP TABLE IF EXISTS ships;

CREATE TABLE ships
(	
	ship_id INT  PRIMARY KEY NOT NULL AUTO_INCREMENT,
    player_id INT NOT NULL,
    ship_type VARCHAR(45) NOT NULL,
    ship_number_sailors INT NOT NULL,
	ship_direction VARCHAR(45) NOT NULL,
    ship_speed INT NOT NULL,
    ship_hull_quality INT NOT NULL,
    ship_sails INT NOT NULL,
    ship_position INT NOT NULL,
    CONSTRAINT player_id
		FOREIGN KEY (player_id) REFERENCES players (player_id)
);



-- SAS1.DB.AMMUNITION.TABLE
CREATE TABLE ammunition
(
  ammunition_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  ammunition_name VARCHAR(45) NOT NULL,
  ammunition_target VARCHAR(45) NOT NULL,
  ammunition_crit_effect_1 VARCHAR(45) NOT NULL,
  ammunition_crit_effect_2 VARCHAR(45) NOT NULL,
  ammunition_brig_shot VARCHAR(10) NOT NULL,
  ammunition_SotL_shot VARCHAR(10) NOT NULL,
  ammunition_MaW_shot VARCHAR(10) NOT NULL
);


-- SAS1.DB.STATEMENTS.INSERT
INSERT INTO ammunition
    (ammunition_name, ammunition_target, ammunition_crit_effect_1, ammunition_crit_effect_2,
     ammunition_brig_shot, ammunition_SotL_shot, ammunition_MaW_shot)
     VALUES
    ('Cannon Ball','Hull', 'Explosion', 'Rudder Lost', '2', '0,3,2','0,3,4,3'),
    ('Chain Shot','Sail', '1', '0,33', '2', '0,3','0,3,4'),
    ('Grape Shot','Crew', '0,5', '0,75', '2', '0,3','0,3,2');

--
INSERT INTO winds VALUES
    (1, 'NE', 2);

--
INSERT INTO maps VALUES
    (1, 10,10);

--
INSERT INTO players
  	(player_name)
VALUES
      ('Preben'),
      ('Ole'),
      ('Harley');
   
   
   
-- SAS1.DB.STATEMENTS.SELECT/TEST
SELECT * FROM players;
SELECT * FROM maps;
SELECT * FROM ship_type;



