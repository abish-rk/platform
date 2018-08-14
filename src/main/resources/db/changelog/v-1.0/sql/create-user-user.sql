--liquibase formatted sql
CREATE TABLE Users (
  id       BINARY(16)             NOT NULL PRIMARY KEY,
  login VARCHAR_IGNORECASE(50) NOT NULL,
  first_name varchar(100) not null,
  last_name varchar(100) not null,
  password VARCHAR(60)            NOT NULL,
  enabled  BOOLEAN                NOT NULL
);
--rollback drop table Users;
