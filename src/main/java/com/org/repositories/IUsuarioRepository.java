package com.org.repositories;

import com.org.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario,String> {

    Usuario findByEmail(String email);
}
