create database proyecto;
use proyecto;

create table Cultivo(
	id int primary key auto_increment,
    fechaSiembra varchar(12) not null,
    fechaRecoleccion varchar(12) not null,
    plantaSembrada varchar(50) not null,
    tipoCultivo varchar(20) not null,
    ubicacionCultivo varchar(100) not null,
    estado bool not null
);

insert into Cultivo (fechaSiembra, fechaRecoleccion, plantaSembrada, tipoCultivo, ubicacionCultivo, estado) 
	values ("25/2/2024", "21/3/2024", "Trigo", "Cereales", "San Carlos", true),
	("20/2/2024", "22/3/2024", "Lentejas", "Leguminosas", "Perez Zeledon", true),
    ("19/1/2023", "20/2/2024", "Cebolla", "Hortalizas", "Alajuela", true),
    ("19/1/2023", "20/2/2024", "Girasol", "Ornamentales", "Alajuela", true),
    ("19/1/2023", "20/2/2024", "Papa", "Raices y Tuberculos", "Alajuela", true),
    ("19/1/2023", "20/2/2024", "Sandia", "Frutales", "Alajuela", true);
    
CREATE TABLE maquinas_agricolas (
    Codigo INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(100) NOT NULL,
    TiempoReparacion INT NOT NULL,
    CostoHora DECIMAL(10, 2) NOT NULL,
    enUso boolean NOT NULL
);

select * from maquinas_agricolas;

INSERT INTO maquinas_agricolas (Nombre, TiempoReparacion, CostoHora, enUso) VALUES
('Tractor A', 24, 50.00, false),
('Cosechadora B', 48, 80.00, false),
('Sembradora C', 12, 30.00, false),
('Pulverizador D', 36, 60.00, false);

create table Persona(
	id int primary key auto_increment,
    nombre varchar(30) not null,
    primerAp varchar(30) not null,
    segundoAp varchar(30) not null,
    edad int not null,
    correo varchar(50) not null,
    password varchar(20) not null,
    telefono varchar(15) not null,
    cedula varchar(15) not null,
    estado bool not null,
    rol varchar(20) not null,
    especialidad varchar(20),
    departamento varchar(20),
    salario float,
    numeroColaboradores int
);

delete from persona where id = 13;
select * from persona;

insert into persona (nombre, primerAp, segundoAp, edad, correo, password, telefono, cedula, estado, rol, especialidad) values
	("Marta", "Garcia", "Sanchez", 33, "marta@correo.com", "1234", "9898-5854", "695846214", false, "Cosechador", "Tomates"),
    ("Alejandro", "Lopez", "Martinez", 46, "almar@correo.com", "1234", "6098-4158", "654784759", true, "Cosechador", "Zanahoria"),
    ("David ", "Fernandez", "Lopez", 47, "davidfl@correo.com", "1234", "7474-8989", "858645712", false, "Cosechador", "Verdes");

insert into persona (nombre, primerAp, segundoAp, edad, correo, password, telefono, cedula, estado, rol, departamento, salario) values
	("Ana", "Rodriguez", "Perez", 21, "anap@correo.com", "1234", "4571-63258", "321454545", true, "Empleado", "Ventas", 600000),
    ("Carlos", "Gonzalez", "Ruiz", 59, "cgrrgc@correo.com", "1234", "6655-3214", "2101236050", false, "Empleado", "Administrativo", 450000),
    ("Maria ", "Perez", "Garcia", 40, "mariaperez@correo.com", "1234", "6389-9855", "1021020025", false, "Empleado", "Limpieza", 650700);

insert into persona (nombre, primerAp, segundoAp, edad, correo, password, telefono, cedula, estado, rol, departamento, salario, numeroColaboradores)
	values ("Diego", "Naranjo", "Meza", 19, "diego@correo.com", "1234", "8888-8888", "123456789", true, "Gerente", "Ventas", 600000, 5),
    ("Kanye", "Omari", "West", 46, "ye@correo.com", "1234", "8545-7412", "369852147", true, "Gerente", "TI", 450000, 8),
    ("Daniel ", "Jimenez", "Castro", 40, "future@correo.com", "1234", "7536-9514", "212123695", false, "Gerente", "Mercadeo", 650700, 15);