/*
 * Clase de gestión de la tabla EFICIENCIAS. Se encargará de la conexión a la
 * BBDD y de sus accesos para el uso de la tabla
 */
package com.cice.dao;

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

    //Constantes
    private static final String SQL = "SELECT * FROM EFICIENCIAS";
    private static final String C_E = "c_energetica";
    private static final String DESC = "descripcion";
    private static final String ICONO = "icono";
    private static final String ERR_EFIC = "Error al recuperar la lista de eficiencias";

    /**
     * 
     * @return --> Retorna la lista completa de eficiencias de la tabla
     * @throws Exception 
     */
    @Override
    public List<Eficiencia> getEficiencias() throws Exception {
        List<Eficiencia> listaEficiencias = new ArrayList();
        Eficiencia eficiencia = null;

        try {
            openConnection();
            Statement stm = conexion.createStatement();
            ResultSet rs = stm.executeQuery(SQL);
            while (rs.next()) {
                eficiencia = new Eficiencia(rs.getString(C_E), rs.getString(DESC), rs.getString(ICONO));
                listaEficiencias.add(eficiencia);
            }
            closeConnection();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception(ERR_EFIC);
        }
        return listaEficiencias;
    }
}

