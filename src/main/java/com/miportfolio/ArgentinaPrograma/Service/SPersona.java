package com.miportfolio.ArgentinaPrograma.Service;

import com.miportfolio.ArgentinaPrograma.Entity.Persona;
import com.miportfolio.ArgentinaPrograma.Repository.RPersona;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SPersona {
    @Autowired
    
    RPersona rPersona;
    
    public List<Persona> list(){
        return rPersona.findAll();
    }
    
    public Optional<Persona> getOne(long id){
        return rPersona.findById(id);
    }
     
    public Optional<Persona> getByNombre(String Nombre){
        return rPersona.findByNombre(Nombre);
    }
     
    public void save(Persona educ){
        rPersona.save(educ);
    }
     
    public void delete(long id){
        rPersona.deleteById(id);
    }
     
    public boolean existsById(long id){
        return rPersona.existsById(id);
    }
     
    public boolean existsByNombre(String Nombre){
        return rPersona.existsByNombre(Nombre);
    }
    
    
}
