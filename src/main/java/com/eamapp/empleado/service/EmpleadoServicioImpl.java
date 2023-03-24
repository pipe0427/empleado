package com.eamapp.empleado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eamapp.empleado.entity.Empleado;
import com.eamapp.empleado.repositorie.EmpleadoRepositorio;

@Service
public class EmpleadoServicioImpl implements EmpleadoServicio {

    @Autowired
    private EmpleadoRepositorio repositorio;

    @Override
    public List<Empleado> listarTodosLosEmpleados() {

        return repositorio.findAll();
    }

    @Override
    public Empleado guardarEmpleado(Empleado empleado) {

        return repositorio.save(empleado);
    }

    @Override
    public Empleado obtenerEmpleadoPorId(Long id) {

        return repositorio.findById(id).get();
    }

    @Override
    public Empleado actualizarEmpleado(Empleado empleado) {
        return repositorio.save(empleado);
    }

    @Override
    public void eliminarEmpleado(Long id) {
        repositorio.deleteById(id);

    }
}
