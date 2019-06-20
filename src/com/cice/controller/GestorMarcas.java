/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.controller;

import com.cice.impl.MarcaDAOImpl;
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
