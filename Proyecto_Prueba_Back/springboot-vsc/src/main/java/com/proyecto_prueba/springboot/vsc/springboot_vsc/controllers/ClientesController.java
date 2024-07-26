package com.proyecto_prueba.springboot.vsc.springboot_vsc.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto_prueba.springboot.vsc.springboot_vsc.models.Clientes;
import com.proyecto_prueba.springboot.vsc.springboot_vsc.services.ClientesDb;

@RestController
public class ClientesController {

    @GetMapping("/api/clientes-all")
	public List<Clientes> ObtenerClientes() {
		return new ClientesDb().obtenerClientes();
	}
}
