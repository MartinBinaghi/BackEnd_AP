package com.miportfolio.ArgentinaPrograma.Repository;

import com.miportfolio.ArgentinaPrograma.Entity.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RPersona extends JpaRepository<Persona, Long>{
    public Optional<Persona> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
