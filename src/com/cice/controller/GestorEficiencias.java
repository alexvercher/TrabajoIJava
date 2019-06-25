/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.controller;

import com.cice.impl.EficienciaDAOImpl;
import com.cice.interfaces.IEficienciaDAO;
import com.cice.model.Eficiencia;
import java.util.List;

/**
 *
 * @author AVECH3H
 */
public class GestorEficiencias {
    private IEficienciaDAO eficiencia = new EficienciaDAOImpl();
    
    public List<Eficiencia> getEficiencias() throws Exception{
        return eficiencia.getEficiencias();
    }    
}
