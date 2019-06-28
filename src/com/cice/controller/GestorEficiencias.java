/*
 * Gestión de las eficiencias. Devuelve una lista de las eficiencias
 */
package com.cice.controller;

import com.cice.dao.EficienciaDAOImpl;
import com.cice.interfaces.IEficienciaDAO;
import com.cice.model.Eficiencia;
import java.util.List;

/**
 *
 * @author AVECH3H
 */
public class GestorEficiencias {
    private IEficienciaDAO eficiencia = new EficienciaDAOImpl();

/**
 * 
 * @return lista de eficiencias
 * @throws Exception excepción proviene de la llamada a la clase de implementación
 */    
    public List<Eficiencia> getEficiencias() throws Exception{
        return eficiencia.getEficiencias();
    }    
}
