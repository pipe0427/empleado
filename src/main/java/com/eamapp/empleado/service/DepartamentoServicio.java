package com.eamapp.empleado.service;

import java.util.List;

import com.eamapp.empleado.entity.Departamento;
import com.eamapp.empleado.repositorie.DepartamentoRepositorio;


public interface DepartamentoServicio  {
    public List<Departamento> listarTodosLosDepartamentos();

    public Departamento guardarDepartamento(Departamento departamento);

    public Departamento obtenerDepartamentoPorId(Long id);

    public Departamento actualizarDepartamento(Departamento departamento);

    public void eliminarDepartamento(Long id);

}
