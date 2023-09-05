SELECT p.titulo, avg(c.puntuacion) as promedio
FROM peliculas p
JOIN calificaciones c 
ON p.id_pelicula = c.id_pelicula 
WHERE p.id_pelicula = 15;

