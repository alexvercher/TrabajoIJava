/*
 * Clase Modelo con el formato de la tabla EFICIENCIAS
 */
package com.cice.model;

import com.cice.exceptions.NoValidoException;

/**
 *
 * @author AVECH3H
 */
public class Eficiencia {

    //Constantes
    private static final String ERR_C_ENERGETICA = "La clasificación energética debe estar informada";
    private static final String ERR_DESCRIPCION = "La descripción debe estar informada";
    private static final String ERR_ICONO = "El icono debe estar informado";

    //Variables
    private String cEnergetica;
    private String descripcion;
    private String icon;

    /**
     * 
     * @param cEnergetica: Clasificación energética
     * @param descripcion: Descripción de la eficiencia
     * @param icono: Imagen de la eficiencia
     * @throws NoValidoException 
     */
    public Eficiencia(String cEnergetica, String descripcion, String icono){
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
