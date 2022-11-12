package com.org.controllers;

import com.org.models.DetalleBoleta;
import com.org.repositories.IDetalleBoletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class DetalleBoletaController {

    @Autowired
    IDetalleBoletaRepository detalleBoletaRepository;

    @GetMapping("/detalleBoleta")
    List<DetalleBoleta> listarDetalleBoletas() {
        return detalleBoletaRepository.findAll();
    }

    @GetMapping("/detalleBoleta/{id}")
    DetalleBoleta obtenerDetalleBoleta(@PathVariable int id){
        Optional<DetalleBoleta> detalleBoleta = detalleBoletaRepository.findById(id);
        if (detalleBoleta.isPresent()){
            detalleBoleta.orElse(new DetalleBoleta());
        }

        return detalleBoleta.get();
    }
}
