

CREATE TABLE clientes(
ID int NOT NULL AUTO_INCREMENT,
DNI varchar(9),
Nombre varchar(30),
Direccion varchar(50),
Telefono integer(9),
Activo bit,
PRIMARY KEY (ID)
);
