package com.apiux.springboot.backend.apirest.models.service;

import com.apiux.springboot.backend.apirest.models.dao.TareaDao;
import com.apiux.springboot.backend.apirest.models.entity.Tarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service //estereotipo de Component permite registrar bean e inyectarlo
public class TareaServiceImpl implements ITareaService{
    @Autowired
    private TareaDao tareaDao; //inyectamos la dependencia con anotacion.
    @Override
    @Transactional(readOnly = true) //es conveniente marcarla dentro de una trx de spring, para que este sincronizada con la db
    public List<Tarea> findAll() {
        return (List<Tarea>) tareaDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Tarea findById(Long id) {
        return tareaDao.findById(id).orElse(null); //findById retorna un Optional (dsd java8) nos permite saber si existe el objeto, sino se encuentra podemos retornar otro
    }

    @Override
    @Transactional
    public Tarea save(Tarea tarea) { //el metodo save de CrudRepository nos sirve tanto para crear como para editar el objeto entity.
        return tareaDao.save(tarea);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        tareaDao.deleteById(id);
    }
}
