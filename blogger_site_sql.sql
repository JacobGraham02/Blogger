CREATE DATABASE blogger_site_database;
USE blogger_site_database;

CREATE TABLE user (
    id VARCHAR(36),
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(255) UNIQUE NOT NULL,
    PRIMARY KEY(id)
) Engine=InnoDB;

CREATE TABLE user_blog (
    id VARCHAR(36),
    title VARCHAR(255) NOT NULL,
    url VARCHAR(255) UNIQUE NOT NULL,
    short_description TEXT UNIQUE,
    content LONGTEXT UNIQUE,
    created TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    updated TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(id) REFERENCES user(id)
) Engine=InnoDB;
