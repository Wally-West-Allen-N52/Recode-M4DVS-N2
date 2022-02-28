create database medicalClinicDB2; -- Create a database

USE medicalClinicDB2 -- To use database
/****** Object:  Table [dbo].[Doctor]    Script Date: 03/02/2022 18:36:57 ******/

--=================================================================================--
-- Create the table doctor
CREATE TABLE Doctor(
	DoctorID int IDENTITY(1,1) primary key NOT NULL,
	CRM varchar(50) NOT NULL,
	Doc_Name varchar(max) NOT NULL,
	Specialty varchar(max) NOT NULL,
);
select * from Doctor;
--==================================================================================--

-- Create the table medicament appointment
CREATE TABLE medicalAppointment(
	MedAppointID int IDENTITY(1,1) primary key NOT NULL,
	MedAppoint_Date date NOT NULL,
	Specialty varchar(max) NOT NULL,
	fk_DoctorID int NULL,
	fk_PatientID int NULL,
);
select * from medicalAppointment;

--====================================================================================--

-- Create the table patient
CREATE TABLE Patient(
	PatientID int IDENTITY(1,1) primary key NOT NULL,
	Patient_Name varchar(max) NOT NULL,
	Sex varchar(10) NOT NULL,
	Adress varchar(max) NULL,
	PA varchar(10) NOT NULL,
	City varchar(max) NOT NULL,
	Birth_date date NOT NULL,
);
select * from Patient;
--===================================================================================--

-- Alter the table medical appointment to use FK DoctorID
alter table medicalAppointment add constraint FK_DoctorID
foreign key (fk_DoctorID)
references Doctor(DoctorID)
on delete cascade;

-- Alter the  table medical appointment to use FK PatientID
alter table medicalAppointment add constraint FK_PatientID
foreign key (fk_PatientID)
references Patient(PatientID)
on delete cascade;

--===================================================================================--

-- To delete tables
drop table Doctor;
drop table medicalAppointment;
drop table Patient;
--==================================================================================--

-- To delete database
use master; -- To set the database
drop database medicalClinicDB2; -- To delete database
--==================================================================================--

-- To create a procedure to insert data
delimiter $$
create procedure InsertDoc(
	@CRM varchar(30),
	@Doc_Name varchar(max),
	@Specialty carchar(max)
)
as
insert Doctor (
	CRM,
	Doc_Name,
	Specialty
	)
	values (
	@CRM,
	@Doc_Name,
	@Specialty
	);
	--==============================================================--
	-- Tto create a new doctors
	exec InsertDoc @CRM = '345.653.789-09', @Doc_Name = 'Wallace', @Specialty = 'Flugohorn';
	exec InsertDoc @CRM = '678.908.764-12', @Doc_name = 'Cronembergh', @Specialty = 'Cronelogic';

	--===============================================================--


$$
-- DESKTOP-GODBMFL