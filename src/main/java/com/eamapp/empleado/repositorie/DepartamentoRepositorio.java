package com.eamapp.empleado.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eamapp.empleado.entity.Departamento;

@Repository
public interface DepartamentoRepositorio extends JpaRepository<Departamento, Long> {
    
}
