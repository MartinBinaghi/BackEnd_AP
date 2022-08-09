package com.miportfolio.ArgentinaPrograma.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class AboutMe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull(message= "Debe introducir un nombre")
    @Size(min = 1, max = 50, message = "Nombre excede los 50 caracteres")
    private String nombreA;
    
    @NotNull(message= "Debe introducir un titular")
    @Size(min = 1, max = 50, message = "Titular excede los 50 caracteres")
    private String titularA;
    
    @Size(min = 0, max = 255, message = "Descripcion excede los 255 caracteres")
    private String descripcionA;
    private String imgA;

    public AboutMe() {
    }

    public AboutMe(String nombreA, String titularA, String descripcionA, String imgA) {
        this.nombreA = nombreA;
        this.titularA = titularA;
        this.descripcionA = descripcionA;
        this.imgA = imgA;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }
    
    public String getTitularA() {
        return titularA;
    }

    public void setTitularA(String titularA) {
        this.titularA = titularA;
    }

    public String getDescripcionA() {
        return descripcionA;
    }

    public void setDescripcionA(String descripcionA) {
        this.descripcionA = descripcionA;
    }

    public String getImgA() {
        return imgA;
    }

    public void setImgA(String imgA) {
        this.imgA = imgA;
    }
    
}
