package com.miportfolio.ArgentinaPrograma.Service;

import com.miportfolio.ArgentinaPrograma.Entity.AboutMe;
import com.miportfolio.ArgentinaPrograma.Repository.RAboutMe;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SAboutMe {
    @Autowired
    
    RAboutMe rAboutMe;
    
    public List<AboutMe> list(){
        return rAboutMe.findAll();
    }
    
    public Optional<AboutMe> getOne(int id){
        return rAboutMe.findById(id);
    }
     
    public Optional<AboutMe> getByNombreA(String nombreA){
        return rAboutMe.findByNombreA(nombreA);
    }
     
    public void save(AboutMe about){
        rAboutMe.save(about);
    }
     
    public void delete(int id){
        rAboutMe.deleteById(id);
    }
     
    public boolean existsById(int id){
        return rAboutMe.existsById(id);
    }
     
    public boolean existsByNombreA(String nombreA){
        return rAboutMe.existsByNombreA(nombreA);
    }
}
