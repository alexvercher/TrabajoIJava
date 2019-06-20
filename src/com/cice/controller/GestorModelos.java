/*
 * Clase encargada del acceso a BBDD, así como el matenimiento de la tabla Modelos
 */
package com.cice.controller;

import com.cice.interfaces.IModeloDAO;
import com.cice.model.Modelo;
import java.util.List;

/**
 *
 * @author AVECH3H
 */
public class GestorModelos{
  
    private IModeloDAO modelo;
    
    /**
     * 
     * @param idMarca Marca de la cual se quiere la lista de modelos
     * @return Retornará la lista de Modelos de la marca seleccionada
     */
    public List<Modelo> getModelosMarca(int idMarca) throws Exception{
        return modelo.getModelosMarca(idMarca);
    }
}
