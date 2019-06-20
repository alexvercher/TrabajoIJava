/*
 * Clase Modelo con el formato de la tabla EFICIENCIAS
 */
package com.cice.model;

/**
 *
 * @author AVECH3H
 */
public class Eficiencia {
    
    private String cEnergetica;
    private String descripcion;
    private String icon;

    public Eficiencia(String CEnergetica, String Descripcion, String Icono) {
        this.cEnergetica = CEnergetica;
        this.descripcion = Descripcion;
        this.icon = Icono;
    }

    public String getcEnergetica() {
        return cEnergetica;
    }

    public void setcEnergetica(String cEnergetica) {
        this.cEnergetica = cEnergetica;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
    
    
}
