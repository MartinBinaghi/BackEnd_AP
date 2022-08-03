package com.miportfolio.ArgentinaPrograma.Dto;

import javax.validation.constraints.NotBlank;

public class dtoProyecto {
    @NotBlank
    private String tituloP;
    private String descripcionP;
    private String linkP;

    public dtoProyecto() {
    }

    public dtoProyecto(String tituloP, String descripcionP, String linkP) {
        this.tituloP = tituloP;
        this.descripcionP = descripcionP;
        this.linkP = linkP;
    }

    public String getTituloP() {
        return tituloP;
    }

    public void setTituloP(String tituloP) {
        this.tituloP = tituloP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }
    
    public String getLinkP() {
        return linkP;
    }

    public void setLinkP(String linkP) {
        this.linkP = linkP;
    }
    
    
}
