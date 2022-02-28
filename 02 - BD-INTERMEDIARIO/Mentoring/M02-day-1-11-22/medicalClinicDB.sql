create database medicalClinicDB; --CREATE A DATABASE
--========================================================--
use medicalClinicDB; --To USE DATABASE
--========================================================--

--STARTING TO CREATE THE TABLE DOCTOR
create table Doctor (
	DoctorID int identity(1,1)  not null primary key,
	CRM varchar(50) not null,
	Doc_Name varchar(max) not null,
	Specialty varchar(max) not null
);
--========================================================--

--TO ENTER TEBLE DOCTOR
select * from Doctor;
--========================================================--

-- TO INSERT DATA INTO THE TABLE DOCTOR
insert into Doctor(CRM, Doc_Name, Specialty)
values ('3467.5678.345-09', 'Johnas Bro', 'Pediatrics');

--========================================================--

--STARTING TO CREATE THE TABLE PATIENT
create table Patient (
	PatientID int identity(1,1) not null primary key,
	Patient_Name varchar(max) not null,
	Sex varchar(10) not null,
	Adress varchar(max),
	PA varchar(10) not null,
	City varchar(max) not null,
	Birth_date date not null,
);
--========================================================--

--TO ENTER TEBLE PATIENT
select * from Patient;

-- INSERT DATA INTO THE TABLE PATIENT
insert into Patient(Patient_Name, Sex, Adress, PA, City, Birth_date)
values ('Johna Hill', 'Masc', 'Dona Hill Street', 'UC', 'Nashville', '07-05-1982');

--========================================================--
--STARTING TO CREATE THE TABLE MEDICAL APPOINTMET
CREATE TABLE medicalAppointment(
	MedAppointID int identity(1,1) not null primary key,
	MedAppoint_Date date not null,
	Specialty varchar(max) not null,
	fk_DoctorID int,
	fk_PatientID int
);
--========================================================--

-- TO SELECTING TYABLE MEDICAL APPOINTMENT
select * from medicalAppointment;

-- INSERT DATA INTO THE TABLE MEDICALAPPOINTMENT
insert into medicalAppointment (MedAppoint_Date, Specialty)
values ('03-22-22', 'Pediatrics')

--========================================================--
-- TO CHANGE TABLE MEDICAL APPOINTMENT
alter table medicalAppointment add constraint FK_DoctorID
foreign key (fk_DoctorID)
references Doctor(DoctorID)
on delete cascade;	

alter table medicalAppointment add constraint FK_PatientID
foreign key (fk_PatientID)
references Patient (PatientID)
on delete cascade;
-- TO CHANGE TABLE MEDICAL APPOINTMENT

--TO DALETE TEBLES
drop table Patient;
drop table Doctor;
drop table medicalAppointment;


-- TO DELET DATABASE
use master; -- TO USE MASTEER, To set the database
drop database medicalClinicDB; -- TO DELETE DATABASE

--========================================================--
-- TO CREATE A PROCEDURE TO INSERT DATA
delimiter $$
CREATE PROCEDURE InsertDoc(
	@CRM varchar(50),
	@Doc_Name varchar(max),
	@Specialty varchar(max)
	)
	as
	INSERT Doctor(
		CRM,
		Doc_Name,
		Specialty
	)
	values(
		@CRM,
		@Doc_Name,
		@Specialty
	);
	--========================================================--
	-- TO CREATE THE NEW DOCTORS
	Exec InsertDoc @CRM = '345.654.875-98', @Doc_Name = 'Pedro', @Specialty = 'Den';
	Exec InsertDoc @CRM = '346.797.875-58', @Doc_Name = 'Pablito', @Specialty = 'Dentist';

	--========================================================--

-- TO CREATE A PROCEDURE TO CONSULT DATA
	create procedure searchDoc (
	@Doc_Name varchar(max)
	)
	as
	select * from Doctor where Doc_Name = @Doc_Name;
	Exec searchDoc @Doc_Name = 'Pablito';
	Exec searchDoc @Doc_Name = 'Pedro';

	-- TO CREATE A PROCEDURE TO DELETE DATA
	create procedure DeleteDoc
	@ID int
	as
	delete from Doctor where @ID;
	
	Exec DeleteDoc @ID = 2;

	select * from Doctor;
end
$$

