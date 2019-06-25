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
    private static final int ADDMODELO = 1;
    private static final int DELETEMODELO = 2;
    private static final int MODELOMARCA = 3;

    @Override
    public void add(Modelo modelo) throws Exception {
        try {
            openConnection();
            String sql = sentenciaSQL(ADDMODELO);
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, modelo.getIdMarca());
            ps.setString(2, modelo.getModelo());
            ps.setFloat(3, modelo.getConsumo());
            ps.setFloat(4, modelo.getEmisiones());
            ps.setString(5, modelo.getcEnergetica());
            ps.executeUpdate();
            closeConnection();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            throw new Exception("No se ha podido conectar con la base de datos. LLamar al CPD");
        } catch (SQLException ex) {
            ex.printStackTrace();
            switch (ex.getErrorCode()) {
                case 0:
                    throw new Exception("No se ha establecido la conexión con la BD.");
                default:
                    throw new Exception("Error en la base de datos. Llame al CPD");
            }
        }
    }

    @Override
    public void delete(int idModelo) throws Exception{
        try {
            openConnection();
            String sql = sentenciaSQL(DELETEMODELO);
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idModelo);
            ps.executeUpdate();
            closeConnection();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            throw new Exception("No se ha podido conectar con la base de datos. LLamar al CPD");
        } catch (SQLException ex) {
            ex.printStackTrace();
            switch (ex.getErrorCode()) {
                case 0:
                    throw new Exception("No se ha establecido la conexión con la BD.");
                default:
                    throw new Exception("Error en la base de datos. Llame al CPD");
            }
        }        
    }

    @Override
    public List<Modelo> getModelosMarca(int id) throws Exception {
        List<Modelo> listaModelos = new ArrayList();
        Modelo modelo = null;
        int idModelo=0;

        openConnection();
        try {
            //Acceso a la base de datos
            sql = sentenciaSQL(MODELOMARCA);
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                modelo = new Modelo(rs.getInt("id_marca"), rs.getString("modelo"), rs.getFloat("consumo"), rs.getFloat("emisiones"), rs.getString("c_energetica"));
                idModelo = rs.getInt("id");
                modelo.setId(idModelo);
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

    private String sentenciaSQL(int sentencia) {

        switch (sentencia) {
            case ADDMODELO:
                return "INSERT INTO MODELOS (ID_MARCA, MODELO, CONSUMO, EMISIONES, C_ENERGETICA) VALUES (?, ?, ?, ?, ?)";
            case DELETEMODELO:
                return "DELETE FROM MODELOS WHERE ID=?";
            case MODELOMARCA:
                return "SELECT * FROM MODELOS WHERE ID_MARCA=?";
            default:
                return "caso";
        }
    }
}
