

CREATE TABLE clientes(
ID int NOT NULL unique AUTO_INCREMENT ,
DNI varchar(9),
Nombre varchar(30),
Direccion varchar(50),
Telefono integer(9),
Activo bit,
PRIMARY KEY (ID)
);

alter TABLE clientes;
set AUTO_INCREMENT(0);

CREATE TABLE envios (
  ID int(11) NOT NULL unique AUTO_INCREMENT,
  Direccion varchar(50),
  Activo int(11),
  PRIMARY KEY (ID)
);
