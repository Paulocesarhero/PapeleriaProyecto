/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Papeleria;

/**
 *
 * @author paulo
 */
public class Arte {
    private Producto colores;
    private Producto crayolas;
    private Producto pinturasVinilicas;
    private Producto acuarelas;
    private Producto pinceles;

    public Arte(Producto colores, Producto crayolas, Producto pinturasVinilicas, Producto acuarelas, Producto pinceles) {
        this.colores = colores;
        this.crayolas = crayolas;
        this.pinturasVinilicas = pinturasVinilicas;
        this.acuarelas = acuarelas;
        this.pinceles = pinceles;
    }

    public Producto getColores() {
        return colores;
    }

    public void setColores(Producto colores) {
        this.colores = colores;
    }

    public Producto getCrayolas() {
        return crayolas;
    }

    public void setCrayolas(Producto crayolas) {
        this.crayolas = crayolas;
    }

    public Producto getPinturasVinilicas() {
        return pinturasVinilicas;
    }

    public void setPinturasVinilicas(Producto pinturasVinilicas) {
        this.pinturasVinilicas = pinturasVinilicas;
    }

    public Producto getAcuarelas() {
        return acuarelas;
    }

    public void setAcuarelas(Producto acuarelas) {
        this.acuarelas = acuarelas;
    }

    public Producto getPinceles() {
        return pinceles;
    }

    public void setPinceles(Producto pinceles) {
        this.pinceles = pinceles;
    }

    
    
    
    
    
}
