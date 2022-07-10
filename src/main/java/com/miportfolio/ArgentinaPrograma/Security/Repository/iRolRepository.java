package com.miportfolio.ArgentinaPrograma.Security.Repository;

import com.miportfolio.ArgentinaPrograma.Security.Entity.Rol;
import com.miportfolio.ArgentinaPrograma.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
