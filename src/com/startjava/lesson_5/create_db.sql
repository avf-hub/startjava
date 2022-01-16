-- create database

CREATE DATABASE jaegers;

CREATE TABLE jaegers (
    id SERIAL PRIMARY KEY,
    modelName TEXT,
    mark CHAR(6),
    height FLOAT,
    weight FLOAT,
    status TEXT,
    origin TEXT,
    launch DATE,
    kaijuKill INTEGER
);