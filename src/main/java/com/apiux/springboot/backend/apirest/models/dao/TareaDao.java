package com.apiux.springboot.backend.apirest.models.dao;

import com.apiux.springboot.backend.apirest.models.entity.Tarea;
import org.springframework.data.repository.CrudRepository;

public interface TareaDao extends CrudRepository<Tarea, Long> {
    //protocolo/contrato de comportamiento
    //crudRepository t¿ya tiene todos los metodos para CRUD.


}
