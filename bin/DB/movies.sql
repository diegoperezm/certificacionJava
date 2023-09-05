CREATE SCHEMA IF NOT EXISTS `movies` DEFAULT CHARACTER SET utf8 ;
USE movies;

CREATE TABLE IF NOT EXISTS usuarios (
    id_usuario INT PRIMARY KEY,
    nombreusuario VARCHAR(100),
    correoelectronico VARCHAR(100),
    contrasena VARCHAR(254)
);
CREATE TABLE IF NOT EXISTS generos (
    id_genero INT PRIMARY KEY,
    nombre_genero VARCHAR(100)
);
CREATE TABLE IF NOT EXISTS peliculas (
    id_pelicula INT PRIMARY KEY,
    titulo VARCHAR(255),
    anio_lanzamiento INT,
    id_genero INT,
    FOREIGN KEY (id_genero) REFERENCES generos(id_genero)
);
CREATE TABLE  IF NOT EXISTS calificaciones (
    id_calificacion INT PRIMARY KEY,
    id_pelicula INT,     
    id_usuario INT,
    puntuacion INT,
    resena TEXT,
    FOREIGN KEY (id_pelicula) REFERENCES peliculas(id_pelicula),
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario)
);

-- Carga de datos, Generos
insert into generos (id_genero, nombre_genero) 
values (1,'Infantil'),
(2, 'Familia'),
(3, 'Suspenso'),
(4, 'Terror'),
(5, 'AcciÃ³n'),
(6,'Drama'),
(7, 'Comedia'),
(8, 'Ciencia FicciÃ³n'),
(9, 'Romance'),
(10, 'Documental');

-- Carga de datos, Usuarios
insert into usuarios (id_usuario, nombreusuario, correoelectronico, contrasena)
values (1,'usuario1','usuario1@servidor.com','123456'),
(2,'usuario2','usuario2@servidor.com','654321'),
(3,'usuario3','usuario3@servidor.com','854321'),
(4,'usuario4','usuario4@servidor.com','654351'),
(5,'usuario5','usuario5@servidor.com','659321'),
(6,'usuario6','usuario6@servidor.com','650321'),
(7,'usuario7','usuario7@servidor.com','654329'),
(8,'usuario8','usuario8@servidor.com','954321'),
(9,'usuario9','usuario9@servidor.com','154321'),
(10,'usuario10','usuario10@servidor.com','753391');

-- Carga de datos, Peliculas
insert into peliculas (id_pelicula, titulo, anio_lanzamiento, id_genero)
values (1,"the lion king", 2019, 2),
(2,"Mowgli: Legend of the jungle", 2018, 1),
(3,"Doctor Strange",2016, 3),
(4,"John Wick",2014,5),
(5,"the notebook",2004, 9),
(6,"alias",2022,5),
(7,"the shining",1980,4),
(8,"la cosa",1982,3),
(9,"y donde estÃ¡ el fantasma",2013,7),
(10,"lady bird",2017,6),
(11,"historia de un matrimonio",2019,6),
(12,"moonage daydream",2022,10),
(13,"nop",2022,8),
(14,"paradise",2023,8),
(15,"El lorax",2012,1),
(16,"los goonies",1985,2),
(17,"el pacto",2023,3),
(18,"halloween",1978,4),
(19,"asesino sin memoria",2022,5),
(20,"misantropo",2023,3);

-- Carga de datos, calificaciones
insert into calificaciones (id_calificacion, id_pelicula, id_usuario, puntuacion, resena)
values (1,1,1,5,"Muy bonita"),
(2,2,2,5,"Divertida"),
(3,3,3,2,"No me gusta el terror"),
(4,4,4,5,"demasiada acciÃ³n"),
(5,5,5,1,"muy empalagosa"),
(6,6,6,3,"guion copiado"),
(7,7,7,5,"obra maestra"),
(8,8,8,4,"adelanta a sus tiempo"),
(9,9,9,5,"muy cÃ³mica"),
(10,10,10,3,"interesante"),
(11,11,2,2,"muy triste"),
(12,12,1,5,"grande davie!"),
(13,13,5,4,"algo sin sentido"),
(14,14,3,3,"algo inquientante"),
(15,15,4,5,"bonito mensaje"),
(16,16,8,5,"muy divertida"),
(17,17,6,5,"buena peli"),
(18,18,7,5,"peliculon"),
(19,19,9,3,"distrae..."),
(20,20,10,4,"mas o menos");

