# Examen de Certificación Java, Awakelab 
# Desarrollo de aplicaciones FullStack Java, 0056
# Diego Alonso Pérez Muñoz
---

## Base De Datos

La base de datos y las consultas se encuentran en la carpeta "DB".

## Configuración

Descargar proyecto:

````sh
git clone https://github.com/diegoperezm/certificacionJava.git
```

Ejecutar el script movies.sql que se encuentra en la carpeta `DB`


## Seguridad

El proyecto utiliza `Spring Security´ por lo cual requiere:
 - nombre de usuario (Username)
 - contraseña (Password) 

El nombre de usuario es "user" (sin comillas).
La contraseña se mostrará en la consola del IDE (ejemplo: Using generated security password: ddf6be70-e5f9-4afc-906e-750a2ee2e050)

## Endpoints

El proyecto consiste de los siguientes endpoints:
 - login 
 - El endpoint "/"  corresponde a la lista de películas
 - El endpoint "/listadoPeliculas" corresponde a un controlador, que renderiza  la página "listadopeliculas.html"
 - En la página "listadopeliculas.html" existe el botón "calificar" que redirecciona al endpoint "/calificarPelicula"
 - El endpoint "/calificarPelicula" corresponde a un controlador, que renderiza el formulario"calificar.hml"
 - El endpoint "/api/v1/peliculas" corresponde a un Rest controller, que entrega información de las películas






