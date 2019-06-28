/*
 * Gestión de las marcas de coches. Devuelve la lista de marcas
 */
package com.cice.controller;

import com.cice.dao.MarcaDAOImpl;
import com.cice.interfaces.IMarcaDAO;
import com.cice.model.Marca;
import java.util.List;

/**
 *
 * @author AVECH3H
 */
public class GestorMarcas {
    
    private IMarcaDAO marca = new MarcaDAOImpl();
    
    public List<Marca> getMarcas() throws Exception{
        return marca.getMarcas();
    }
}
