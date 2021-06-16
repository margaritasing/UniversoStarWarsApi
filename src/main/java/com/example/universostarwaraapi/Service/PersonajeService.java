package com.example.universostarwaraapi.Service;

import com.example.universostarwaraapi.Entity.Personaje;
import com.example.universostarwaraapi.Repository.PersonajeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonajeService {
    public final PersonajeRepo personajeRepo;


    @Autowired
    public PersonajeService(PersonajeRepo personajeRepo) {
        this.personajeRepo = personajeRepo;
    }

    public Personaje save(Personaje personaje) {
        personaje.corregirID();
        return personajeRepo.save(personaje);
    }

    public Optional<Personaje> findPersonajeById(Integer id) {
        return personajeRepo.findById(id);
    }
}
