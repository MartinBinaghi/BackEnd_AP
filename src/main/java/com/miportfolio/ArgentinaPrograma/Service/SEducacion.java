package com.miportfolio.ArgentinaPrograma.Service;

import com.miportfolio.ArgentinaPrograma.Entity.Educacion;
import com.miportfolio.ArgentinaPrograma.Repository.REducacion;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SEducacion {
    @Autowired
    
    REducacion rEducacion;
    
    public List<Educacion> list(){
        return rEducacion.findAll();
    }
    
    public Optional<Educacion> getOne(int id){
        return rEducacion.findById(id);
    }
     
    public Optional<Educacion> getByTituloEd(String tituloEd){
        return rEducacion.findByTituloEd(tituloEd);
    }
     
    public void save(Educacion educ){
        rEducacion.save(educ);
    }
     
    public void delete(int id){
        rEducacion.deleteById(id);
    }
     
    public boolean existsById(int id){
        return rEducacion.existsById(id);
    }
     
    public boolean existsByTituloEd(String tituloEd){
        return rEducacion.existsByTituloEd(tituloEd);
    }
    
    
}
