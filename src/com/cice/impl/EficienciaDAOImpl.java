/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.impl;

import com.cice.dao.ConnectionBBDD;
import com.cice.interfaces.IEficienciaDAO;
import com.cice.model.Eficiencia;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AVECH3H
 */
public class EficienciaDAOImpl extends ConnectionBBDD implements IEficienciaDAO {

    private static final String SQLEFICIENCIAS = "SELECT * FROM EFICIENCIAS";

    @Override
    public List<Eficiencia> getEficiencias() throws Exception {
        List<Eficiencia> listaEficiencias = new ArrayList();
        Eficiencia eficiencia = null;

        try {
            openConnection();
            //Acceso a la base de datos
            Statement stm = conexion.createStatement();
            ResultSet rs = stm.executeQuery(SQLEFICIENCIAS);

            while (rs.next()) {
                eficiencia = new Eficiencia(rs.getString("c_energetica"), rs.getString("descripcion"), rs.getString("icono"));
                listaEficiencias.add(eficiencia);
            }

            closeConnection();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception("Error al recuperar la lista de eficiencias");
        }
        return listaEficiencias;
    }
}

