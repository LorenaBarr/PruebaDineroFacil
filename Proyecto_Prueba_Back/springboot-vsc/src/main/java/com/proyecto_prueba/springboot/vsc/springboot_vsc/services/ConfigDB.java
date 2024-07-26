package com.proyecto_prueba.springboot.vsc.springboot_vsc.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigDB {

    public Connection openDb(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
            String connectionUrl = "jdbc:sqlserver://localhost:1433;"
            + "databaseName=PRUEBA;"
            + "user=sa;"
            + "password=Server2022;"
            + "trustServerCertificate=true";
            Connection conexion = DriverManager.getConnection(connectionUrl);
            return conexion;
            
        } catch (SQLException E) {
            System.out.println("ERROR DE CONEXION CON DB.");
            //int x = 1;
        } 
        catch (ClassNotFoundException cnfex) {
            //int x = 1;
        }
        return null;

    }
}
