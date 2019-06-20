/*
 * Clase que hereda de la interfaz IModeloDAO, y que implementará los métodos de mantenimiento
 * de la clase Modelo.
 */
package com.cice.impl;

import com.cice.dao.ConnectionBBDD;
import com.cice.interfaces.IModeloDAO;
import com.cice.model.Modelo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloDAOImpl extends ConnectionBBDD implements IModeloDAO {

    private String sql = null;
    private static final int MODELOMARCA = 4;

    @Override
    public void add(Modelo modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Modelo modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Modelo findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Modelo> getModelosMarca(int id) throws Exception {
        List<Modelo> listaModelos = new ArrayList();
        Modelo modelo = null;

        openConnection();
        try {
            //Acceso a la base de datos
            sql = sentenciaSQL(MODELOMARCA);
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                modelo = new Modelo(rs.getInt("id_marca"), rs.getString("modelo"), rs.getFloat("consumo"), rs.getFloat("emisiones"), rs.getString("c_energetica"));
                listaModelos.add(modelo);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception("Error al recuperar la lista de modelos por marca");
        } finally {
            //Fin del acceso
            closeConnection();
        }
        return listaModelos;
    }

    @Override
    public List<Modelo> getAllModelos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String sentenciaSQL(int sentencia) {

        switch (sentencia) {
            case 1:
                return "caso";
            case 2:
                return "caso";
            case 3:
                return "caso";
            case MODELOMARCA:
                return "SELECT * FROM MODELOS WHERE ID_MARCA=?";
            case 5:
                return "caso";
            default:
                return "caso";
        }
    }
}
