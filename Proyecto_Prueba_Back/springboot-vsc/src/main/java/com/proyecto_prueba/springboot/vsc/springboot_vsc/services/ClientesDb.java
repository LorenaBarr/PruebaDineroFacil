package com.proyecto_prueba.springboot.vsc.springboot_vsc.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.proyecto_prueba.springboot.vsc.springboot_vsc.models.Clientes;

public class ClientesDb {
    Connection _cn;

    public ClientesDb() {
        _cn = new ConfigDB().openDb();
    }

    public List<Clientes> obtenerClientes(){
        try {
            Statement stnt = _cn.createStatement();
            String query = "SELECT * FROM Clientes";

            List<Clientes> clientes = new ArrayList<>();

            ResultSet result = stnt.executeQuery(query);

            while (result.next()) {
                Clientes cliente = new Clientes(
                    result.getInt("ClienteID"),
                    result.getString("TipoDocumento"),
                    result.getString("NumeroDocumento"),
                    result.getString("Apellidos"),
                    result.getString("Recidencia"),
                    result.getString("Ciudad"),
                    result.getString("Telefono")
                );

                clientes.add(cliente);   
            }
            result.close();
            stnt.close();
            return clientes;
        } catch (Exception e) {
            //int x = 1;
            System.out.println("Ocurrio una exepcion");
        }

        return null;
    }
}
