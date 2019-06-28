/*
 * Clase enum con las posibles CERTIFICACIONES ENERGÉTICAS
 */
package com.cice.controller;

/**
 *
 * @author AVECH3H
 */
public enum EnumEficiencias {
    CA("A", "CLASIFICACION ENERGETICA A"), 
    CB("B", "CLASIFICACION ENERGETICA B"), 
    CC("C", "CLASIFICACION ENERGETICA C"), 
    CD("D", "CLASIFICACION ENERGETICA D"), 
    CE("E", "CLASIFICACION ENERGETICA E"), 
    CF("F", "CLASIFICACION ENERGETICA F"), 
    CG("G", "CLASIFICACION ENERGETICA G"), 
    NA("NA", "NO DISPONIBLE");
    
    private String letra;
    private String texto;
    
    /**
     * 
     * @param letra --> Letra correspondiente a la clasificación energética
     * @param texto --> Descripción de las clasificaciones energéticas
     */
    private EnumEficiencias(String letra, String texto){
        this.letra = letra;
        this.texto = texto;
    } 

    public String getLetra() {
        return letra;
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public String toString() {
        return texto;
    }
    
}
