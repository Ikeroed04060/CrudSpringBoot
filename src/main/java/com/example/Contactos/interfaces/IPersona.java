package com.example.Contactos.interfaces;

import com.example.Contactos.modelo.Persona;
import org.springframework.data.repository.CrudRepository;

public interface IPersona  extends CrudRepository<Persona, Integer> {
}
