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
CREATE TABLE maps
(
	map_id INT UNIQUE NOT NULL,
    map_height INT NOT NULL,
    map_width INT NOT NULL
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
  game_name VARCHAR(20) NOT NULL,
  game_round INT,
   map_id INT,
   wind_id INT,
   FOREIGN KEY (map_id) REFERENCES maps (map_id),
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

DROP TABLE IF EXISTS ship_actual;

CREATE TABLE ship_actual
(	
	ship_actual_id INT  PRIMARY KEY NOT NULL AUTO_INCREMENT,
    player_id INT NOT NULL,
    ship_type_id INT NOT NULL,
    game_id INT NOT NULL,
    ship_actual_current_number_sailors INT NOT NULL,
	ship_actual_direction VARCHAR(45) NOT NULL,
    ship_actual_current_speed INT NOT NULL,
    ship_actual_hull_quality INT NOT NULL,
    ship_actual_sails INT NOT NULL,
    ship_actual_current_position INT NOT NULL,
    CONSTRAINT game_id
		FOREIGN KEY (game_id) REFERENCES games (game_id),
    CONSTRAINT ship_type_id
		FOREIGN KEY (ship_type_id) REFERENCES ship_type (ship_type_id),
    CONSTRAINT player_id
		FOREIGN KEY (player_id) REFERENCES players (player_id)
);


   
-- SAS1.DB.STATEMENTS.INSERT

INSERT INTO winds VALUES
(1, "NE", 2);

INSERT INTO maps VALUES
(1, 10,10);

INSERT INTO players
  	(player_name)
VALUES
      ('Preben'),
      ('Ole'),
      ('Harley');
     
INSERT INTO games
   (game_name, game_round, map_id, wind_id)
VALUES
   ('FIRST GAME', 1, 1, 1);

INSERT INTO ship_type
   (ship_type_name, ship_type_nationality, ship_type_max_number_sailors, ship_type_number_gun_rows,
   ship_type_number_guns_pr_row, ship_type_sailors_for_guns, ship_type_max_hull_quality, ship_type_max_number_sails,
   ship_type_max_sail, ship_type_sailors_for_sails, ship_type_max_speed, ship_type_max_speed_change,ship_type_turns_pr_turn)
VALUES
   ('BRIG', 'Dansk', 60, 1, 8, 24, 25, 4, 30, 24, 2, 1,1);
   
   
   
-- SAS1.DB.STATEMENTS.SELECT/TEST
SELECT * FROM players;
SELECT * FROM maps;
SELECT * FROM ship_type;



