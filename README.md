# UniversoStarWarsApi

## Consultar a la Api de StarWars y Almacenar la información en una BD local

 ## Objetivos.

  ### 1.- Crear una conexión con la Api de Star Wars.

  ### 2.-Buscar los personajes por su Id y su nombre.

  ### 3.- Salvar los datos de los personas en un BD local.

  ### 4. La tabla la crea automaticamente Hibernate.

## Base de datos : Tabla  "personajesSW"

## Columnas: id name, height, mass, hair_color, skin_color, eye_color, birth_year, gender, url.

  ### 1.-Entidad en Java : Personaje. Mapear las columnas con atributos. Crear bean. @Entity.

  ### 2.-Repository en Java : @Repository public interface PersonajeRepo extends JpaRepository<Personaje, Integer.

  ### 3.-Servicio en Java: @Service AnimalService Inyectamos el repo -> @Autowired de PersonajeRepo.

  ### 4.-Controller en Java: @Controller AnimalController Inyectamos el service -> @Autowired de PersonajeService.

## Endpoints.

### GET /personaje/{id}.
  *Busca un personaje por ID, y muestra la información.    
### GET /personaje/id/guardar.
  *Lee la Api y Guarda el personaje en la BD Local, (Siempre y cuando este no se encuentre ya en esta, sino lo actualiza).
### GET personajeAPI/{id}/nombre.
  *Busca y muestra toda la información del personaje, la busquedad se realiza por (ID).
  
  
  ## Backend, Ada Itw 2021



