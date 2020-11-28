DROP TABLE IF EXISTS user;
CREATE table user(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  lastname VARCHAR(250) NOT NULL,
  type VARCHAR(250) DEFAULT NULL,
  salary FLOAT NOT NULL
);
INSERT INTO user (id,name, lastname, type, salary) VALUES (001,'Aliko', 'Dangote', 'Lider', 5000000);
INSERT INTO user (id,name, lastname, type, salary) VALUES (002,'Bill', 'Gates', 'Lider', 3000000);
INSERT INTO user (id,name, lastname, type, salary) VALUES (003,'Folrunsho', 'Alakija', 'Operador', 2000000);