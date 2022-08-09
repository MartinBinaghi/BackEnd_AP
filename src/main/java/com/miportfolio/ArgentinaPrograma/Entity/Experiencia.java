package com.miportfolio.ArgentinaPrograma.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private boolean experiencia__open = true;
    
    @NotNull(message= "Debe introducir un cargo")
    @Size(min = 1, max = 50, message = "Cargo excede los 50 caracteres")
    private String nombreE;
    
    @NotNull(message= "Debe introducir una empresa")
    @Size(min = 1, max = 50, message = "Empresa excede los 50 caracteres")
    private String subtituloE;
    
    @Size(min = 0, max = 255, message = "Descripcion excede los 255 caracteres")
    private String descripcionE;
    private String imgE;

    public Experiencia() {
    }

    public Experiencia(String nombreE, String subtituloE, String descripcionE, String imgE, boolean experiencia__open) {
        this.nombreE = nombreE;
        this.subtituloE = subtituloE;
        this.descripcionE = descripcionE;
        this.imgE = imgE;
        this.experiencia__open = experiencia__open;
    }
    
    
    public boolean getExperiencia__open() {
        return experiencia__open;
    }

    public void setExperiencia__open(boolean experiencia__open) {
        this.experiencia__open = experiencia__open;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }
    
    public String getSubtituloE() {
        return subtituloE;
    }

    public void setSubtituloE(String subtituloE) {
        this.subtituloE = subtituloE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }
    
    public String getImgE() {
        return imgE;
    }

    public void setImgE(String imgE) {
        this.imgE = imgE;
    }

}



