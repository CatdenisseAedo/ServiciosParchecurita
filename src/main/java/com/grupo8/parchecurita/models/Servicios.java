package com.grupo8.parchecurita.models;

import jakarta.persistence.*;

@Entity
@Table (name = "Servicios")
public class Servicios {

    @Id
    @GeneratedValue
    private Long servicioId;

    @Column (name = "Categorías_servicio")
    private String categoriaServicio;

    //Constructores


    public Servicios() {
    }

    public Servicios(String categoriaServicio) {
        this.categoriaServicio = categoriaServicio;
    }

    //Accesadores y mutadores


    public Long getServicioId() {
        return servicioId;
    }

    public String getCategoriaServicio() {
        return categoriaServicio;
    }

    public void setCategoriaServicio(String categoriaServicio) {
        this.categoriaServicio = categoriaServicio;
    }
}
