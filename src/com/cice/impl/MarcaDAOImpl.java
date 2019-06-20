/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.impl;

import com.cice.dao.ConnectionBBDD;
import com.cice.interfaces.IMarcaDAO;
import com.cice.model.Marca;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AVECH3H
 */
public class MarcaDAOImpl extends ConnectionBBDD implements IMarcaDAO{

    private static final String SQLMARCAS = "SELECT * FROM MARCAS";
    
    @Override
    public List<Marca> getMarcas() throws Exception{
        List<Marca> listaMarcas = new ArrayList();
        Marca marca = null;

        try {
            openConnection();
            //Acceso a la base de datos
            Statement stm = conexion.createStatement();
            ResultSet rs = stm.executeQuery(SQLMARCAS);

            while (rs.next()) {
                marca = new Marca(rs.getInt("id"), rs.getString("marca"));
                listaMarcas.add(marca);
            }
            
            closeConnection();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception("Error al recuperar la lista de marcas");
        }
        return listaMarcas;        
    }
}
