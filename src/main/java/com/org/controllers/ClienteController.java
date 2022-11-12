package com.org.controllers;

import com.org.models.Cliente;
import com.org.repositories.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClienteController {
    @Autowired
    IClienteRepository clienteRepository;

    @GetMapping("/clientes")
    List<Cliente> listadoClientes() {
        return clienteRepository.findAll();
    }

    @GetMapping("/clientes/{id}")
    Cliente obtenerCliente(@PathVariable int id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        if (cliente.isPresent()) {
            return cliente.orElse(new Cliente());
        }

        return cliente.get();
    }

    @PostMapping("/clientes")
    Cliente guardarCliente(@RequestBody Cliente cliente){
        return  clienteRepository.save(cliente);
    }

    @DeleteMapping("/clientes/{id}")
    void eliminarCliente(@PathVariable int id){
        clienteRepository.deleteById(id);
    }
}
