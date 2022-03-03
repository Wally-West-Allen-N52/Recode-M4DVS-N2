create database javaAula04CRUD;

use javaAula04CRUD;

create table Pessoa (
	id int primary key not null,
	nome varchar(max) not null
);



insert into Pessoa (nome) values ('Walalce');
select * from Pessoa;

--=======================================================--

create table Pessoa (
	matricula vachar(max) primary key not null,
	teste float not null,
	proova float not null
);
--delete from Pessoa where id = id;

--drop table Pessoa;