create database CrudDB;

use CrudDB;

create table Contacts (
	ContactID int identity (1,1) primary key not null,
	ContactName varchar(max) not null,
	Age int not null,
	RegistrationDate date not null,
);

select * from Contacts;

-- DESKTOP-GODBMFL