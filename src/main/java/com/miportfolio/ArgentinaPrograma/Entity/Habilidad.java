package com.miportfolio.ArgentinaPrograma.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Habilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull(message= "Debe introducir un porcentaje")
    private int porcentajeS;
    
    @NotNull(message= "Debe introducir una habilidad")
    @Size(min = 1, max = 25, message = "Habilidad excede los 25 caracteres")
    private String tituloS;
    private String imgS;

    public Habilidad() {
    }

    public Habilidad(int porcentajeS, String tituloS, String imgS) {
        this.porcentajeS = porcentajeS;
        this.tituloS = tituloS;
        this.imgS = imgS;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPorcentajeS() {
        return porcentajeS;
    }

    public void setPorcentajeS(int porcentajeS) {
        this.porcentajeS = porcentajeS;
    }

    public String getTituloS() {
        return tituloS;
    }

    public void setTituloS(String tituloS) {
        this.tituloS = tituloS;
    }

    public String getImgS() {
        return imgS;
    }

    public void setImgS(String imgS) {
        this.imgS = imgS;
    }
    
    
}
