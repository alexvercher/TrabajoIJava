/*
 * * Clase Modelo con el formato de la tabla MODELOS
 */
package com.cice.model;

import com.cice.exceptions.NoValidoException;

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
    private static final String ERR_ID_MARCA = "La marca debe estar informada";
    private static final String ERR_MODELO = "El modelo ebe estar informado";
    private static final String ERR_CONSUMO = "El consumo debe ser mayor que cero";
    private static final String ERR_EMISIONES = "La emisión debe ser mayor que cero";
    private static final String ERR_C_ENERGETICA = "La certificación debe estar informada";

    /**
     * CONSTRUCTOR
     * @param idMarca: ID de la marca asociada al modelo
     * @param modelo: Descripción del modelo
     * @param consumo: Consumo del modelo
     * @param emisiones: Emisiones del modelo
     * @param cEnergetica: Clasificación energética asociada al modelo 
     */
    
    public Modelo(int idMarca, String modelo, float consumo, float emisiones, String cEnergetica) throws NoValidoException{
        validar(idMarca, modelo, consumo, emisiones, cEnergetica);
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

    /**
     * Validaciones principales
     * @param idMarca: Debe estar informada
     * @param modelo: Debe venir informado
     * @param consumo: Debe ser mayor que cero
     * @param emisiones: Debe ser mayor que cero
     * @param cEnergetica: Debe venir informado
     * @throws NoValidoException 
     */
    private void validar(int idMarca, String modelo, float consumo, float emisiones, String cEnergetica) throws NoValidoException{
        if (idMarca == 0){
            throw new NoValidoException(ERR_ID_MARCA);
        }
        if (modelo.trim().length() == 0){
            throw new NoValidoException(ERR_MODELO);
        }
        if (consumo == 0){
            throw new NoValidoException(ERR_CONSUMO);
        }
        if (emisiones == 0){
            throw new NoValidoException(ERR_EMISIONES);
        }
        if (cEnergetica.trim().length() == 0){
            throw new NoValidoException(ERR_C_ENERGETICA);
        }                
    }
}
