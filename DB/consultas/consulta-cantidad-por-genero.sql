SELECT g.nombre_genero , count(p.id_pelicula) as cantidad 
FROM peliculas  p
JOIN generos g 
ON g.id_genero = p.id_genero
GROUP BY 1
ORDER BY cantidad DESC;

