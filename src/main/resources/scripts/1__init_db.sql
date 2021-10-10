DROP DATABASE IF EXISTS initDB;
CREATE DATABASE IF NOT EXISTS initDB;
use initBD;

CREATE TABLE developers (
                            id INT NOT NULL AUTO_INCREMENT,
                            name VARCHAR(55) NOT NULL,
                            age INT(3),
                            gender VARCHAR(10),
                            salary LONG not null,
                            PRIMARY KEY (id));

CREATE TABLE skills (
                        id INT NOT NULL AUTO_INCREMENT,
                        language VARCHAR(10),
                        level VARCHAR(10),
                        PRIMARY KEY (id));

CREATE TABLE projects (
                          id INT NOT NULL AUTO_INCREMENT,
                          name VARCHAR(100) NOT NULL,
                          field VARCHAR(20) NOT NULL,
                          cost  LONG NOT NULL,
                          create_date date not null,
                          PRIMARY KEY (id));

CREATE TABLE companies (
                           id INT NOT NULL AUTO_INCREMENT,
                           name VARCHAR(20) NOT NULL,
                           city VARCHAR(20) NOT NULL,
                           PRIMARY KEY (id));

CREATE TABLE customers (
                           id INT NOT NULL AUTO_INCREMENT,
                           name VARCHAR(25) NOT NULL,
                           city VARCHAR(20) NOT NULL,
                           industry VARCHAR (20) NOT NULL,
                           PRIMARY KEY (id));

