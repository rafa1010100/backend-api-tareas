package com.apiux.springboot.backend.apirest.controllers;

import com.apiux.springboot.backend.apirest.models.entity.Tarea;
import com.apiux.springboot.backend.apirest.models.service.ITareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  //Un controlador de spring debe estar anotado con @Controller, pero como es un ms usamos restController. esto convierte a json lo que retorna un metodo handler.
public class TareaController {
    @Autowired
    private ITareaService tareaService; //inyectamos el service
    @GetMapping("/listar") //permite mapear a una ruta url y esta compuesta por RequestMapping - listar, metodo handler
    public List<Tarea> listar() {
        return tareaService.findAll();
    }
    @GetMapping("/ver/{id}")
    public Tarea detalle(@PathVariable Long id) { // spring cuando viene un param en la ruta, en el endpoint, automagicamente lo pasa por arg al metodo y lo vms a buscar a la bdd.
        return tareaService.findById(id);
    }
    @PostMapping("/crear") //endpoint
    @ResponseStatus(HttpStatus.CREATED)
    public Tarea crear(@RequestBody Tarea tarea) {
        //de manera automatica, cuando se envia el json desde un cliente, enviamos un json con attr y los valores, donde los attr del obj json
        // tienen que coincidir con los mismos del attr del obj (task) y realiza de manera automatica el binding, pobla lps datos del json en un obj task
        // y lo pasamos por arg, aca se recibe. Para esto debemos indicar que los datos del json vienen en el body del request con @RequestBody

        return tareaService.save(tarea); //cuando se crea la tarea el id no viene, por lo que lo va a insertar, va crear una nueva tarea.
    }
}
