package com.eamapp.empleado.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nif", nullable = false, length = 9)
    private String nif;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "apellido1", nullable = false, length = 100)
    private String apellido1;

    @Column(name = "apellido2", nullable = false, length = 100)
    private String apellido2;

    @ManyToOne
    @NotEmpty
    private Departamento codigo_departamento;

    public Empleado() {
    }

    public Empleado(Long id, String nif, String nombre, String apellido1, String apellido2) {
        this.id = id;
        this.nif = nif;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Departamento getCodigo_departamento() {
        return codigo_departamento;
    }

    public void setCodigo_departamento(Departamento codigo_departamento) {
        this.codigo_departamento = codigo_departamento;
    }

    
    


    
}