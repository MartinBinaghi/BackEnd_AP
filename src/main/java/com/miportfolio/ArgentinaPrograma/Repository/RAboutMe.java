package com.miportfolio.ArgentinaPrograma.Repository;

import com.miportfolio.ArgentinaPrograma.Entity.AboutMe;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RAboutMe extends JpaRepository<AboutMe, Integer>{
    public Optional<AboutMe> findByNombreA(String nombreA);
    public boolean existsByNombreA(String nombreA);
}
