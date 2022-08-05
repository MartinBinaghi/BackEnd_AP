package com.miportfolio.ArgentinaPrograma.Controller;

import com.miportfolio.ArgentinaPrograma.Dto.dtoAboutMe;
import com.miportfolio.ArgentinaPrograma.Entity.AboutMe;
import com.miportfolio.ArgentinaPrograma.Security.Controller.Mensaje;
import com.miportfolio.ArgentinaPrograma.Service.SAboutMe;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aboutme")
@CrossOrigin(origins = "http://localhost:4200")
public class CAboutMe {
    @Autowired
    SAboutMe sAboutMe;
    
    @GetMapping("/lista")
    public ResponseEntity<List<AboutMe>> list(){
        List<AboutMe> list = sAboutMe.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<AboutMe> getById(@PathVariable("id") int id){
        if(!sAboutMe.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        AboutMe aboutMe = sAboutMe.getOne(id).get();
        return new ResponseEntity(aboutMe, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sAboutMe.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        sAboutMe.delete(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoAboutMe dtoabt){      
        if(StringUtils.isBlank(dtoabt.getNombreA()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(sAboutMe.existsByNombreA(dtoabt.getNombreA()))
            return new ResponseEntity(new Mensaje("Esa aboutMe existe"), HttpStatus.BAD_REQUEST);
        
        AboutMe aboutMe = new AboutMe(dtoabt.getNombreA(), dtoabt.getTitularA(), dtoabt.getDescripcionA(), dtoabt.getImgA());
        sAboutMe.save(aboutMe);
        
        return new ResponseEntity(new Mensaje("AboutMe agregada"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoAboutMe dtoabt){
        //Validamos si existe el ID
        if(!sAboutMe.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        //Compara nombre de experiencias
        if(sAboutMe.existsByNombreA(dtoabt.getNombreA()) && sAboutMe.getByNombreA(dtoabt.getNombreA()).get().getId() != id)
            return new ResponseEntity(new Mensaje("Esa persona ya existe"), HttpStatus.BAD_REQUEST);
        //No puede estar vacio
        if(StringUtils.isBlank(dtoabt.getNombreA()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        AboutMe experiencia = sAboutMe.getOne(id).get();
        experiencia.setNombreA(dtoabt.getNombreA());
        experiencia.setTitularA(dtoabt.getTitularA());
        experiencia.setDescripcionA(dtoabt.getDescripcionA());
        experiencia.setImgA(dtoabt.getImgA());
        
        sAboutMe.save(experiencia);
        return new ResponseEntity(new Mensaje("AboutMe actualizada"), HttpStatus.OK);
             
    }
}
