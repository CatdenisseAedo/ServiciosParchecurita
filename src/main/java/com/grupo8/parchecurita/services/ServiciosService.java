package com.grupo8.parchecurita.services;

import com.grupo8.parchecurita.models.Servicios;

import java.util.List;

public interface ServiciosService {


    Servicios guardarServicio(Servicios servicioNuevo);

    List<Servicios> ListaDeServicios();

    Servicios editarServicioPorId(Long id, Servicios servicioActualizado);

    void borrarServicio(Long id);
}
