SELECT p.titulo, avg(c.puntuacion) as promedio
FROM peliculas p
JOIN calificaciones c 
ON p.id_pelicula = c.id_pelicula 
group by p.titulo 
order by 2 DESC
limit 3;

