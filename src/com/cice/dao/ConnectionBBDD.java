package com.cice.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBBDD {

    public Connection conexion = null;
    private static final String URLCONEXION = "jdbc:mysql://localhost:3306/bbdd_gestmotor";
    private static final String USUARIO = "USRJAVA2019";
    private static final String PASSWORD = "PWD2019ORACLE";

    public void openConnection() throws ClassNotFoundException, SQLException {
        conexion = DriverManager.getConnection(URLCONEXION, USUARIO, PASSWORD);
    }

    public void closeConnection() {
        try {
            conexion.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
