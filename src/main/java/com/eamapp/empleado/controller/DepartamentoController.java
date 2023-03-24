package com.eamapp.empleado.controller;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.eamapp.empleado.service.DepartamentoServicio;
import com.eamapp.empleado.entity.Departamento;



@Controller
public class DepartamentoController {

    @Autowired
    private DepartamentoServicio servicio;

    @GetMapping({ "/empleados"})
    public String listarEmpleados(Model modelo) {
        modelo.addAttribute("departamentos", servicio.listarTodosLosDepartamentos());
        return "empleados"; // nos retorna al archivo empleados
    }
    
    @GetMapping("/departamentos/nuevo")
    public String mostrarFormularioDeRegistrtarDepartamento(Model modelo) {
        Departamento departamento = new Departamento();
        modelo.addAttribute("departamento", departamento);
        return "crear_departamento";
    }

    @PostMapping("/empleados")
    public String guardarDepartamento(@ModelAttribute("departamento") Departamento departamento) {
        servicio.guardarDepartamento(departamento);
        return "redirect:/empleados";
    }

    @GetMapping("/departamentos/editar/{id}")
    public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {
        modelo.addAttribute("departamento", servicio.obtenerDepartamentoPorId(id));
        return "editar_departamento";
    }

    @PostMapping("/departamentos/{id}")
    public String actualizarEstudiante(@PathVariable Long id, @ModelAttribute("departamento") Departamento departamento,
                                       Model modelo) {
        Departamento departamentoExistente = servicio.obtenerDepartamentoPorId(id);
        departamentoExistente.setCodigo(id);
    
        departamentoExistente.setNombre(departamento.getNombre());
 

        servicio.actualizarDepartamento(departamentoExistente);
        return "redirect:/empleados";
    }

    @GetMapping("/departamentos/{id}")
    public String eliminarDepartamento(@PathVariable Long id) {
        servicio.eliminarDepartamento(id);
        return "redirect:/empleados";
    }
    
}
