package com.example.universostarwaraapi.Controller;

import com.example.universostarwaraapi.Entity.Personaje;
import com.example.universostarwaraapi.Service.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@RestController
public class StarWarsController {
    public final PersonajeService personajeService;

    @Autowired
    public StarWarsController(PersonajeService personajeService) {
        this.personajeService = personajeService;
    }

    @GetMapping(value="/personaje/{id}/guardar", produces = "application/json")
    public Personaje leerAPIyGuardar(@PathVariable Integer id){
        RestTemplate apiStarWars = new RestTemplate();
        Personaje personaje = apiStarWars
                .getForEntity("https://swapi.dev/api/people/"+id+"/", Personaje.class)
                .getBody();
        personajeService.save(personaje);
        return personaje;
    }

    @GetMapping(value="/personaje/{id}", produces = "application/json")
    public Personaje getPersonajeLocalODeAPI(@PathVariable Integer id){
        Optional<Personaje> personaje = personajeService.findPersonajeById(id);
        return personaje.orElse(leerAPIyGuardar(id));
    }

    @GetMapping(value="/personajeAPI/{id}")
    public Personaje getPersonaje(@PathVariable Integer id){
        RestTemplate apiStarWars = new RestTemplate();
        ResponseEntity<Personaje> personaje = apiStarWars.getForEntity("https://swapi.dev/api/people/"+id+"/", Personaje.class);
        return personaje.getBody();
    }

    @GetMapping(value="/personajeAPI/{id}/nombre")
    public String getNombrePersonaje(@PathVariable Integer id){
        RestTemplate apiStarWars = new RestTemplate();
        ResponseEntity<Personaje> personaje = apiStarWars.getForEntity("https://swapi.dev/api/people/"+id+"/", Personaje.class);
        return personaje.getBody().getName();
    }

}
