package com.miportfolio.ArgentinaPrograma.Repository;

import com.miportfolio.ArgentinaPrograma.Entity.Habilidad;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RHabilidad extends JpaRepository<Habilidad, Integer>{
    public Optional<Habilidad> findByTituloS(String tituloS);
    public boolean existsByTituloS(String tituloS);
}
