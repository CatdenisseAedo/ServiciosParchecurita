package com.grupo8.parchecurita.services;

import com.grupo8.parchecurita.models.Servicios;
import com.grupo8.parchecurita.repositories.ServiciosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//DEFINIR LÓGICA DE NEGOCIO
@Service
public class ServiciosServiceImpl implements ServiciosService {

    @Autowired
    ServiciosRepository serviciosReporitory;


    @Override
    public Servicios guardarServicio(Servicios servicioNuevo) {
        return serviciosReporitory.save(servicioNuevo);

    }

    @Override
    public List<Servicios> ListaDeServicios() {

        return serviciosReporitory.findAll();
    }

    @Override
    public Servicios editarServicioPorId(Long id, Servicios servicioActualizado) {
       boolean existe = serviciosReporitory.existsById(id);
       if (existe) {
           Servicios servicioSeleccionado = serviciosReporitory.findById(id).get();
        servicioSeleccionado.setCategoriaServicio(servicioActualizado.getCategoriaServicio());
           System.out.println("Servicio actualizad");
           return serviciosReporitory.save(servicioSeleccionado);
       } else {
           System.out.println("El servicio no es válido");
           return null;

       }
    }



    @Override
    public void borrarServicio(Long id) {
        serviciosReporitory.deleteById(id);

    }



    }


