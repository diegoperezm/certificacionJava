
SELECT p.titulo , g.nombre_genero,  p.anio_lanzamiento  
FROM peliculas  p
JOIN generos g 
ON g.id_genero = p.id_genero
ORDER BY p.anio_lanzamiento ASC;
