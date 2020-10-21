-- create database prueba1;

CREATE TABLE Alumnos(
	NumMatricula INT primary key,
    Nombre varchar(50) NOT NULL,
    FechaNacimiento date not null,
    Telefono varchar(45) not null);
    
       
    CREATE TABLE Profesor(
    
    IdProfesor INT primary key,
    NIF_P varchar(45) UNIQUE,
   Nombre varchar(45) not null,
   Especialidad varchar(45) not null,
   Teléfono varchar(45) not null);
   
    
    CREATE TABLE Asignatura(
    CodAsignatura INT primary key,
    Nombre varchar(45) not null,
    IdProfesor INT not null,
    foreign key (IdProfesor) references Profesor(IdProfesor));
    
 
    
     CREATE TABLE Recibe(
    NumMatricula INT not null references Alumnnos(NumMatricula) ,
    CodAsignatura INT not null ,
    CursoEscolar varchar(50) not null references Asignatura(CodAsignatura),
    primary Key (NumMatricula,CodAsignatura)
    );
    
    
    
    CREATE TABLE Region(
		CodRegion INT primary Key,
        Nombre Varchar(45) not null
    );
    
    CREATE TABLE Provincia(
		
        CodProvincia INT primary key,
        Nombre varchar(45) not null,
        CodRegion int references Region(CodRegion)
        );
        
        CREATE TABLE Localidad(
        
        CodLocalidad int primary key,
        Nombre varchar(45) not null,
        CodProvincia INT references Provincia(CodProvincia)
        );
    
    
    
    CREATE TABLE Empleado(
		ID INT primary Key,
        DNI varchar(45) UNIQUE,
        Nombre varchar(45) not null,
        FechaNac Date not null,
        Teléfono varchar(45) not null,
        Salario INT not null,
        CodLocalidad INT not null references Localidad(CodLocalidad)
        );
    
    
    