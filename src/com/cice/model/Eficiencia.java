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

    public Eficiencia(String cEnergetica, String descripcion, String icono) {
        this.cEnergetica = cEnergetica;
        this.descripcion = descripcion;
        this.icon = icono;
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
