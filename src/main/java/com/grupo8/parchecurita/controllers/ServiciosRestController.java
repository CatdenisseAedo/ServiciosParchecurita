package com.grupo8.parchecurita.controllers;

import com.grupo8.parchecurita.models.Servicios;
import com.grupo8.parchecurita.services.ServiciosServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servicios") //La ruta base
public class ServiciosRestController {

    @Autowired
    ServiciosServiceImpl serviciosService;

    @GetMapping("/lista")
    public List<Servicios> listaDeServicios() {
        List<Servicios> listaMostrar = serviciosService.ListaDeServicios();
        return listaMostrar;
    }

    @PostMapping("/nuevo")
    public Servicios guardarNuevoServicio(@RequestBody Servicios servicioNuevo) {
        Servicios serviciosParaGuardar = serviciosService.guardarServicio(servicioNuevo);
        Servicios servicioParaGuardar = new Servicios();
        return servicioParaGuardar;
    }

    @PutMapping("/editar/{id}")
    public Servicios editarServicioPorId(@PathVariable Long id, @RequestBody Servicios servicioActualizado) {
        Servicios servicioEditado = serviciosService.editarServicioPorId(id, servicioActualizado);
        return servicioEditado;
    }

    @DeleteMapping("/borrar/{id}")
    public String borrarServicioPorId(@PathVariable Long id) {
        serviciosService.borrarServicio(id);
        return "El Servicio a sido borrado exitosamente";
    }
}

