CREATE DATABASE aula;

USE aula;

CREATE TABLE cliente (
	id INTEGER NOT NULL auto_increment,
    nome VARCHAR(50),
    endereco VARCHAR(50), 
    datanasc DATE,
    CONSTRAINT pk_cliente PRIMARY KEY(id));
    
SELECT * FROM cliente;
