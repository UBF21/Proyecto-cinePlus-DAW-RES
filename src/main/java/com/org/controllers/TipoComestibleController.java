package com.org.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.models.TipoComestible;
import com.org.repositories.ITipoComestibleRepository;

@RestController
public class TipoComestibleController {
	
	@Autowired ITipoComestibleRepository repoTipoComestible;
	
	@GetMapping("/tipoComestible")
	List<TipoComestible> listado(){
		return repoTipoComestible.findAll();
	}
}
