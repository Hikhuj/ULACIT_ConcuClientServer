DROP DATABASE IF EXISTS `proyectofinal`;
CREATE DATABASE IF NOT EXISTS `proyectofinal` DEFAULT CHARACTER SET utf8mb4;
USE proyectofinal;

DROP TABLE IF EXISTS `local_comercial`;
DROP TABLE IF EXISTS `empleado`;
DROP TABLE IF EXISTS `factura`;
DROP TABLE IF EXISTS `cliente`;
DROP TABLE IF EXISTS `contacto_proveedor`;
DROP TABLE IF EXISTS `proveedor`;
DROP TABLE IF EXISTS `articulo`;

CREATE TABLE local_comercial (
	id INT NOT NULL AUTO_INCREMENT,
	direccion1 VARCHAR(100) NOT NULL,
	direccion2 VARCHAR(100) NOT NULL,
	provincia VARCHAR(20) NOT NULL,
	canton VARCHAR(50) NOT NULL,
	distrito VARCHAR(50) NOT NULL,
	telefono INT,
	email VARCHAR(100),
	PRIMARY KEY ( id )
);

CREATE TABLE empleado (
	id INT NOT NULL AUTO_INCREMENT,
	usuario VARCHAR(100) NOT NULL,
	contrasenia VARCHAR(100) NOT NULL,
	nombre1 VARCHAR(100) NOT NULL,
	nombre2 VARCHAR(100),
	apellido1 VARCHAR(100) NOT NULL,
	apellido2 VARCHAR(100),
	email VARCHAR(255),
	tipoUsuario CHAR,
	clienteAtendido INT,
	visitaRealizada INT,
	horarioDefinido VARCHAR(100),
	asignarLocal VARCHAR(100),
	descuento INT,
	PRIMARY KEY ( id )
);

CREATE TABLE factura (
	id INT NOT NULL AUTO_INCREMENT,
	idCliente INT NOT NULL,
	email VARCHAR(255) NOT NULL,
	nombre VARCHAR(100) NOT NULL,
	nombreCajero VARCHAR(100) NOT NULL,
	fecha DATE,
	hora TIME,
	listaArticulos VARCHAR(255),
	subtotal INT,
	impuesto DECIMAL(20,2),
	total DECIMAL(20,2),
	PRIMARY KEY ( id )
);

CREATE TABLE cliente (
	id INT NOT NULL AUTO_INCREMENT,
	nombre1 VARCHAR(100) NOT NULL,
	nombre2 VARCHAR(100) NOT NULL,
	apellido1 VARCHAR(100) NOT NULL,
	apellido2 VARCHAR(100),
	email VARCHAR(100),
	PRIMARY KEY ( id )
);

CREATE TABLE contacto_proveedor (
	id INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    apellido1 VARCHAR(100) NOT NULL,
    apellido2 VARCHAR(100),
    telefono INT,
    email VARCHAR(100),
    PRIMARY KEY ( id )
);

CREATE TABLE proveedor (
	id INT NOT NULL AUTO_INCREMENT,
    proveedorNombre VARCHAR(100) NOT NULL,
    contactoProveedor INT,
    correo VARCHAR(100) NOT NULL,
    telefono1 INT NOT NULL,
    telefono2 INT,
    direccion VARCHAR(255),
    PRIMARY KEY ( id ),
    FOREIGN KEY (contactoProveedor) REFERENCES contacto_proveedor(id)
);

CREATE TABLE articulo (
	id INT NOT NULL AUTO_INCREMENT,
	descripcion VARCHAR(200) NOT NULL,
	precio DECIMAL NOT NULL,
	categoria VARCHAR(100) NOT NULL,
	disponible VARCHAR(1),
	idProveedor INT,
	cantidadDisponible INT,
	PRIMARY KEY (id),
	FOREIGN KEY (idProveedor) REFERENCES proveedor(id)
);

