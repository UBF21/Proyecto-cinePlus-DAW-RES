package com.org.repositories;

import com.org.models.Comestible;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IComestibleRepository extends JpaRepository<Comestible,String> {
}
