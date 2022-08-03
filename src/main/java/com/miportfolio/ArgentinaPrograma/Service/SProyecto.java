package com.miportfolio.ArgentinaPrograma.Service;

import com.miportfolio.ArgentinaPrograma.Entity.Proyecto;
import com.miportfolio.ArgentinaPrograma.Repository.RProyecto;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyecto {
    @Autowired
    
    RProyecto rProyecto;
    
    public List<Proyecto> list(){
        return rProyecto.findAll();
    }
    
    public Optional<Proyecto> getOne(int id){
        return rProyecto.findById(id);
    }
     
    public Optional<Proyecto> getByTituloP(String tituloP){
        return rProyecto.findByTituloP(tituloP);
    }
     
    public void save(Proyecto expe){
        rProyecto.save(expe);
    }
     
    public void delete(int id){
        rProyecto.deleteById(id);
    }
     
    public boolean existsById(int id){
        return rProyecto.existsById(id);
    }
     
    public boolean existsByTituloP(String tituloP){
        return rProyecto.existsByTituloP(tituloP);
    }
    
}
