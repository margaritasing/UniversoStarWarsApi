package com.example.universostarwaraapi.Repository;

import com.example.universostarwaraapi.Entity.Personaje;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonajeRepo extends JpaRepository<Personaje, Integer> {

    Optional<Personaje> findById(Integer id);

    Personaje save(Personaje personaje);
}
