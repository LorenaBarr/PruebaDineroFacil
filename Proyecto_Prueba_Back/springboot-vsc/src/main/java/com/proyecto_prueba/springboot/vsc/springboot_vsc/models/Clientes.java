package com.proyecto_prueba.springboot.vsc.springboot_vsc.models;


public class Clientes {

    private int ClienteID;
    private String TipoDocumento, NumeroDocumento, Apellidos, Recidencia, Ciudad, Telefono;
    
    public Clientes(int clienteID, String tipoDocumento, String numeroDocumento, String apellidos, String recidencia,
            String ciudad, String telefono) {
        ClienteID = clienteID;
        TipoDocumento = tipoDocumento;
        NumeroDocumento = numeroDocumento;
        Apellidos = apellidos;
        Recidencia = recidencia;
        Ciudad = ciudad;
        Telefono = telefono;
    }

    public Clientes() {
    }
    
    public int getClienteID() {
        return ClienteID;
    }
    public void setClienteID(int clienteID) {
        ClienteID = clienteID;
    }
    public String getTipoDocumento() {
        return TipoDocumento;
    }
    public void setTipoDocumento(String tipoDocumento) {
        TipoDocumento = tipoDocumento;
    }
    public String getNumeroDocumento() {
        return NumeroDocumento;
    }
    public void setNumeroDocumento(String numeroDocumento) {
        NumeroDocumento = numeroDocumento;
    }
    public String getApellidos() {
        return Apellidos;
    }
    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }
    public String getRecidencia() {
        return Recidencia;
    }
    public void setRecidencia(String recidencia) {
        Recidencia = recidencia;
    }
    public String getCiudad() {
        return Ciudad;
    }
    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }
    public String getTelefono() {
        return Telefono;
    }
    public void setTelefono(String telefono) {
        Telefono = telefono;
    }
    

}
