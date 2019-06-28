/*
 * Interfaz para la construcción de la gestión de la tabla Modelos.
 * Se compone de 3 métodos:
 * - Añadir modelo
 * - Borrar modelo
 * - Recuperar los modelos de una marca
 */
package com.cice.interfaces;

import com.cice.model.Modelo;
import java.util.List;

/**
 *
 * @author AVECH3H
 */
public interface IModeloDAO {
    
    public void add(Modelo modelo) throws Exception;
    public void delete(int idModelo) throws Exception;
    public List<Modelo> getModelosMarca(int id) throws Exception;
}
