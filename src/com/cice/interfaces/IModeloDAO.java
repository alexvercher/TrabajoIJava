/*
 * Interfaz para la construcción de la gestión de la tabla Modelos
 */
package com.cice.interfaces;

import com.cice.model.Modelo;
import java.sql.SQLException;
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
