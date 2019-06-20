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
    
    public void add(Modelo modelo);
    public void delete(Modelo modelo);
    public Modelo findById(int id);
    public List<Modelo> getModelosMarca(int id) throws Exception;
    public List<Modelo> getAllModelos();
}
