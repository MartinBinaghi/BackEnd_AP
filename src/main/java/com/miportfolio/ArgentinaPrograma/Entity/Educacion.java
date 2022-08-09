package com.miportfolio.ArgentinaPrograma.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private boolean educacion__open = true;
    
    @NotNull(message = "Debe introducir un titulo")
    @Size(min = 1, max = 50, message = "Titulo excede los 50 caracteres")
    private String tituloEd;
    
    @NotNull(message = "Debe introducir una institucion")
    @Size(min = 1, max = 50, message = "Institucion excede los 50 caracteres")
    private String subtituloEd;
    
    @Size(min = 0, max = 500, message = "Descripcion excede los 255 caracteres")
    private String descripcionEd;
    private String imgEd;
    
    public Educacion() {
    }

    public Educacion(String tituloEd, String subtituloEd, String descripcionEd, String imgEd, boolean educacion__open) {
        this.tituloEd = tituloEd;
        this.subtituloEd = subtituloEd;
        this.descripcionEd = descripcionEd;
        this.imgEd = imgEd;
        this.educacion__open = educacion__open;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getEducacion__open() {
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
    
    public String getImgEd() {
        return imgEd;
    }

    public void setImgEd(String imgEd) {
        this.imgEd = imgEd;
    }
}
