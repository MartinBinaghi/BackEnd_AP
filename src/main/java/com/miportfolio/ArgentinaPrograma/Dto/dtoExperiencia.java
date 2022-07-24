package com.miportfolio.ArgentinaPrograma.Dto;

import javax.validation.constraints.NotBlank;

public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String subtituloE;
    @NotBlank
    private String descripcionE;
    private boolean experiencia__open;

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String subtituloE, String descripcionE, boolean experiencia__open) {
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
