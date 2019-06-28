/*
 * Clase de gestión de la tabla MARCAS. Se encargará de la conexión a la
 * BBDD y de sus accesos para el uso de la tabla
 */
package com.cice.dao;

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

    //Constantes
    private static final String SQLMARCAS = "SELECT * FROM MARCAS";
    private static final String ID = "id";
    private static final String MARCA = "marca";
    private static final String ERR_MARCA = "Error al recuperar la lista de marcas";
    
    /**
     * 
     * @return --> Retorna la lista de marcas completa de la tabla
     * @throws Exception 
     */
    @Override
    public List<Marca> getMarcas() throws Exception{
        List<Marca> listaMarcas = new ArrayList();
        Marca marca = null;

        try {
            openConnection();
            Statement stm = conexion.createStatement();
            ResultSet rs = stm.executeQuery(SQLMARCAS);
            while (rs.next()) {
                marca = new Marca(rs.getInt(ID), rs.getString(MARCA));
                listaMarcas.add(marca);
            }
            closeConnection();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception(ERR_MARCA);
        }
        return listaMarcas;        
    }
}
