package com.org.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.models.TipoUsuario;
import com.org.repositories.ITipoUsuarioRepository;

@RestController
public class TipoUsuarioController {
	
	@Autowired ITipoUsuarioRepository repotipoUsuario;
	
	@GetMapping("/tipoUsuario")
	List<TipoUsuario> listado(){
		return repotipoUsuario.findAll();
	}
}
