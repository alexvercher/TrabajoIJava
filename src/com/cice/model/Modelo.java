/*
 * * Clase Modelo con el formato de la tabla MODELOS
 */
package com.cice.model;

/**
 *
 * @author AVECH3H
 */
public class Modelo {

    private int id;
    private int idMarca;
    private String modelo;
    private float consumo;
    private float emisiones;
    private String cEnergetica;

    public Modelo(int idMarca, String modelo, float consumo, float emisiones, String cEnergetica) {
        this.idMarca = idMarca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.emisiones = emisiones;
        this.cEnergetica = cEnergetica;
    }

    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public float getEmisiones() {
        return emisiones;
    }

    public void setEmisiones(float emisiones) {
        this.emisiones = emisiones;
    }

    public String getcEnergetica() {
        return cEnergetica;
    }

    public void setcEnergetica(String cEnergetica) {
        this.cEnergetica = cEnergetica;
    }

    @Override
    public String toString() {
        return "Modelo{id=" + id + "idMarca=" + idMarca + ", modelo=" + modelo + ", consumo=" + consumo + ", emisiones=" + emisiones + ", cEnergetica=" + cEnergetica + '}';
    }

    
}
