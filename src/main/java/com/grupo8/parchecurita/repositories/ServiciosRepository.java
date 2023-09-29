package com.grupo8.parchecurita.repositories;

import com.grupo8.parchecurita.models.Servicios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiciosRepository extends JpaRepository<Servicios, Long> {
}
