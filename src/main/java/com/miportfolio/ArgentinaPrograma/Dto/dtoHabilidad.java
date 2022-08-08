package com.miportfolio.ArgentinaPrograma.Dto;

import javax.validation.constraints.NotBlank;

public class dtoHabilidad {
    @NotBlank
    private int porcentajeS;
    @NotBlank
    private String tituloS;
    private String imgS;

    public dtoHabilidad() {
    }

    public dtoHabilidad(int porcentajeS, String tituloS, String imgS) {
        this.porcentajeS = porcentajeS;
        this.tituloS = tituloS;
        this.imgS = imgS;
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
