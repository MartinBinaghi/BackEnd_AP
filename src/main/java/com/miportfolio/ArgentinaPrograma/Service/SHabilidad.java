package com.miportfolio.ArgentinaPrograma.Service;

import com.miportfolio.ArgentinaPrograma.Entity.Habilidad;
import com.miportfolio.ArgentinaPrograma.Repository.RHabilidad;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SHabilidad {
    @Autowired
    
    RHabilidad rHabilidad;
    
    public List<Habilidad> list(){
        return rHabilidad.findAll();
    }
    
    public Optional<Habilidad> getOne(int id){
        return rHabilidad.findById(id);
    }
     
    public Optional<Habilidad> getByTituloS(String tituloS){
        return rHabilidad.findByTituloS(tituloS);
    }
     
    public void save(Habilidad habilidad){
        rHabilidad.save(habilidad);
    }
     
    public void delete(int id){
        rHabilidad.deleteById(id);
    }
     
    public boolean existsById(int id){
        return rHabilidad.existsById(id);
    }
     
    public boolean existsByTituloS(String tituloS){
        return rHabilidad.existsByTituloS(tituloS);
    }
}
