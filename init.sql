

drop table IF exists envios;
drop table IF exists lineaventa;
drop table IF exists ventas;
drop table IF exists clientes;
drop table IF exists producto;
drop  table IF exists personal;

CREATE TABLE clientes(
ID int NOT NULL unique AUTO_INCREMENT ,
DNI varchar(9) unique ,
Nombre varchar(30),
Direccion varchar(50),
Telefono integer(9),
Activo bit,
PRIMARY KEY (ID)
);


CREATE TABLE personal (
  ID int(11) NOT NULL unique AUTO_INCREMENT,
  PASS varchar(50) DEFAULT NULL,
  Activo int(11) DEFAULT NULL,
  Salario double DEFAULT NULL,
  Telefono int(9) DEFAULT NULL,
  Nombre varchar(30) DEFAULT NULL,
  PRIMARY KEY (ID)
);

CREATE TABLE ventas(
ID int(11) NOT NULL unique AUTO_INCREMENT,
precio float DEFAULT NULL,
fecha Date DEFAULT NULL,
pagado bit DEFAULT NULL,
devuelto bit DEFAULT NULL,
IDEnvio int DEFAULT null,
IDCliente  int DEFAULT NULL,
IDPersonal int default null,
PRIMARY KEY(ID),
constraint foreign key (IDCliente) references clientes(ID) ON DELETE CASCADE,
constraint foreign key (IDPersonal) references personal(ID) ON DELETE CASCADE
);

CREATE TABLE envios (
  ID int(11) NOT NULL unique AUTO_INCREMENT,
  Direccion varchar(50),
  Activo int(11),
  IDVenta int (11),
  PRIMARY KEY (ID),
  constraint foreign key (IDVenta) references ventas(ID) ON DELETE CASCADE

);
create table producto(
ID int (11) not null auto_increment,
Nombre varchar(50) unique,
Descripcion varchar (50),
precio float,
stock int,
primary key (ID)
);

CREATE TABLE lineaventa (
 IDVenta int(11) NOT NULL,
 IDProducto int(11) NOT NULL,
 cantidad int(11) NOT NULL,
 constraint FOREIGN KEY (IDVenta) REFERENCES ventas (ID) ON DELETE CASCADE,
 constraint FOREIGN KEY (IDProducto) REFERENCES producto (ID) ON DELETE CASCADE
);
