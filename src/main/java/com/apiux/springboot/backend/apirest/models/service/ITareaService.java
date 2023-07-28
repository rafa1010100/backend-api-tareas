package com.apiux.springboot.backend.apirest.models.service;

import com.apiux.springboot.backend.apirest.models.entity.Tarea;

import java.util.List;

public interface ITareaService {
    //definimos contrato -->
    public List<Tarea> findAll();
    public Tarea findById(Long id);

    public Tarea save(Tarea task);

    public void deleteById(Long id);

}
