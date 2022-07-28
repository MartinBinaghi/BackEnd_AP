package com.miportfolio.ArgentinaPrograma.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private boolean educacion__open = true;
    private String tituloEd;
    private String subtituloEd;
    private String descripcionEd;
    
    public Educacion() {
    }

    public Educacion(String tituloEd, String subtituloEd, String descripcionEd, boolean educacion__open) {
        this.tituloEd = tituloEd;
        this.subtituloEd = subtituloEd;
        this.descripcionEd = descripcionEd;
        this.educacion__open = educacion__open;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEducacion__open() {
        return educacion__open;
    }

    public void setEducacion__open(boolean educacion__open) {
        this.educacion__open = educacion__open;
    }

    public String getTituloEd() {
        return tituloEd;
    }

    public void setTituloEd(String tituloEd) {
        this.tituloEd = tituloEd;
    }

    public String getSubtituloEd() {
        return subtituloEd;
    }

    public void setSubtituloEd(String subtituloEd) {
        this.subtituloEd = subtituloEd;
    }

    public String getDescripcionEd() {
        return descripcionEd;
    }

    public void setDescripcionEd(String descripcionEd) {
        this.descripcionEd = descripcionEd;
    }
    
    
    
    
    
    
}
