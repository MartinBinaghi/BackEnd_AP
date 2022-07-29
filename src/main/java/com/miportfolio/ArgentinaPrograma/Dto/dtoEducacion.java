package com.miportfolio.ArgentinaPrograma.Dto;

import javax.validation.constraints.NotBlank;

public class dtoEducacion {
    @NotBlank
    private String tituloEd;
    @NotBlank
    private String subtituloEd;
    @NotBlank
    private String descripcionEd;
    private boolean educacion__open;

    public dtoEducacion() {
    }

    public dtoEducacion(String tituloEd, String subtituloEd, String descripcionEd, boolean educacion__open) {
        this.tituloEd = tituloEd;
        this.subtituloEd = subtituloEd;
        this.descripcionEd = descripcionEd;
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

    public boolean getEducacion__open() {
        return educacion__open;
    }

    public void setEducacion__open(boolean educacion__open) {
        this.educacion__open = educacion__open;
    }
    
    
}
