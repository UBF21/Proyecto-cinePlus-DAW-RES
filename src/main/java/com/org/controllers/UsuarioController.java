package com.org.controllers;

import com.org.models.Usuario;
import com.org.repositories.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UsuarioController {

    @Autowired
    IUsuarioRepository usuarioRepository;

    @GetMapping("/usuarios")
    List<Usuario> listarUsuarios(){
        return  usuarioRepository.findAll();
    }

    @GetMapping("/usuarios/{id}")
    Usuario obtenerUsuario(@PathVariable String id){

        Optional<Usuario> usuario = usuarioRepository.findById(id);
        if (usuario.isPresent()){
            return  usuario.orElse(new Usuario());
        }
        return usuario.get();
    }

    @PostMapping("/usuarios")
    Usuario guardarUsuario(@RequestBody Usuario usuario){

        return usuarioRepository.save(usuario);
    }

    @DeleteMapping("/usuarios/{id}")
    void eliminarUsuario(@PathVariable String id){
        usuarioRepository.findById(id);
    }
}
