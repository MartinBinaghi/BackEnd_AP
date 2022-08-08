package com.miportfolio.ArgentinaPrograma.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Habilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int porcentajeS;
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
