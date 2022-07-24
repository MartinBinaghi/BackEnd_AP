package com.miportfolio.ArgentinaPrograma.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private boolean experiencia__open = true;
    private String nombreE;
    private String subtituloE;
    private String descripcionE;

    public Experiencia() {
    }

    public Experiencia(String nombreE, String subtituloE, String descripcionE, boolean experiencia__open) {
        this.nombreE = nombreE;
        this.subtituloE = subtituloE;
        this.descripcionE = descripcionE;
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

}



