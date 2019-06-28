/*
 * Clase de gestión de la tabla MODELOS. Se encargará de la conexión a la
 * BBDD y de sus accesos para el mantenimiento de la tabla
 */
package com.cice.dao;

import com.cice.interfaces.IModeloDAO;
import com.cice.model.Modelo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ModeloDAOImpl extends ConnectionBBDD implements IModeloDAO {

    //Constantes
    private static final String SQL_INSERT = "INSERT INTO MODELOS (ID_MARCA, MODELO, CONSUMO, EMISIONES, C_ENERGETICA) VALUES (?, ?, ?, ?, ?)";
    private static final String SQL_DELETE = "DELETE FROM MODELOS WHERE ID=?";
    private static final String SQL_MODELO = "SELECT * FROM MODELOS WHERE ID_MARCA=?";
    private static final int ADDMODELO = 1;
    private static final int DELETEMODELO = 2;
    private static final int MODELOMARCA = 3;
    private static final String ERR_ADD = "Error al insertar modelo";
    private static final String ERR_DEL = "Error al borrar modelo";
    private static final String ERR_LISTA = "Error al recuperar lista de modelos";
    private static final String ID_MARCA = "id_marca";
    private static final String MODELO = "modelo";
    private static final String CONSUMO = "consumo";
    private static final String EMISIONES = "emisiones";    
    private static final String C_ENERG = "c_energetica";
    private static final String ID = "id";    
    private static final String ERROR = "error";
    //Variables de la clase
    private String sql = null;
    
    /**
     * 
     * @param modelo Insertar un modelo en tabla
     * @throws Exception excepción lanzado por problemas con la conexión a la
     * BBDD, o por la sentencia SQL ejecutada
     */
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
        } catch (Exception ex){
            ex.printStackTrace();
            throw new Exception(ERR_ADD);
        }
    }

    /**
     * 
     * @param idModelo Borrar un modelo de la tabla a partir de su ID
     * @throws Exception excepción lanzado por problemas con la conexión a la
     * BBDD, o por la sentencia SQL ejecutada
     */
    @Override
    public void delete(int idModelo) throws Exception{
        try {
            openConnection();
            String sql = sentenciaSQL(DELETEMODELO);
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idModelo);
            ps.executeUpdate();
            closeConnection();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception(ERR_DEL);
        }
    }

    /**
     * 
     * @param id ID de la marca para consultar los modelos
     * @return  Retorna la lista de modelos de una marca a partir del id
     * de la marca
     * @throws Exception excepción lanzado por problemas con la conexión a la
     * BBDD, o por la sentencia SQL ejecutada
     */
    @Override
    public List<Modelo> getModelosMarca(int id) throws Exception {
        List<Modelo> listaModelos = new ArrayList();
        Modelo modelo = null;
        int idModelo=0;
        try {
            openConnection();
            sql = sentenciaSQL(MODELOMARCA);
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                modelo = new Modelo(rs.getInt(ID), rs.getString(MODELO), rs.getFloat(CONSUMO), rs.getFloat(EMISIONES), rs.getString(C_ENERG));
                idModelo = rs.getInt(ID);
                modelo.setId(idModelo);
                listaModelos.add(modelo);
            }
            closeConnection();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception(ERR_LISTA);
        }
        return listaModelos;
    }

    private String sentenciaSQL(int sentencia) {

        switch (sentencia) {
            case ADDMODELO:
                return SQL_INSERT;
            case DELETEMODELO:
                return SQL_DELETE;
            case MODELOMARCA:
                return SQL_MODELO;
            default:
                return ERROR;
        }
    }
}
