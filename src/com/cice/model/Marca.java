/*
 * Clase Model con el formato de la tabla MARCAS
 */
package com.cice.model;

/**
 *
 * @author AVECH3H
 */
public class Marca {

    private int idMarca;
    private String descMarca;

    /**
     * 
     * @param idMarca: Id único de la marca
     * @param descMarca: Descripción de la marca 
     */
    public Marca(int idMarca, String descMarca) {
        this.idMarca = idMarca;
        this.descMarca = descMarca;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getDescMarca() {
        return descMarca;
    }

    public void setDescMarca(String descMarca) {
        this.descMarca = descMarca;
    }

}
