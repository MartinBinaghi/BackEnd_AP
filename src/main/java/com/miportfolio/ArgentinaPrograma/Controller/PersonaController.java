package com.miportfolio.ArgentinaPrograma.Controller;

import com.miportfolio.ArgentinaPrograma.Entity.Persona;
import com.miportfolio.ArgentinaPrograma.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    
    @GetMapping("personas/traer")
    public List <Persona> getPersona() {
        return ipersonaService.getPersona();
    }
    
    @PostMapping("personas/crear")
    
    
}
