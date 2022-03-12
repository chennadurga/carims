CREATE TABLE users(id BIGINT PRIMARY KEY AUTO_INCREMENT,
                   username VARCHAR(20), email VARCHAR(50), password VARCHAR(120));

CREATE TABLE user_roles(user_id INT, role_id Int);

CREATE TABLE car(id BIGINT PRIMARY KEY AUTO_INCREMENT,
                    name VARCHAR(255), model VARCHAR(255), engine VARCHAR(255), quantity INT);

CREATE TABLE roles(id BIGINT PRIMARY KEY AUTO_INCREMENT,
                 name VARCHAR(50));