

# _UniversoStarWarsApi_
## _Consultar a la Api de StarWars y Almacenar la información en una BD local._
## _Para lo cual se utiliza el Framework Spring

## _Objetivos._
- ### Crear una conexión con la Api de Star Wars.
* ### Buscar los personajes por su Id y su nombre.
- ### Salvar los datos de los personas en un BD local.
* ### La tabla la crea automaticamente Hibernate.

## _Manifestación_
- ### Si quieres ver  este proyecto desplegada, tienes que colocar en tu navegador de elección  _localhost:8080/_

## _Base de datos : Tabla  "personajesSW"_
## _Columnas: id name, height, mass, hair_color, skin_color, eye_color, birth_year, gender, url._

* ### Entidad en Java : Personaje. Mapear las columnas con atributos. Crear bean. @Entity.
* ### Repository en Java : @Repository public interface PersonajeRepo extends JpaRepository<Personaje, Integer.
* ### Servicio en Java: @Service AnimalService Inyectamos el repo -> @Autowired de PersonajeRepo.
* ### Controller en Java: @Controller AnimalController Inyectamos el service -> @Autowired de PersonajeService.

## _Endpoints._
### GET /personaje/{id}.
  * #### Busca un personaje por ID, y muestra la información.    
### GET /personaje/id/guardar.
  * #### Lee la Api y Guarda el personaje en la BD Local, (Siempre y cuando este no se encuentre ya en esta, sino lo actualiza).
### GET personajeAPI/{id}/nombre.
  * #### Busca y muestra toda la información del personaje, la busquedad se realiza por (ID).
  
  
# _Backend, Ada Itw 2021_

