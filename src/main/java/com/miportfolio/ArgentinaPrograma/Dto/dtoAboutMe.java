package com.miportfolio.ArgentinaPrograma.Dto;

import javax.validation.constraints.NotBlank;

public class dtoAboutMe {
    @NotBlank
    private String nombreA;
    @NotBlank
    private String titularA;
    @NotBlank
    private String descripcionA;
    private String imgA;

    public dtoAboutMe() {
    }

    public dtoAboutMe(String nombreA, String titularA, String descripcionA, String imgA) {
        this.nombreA = nombreA;
        this.titularA = titularA;
        this.descripcionA = descripcionA;
        this.imgA = imgA;
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
