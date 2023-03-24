package com.eamapp.empleado.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "departamento")
public class Departamento {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long codigo;
    
        @Column(name = "nombre", nullable = false, length = 100)
        private String nombre;
    
        @Column(name = "presupuesto", nullable = false)
        private double presupuesto;
    
        @Column(name = "apellgastosido2", nullable = false)
        private double gastos;

        @OneToMany
        private List<Empleado> empleados;

        public Departamento() {
        }

        public Departamento(Long codigo, String nombre, double presupuesto, double gastos) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.presupuesto = presupuesto;
            this.gastos = gastos;
        }

        public Long getCodigo() {
            return codigo;
        }

        public void setCodigo(Long codigo) {
            this.codigo = codigo;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getPresupuesto() {
            return presupuesto;
        }

        public void setPresupuesto(double presupuesto) {
            this.presupuesto = presupuesto;
        }

        public double getGastos() {
            return gastos;
        }

        public void setGastos(double gastos) {
            this.gastos = gastos;
        }

        public List<Empleado> getEmpleados() {
            return empleados;
        }

        public void setEmpleados(List<Empleado> empleados) {
            this.empleados = empleados;
        }

        

        

        

}
