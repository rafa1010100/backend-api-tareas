package com.apiux.springboot.backend.apirest.models.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity //permite marcar esta clase como JPA, indica que es una entidad relacional
@Table(name="tareas") //nombre de la tbl en la db
public class Tarea implements Serializable {
    private static final long serialVersionUID = -1410810721355666961L;
    @Id //indica que es una pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) //indicamos como se va generar, pk autoincremental
    private Long id;
    private String descripcion;
    @Column(name="fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP) //Fecha+Hora
    private Date fechaCreacion;
    private Boolean vigente;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Boolean getVigente() {
        return vigente;
    }

    public void setVigente(Boolean vigente) {
        this.vigente = vigente;
    }
}
