package com.org.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.models.TipoUsuario;

public interface ITipoUsuarioRepository extends JpaRepository<TipoUsuario, Integer>{

}
