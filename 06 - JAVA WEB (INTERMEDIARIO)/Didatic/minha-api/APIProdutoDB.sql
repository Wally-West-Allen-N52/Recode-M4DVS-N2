create database APIProdutoDB;

use APIProdutoDB;

create table Produto(
	id int identity (1,1) primary key not null,
	nome varchar(max) not null,
	modelo varchar(max) not null,
	quuantidade int not null,
	valor float not null
);

select * from Produto;