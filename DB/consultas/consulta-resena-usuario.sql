SELECT u.nombreusuario,  p.titulo,  c.resena 
FROM peliculas p
JOIN calificaciones c 
ON p.id_pelicula = c.id_pelicula 
JOIN usuarios u 
ON u.id_usuario  = c.id_usuario 
WHERE u.id_usuario  = 3;
