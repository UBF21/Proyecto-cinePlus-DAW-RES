package com.org.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.models.TipoComestible;

public interface ITipoComestibleRepository extends JpaRepository<TipoComestible, Integer> {

}
