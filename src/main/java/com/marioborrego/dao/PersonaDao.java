package com.marioborrego.dao;

import com.marioborrego.domain.Persona;
import org.springframework.data.repository.CrudRepository;


public interface PersonaDao extends CrudRepository<Persona, Long> {

}
