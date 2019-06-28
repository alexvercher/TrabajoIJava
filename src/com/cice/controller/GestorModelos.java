/*
 * Gestión de modelos. Recupera una lista de modelos según la marca
 */
package com.cice.controller;

import com.cice.dao.ModeloDAOImpl;
import com.cice.interfaces.IModeloDAO;
import com.cice.model.Modelo;
import java.util.List;

/**
 *
 * @author AVECH3H
 */
public class GestorModelos {

    private IModeloDAO modeloImpl = new ModeloDAOImpl();

    /**
     *
     * @param idMarca: Marca de la cual se quiere la lista de modelos
     * @return Retornará la lista de Modelos de la marca seleccionada
     * @throws Exception excepción proviente de la llamada a la clase de
     * implementación
     */
    public List<Modelo> getModelosMarca(int idMarca) throws Exception {
        return modeloImpl.getModelosMarca(idMarca);
    }

    /**
     *
     * @param modelo modelo que se quiere añadir
     * @throws Exception excepción proviente de la llamada a la clase de
     * implementación
     */
    public void addModelo(Modelo modelo) throws Exception {
        modeloImpl.add(modelo);
    }

    /**
     *
     * @param idModelo id del modelo que se quiere borrar
     * @throws Exception excepción proviente de la llamada a la clase de implementación
     */
    public void deleteModelo(int idModelo) throws Exception {
        modeloImpl.delete(idModelo);
    }
}
