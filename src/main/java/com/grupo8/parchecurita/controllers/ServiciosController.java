package com.grupo8.parchecurita.controllers;

import com.grupo8.parchecurita.models.Servicios;
import com.grupo8.parchecurita.services.ServiciosServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

@RequestMapping("/servicios")
public class ServiciosController {

    @Autowired
    ServiciosServiceImpl serviciosService;

    @GetMapping("/servicios")
    public List<Servicios> listaDeServicios() {
        List<Servicios> listaMostrar = serviciosService.ListaDeServicios();
        return listaMostrar;
    }

}

