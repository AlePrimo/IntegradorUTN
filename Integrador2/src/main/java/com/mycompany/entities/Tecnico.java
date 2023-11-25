
package com.mycompany.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name="tecnico")

public class Tecnico {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idTecnico")
    private int idTecnico;
    @Column(name="nroLegajo" ,nullable = false ,unique = true)
    private int nroLegajo;
    @Column(name="nombre" ,nullable = false)
    private String nombre;
    @Column(name="apellido" ,nullable = false)
    private String apellido;
    @Column(name="email" ,nullable = false ,unique = true)
    private String email;
    @Column(name="telefono" ,nullable = false ,unique = true)
    private String telefono;
    @Column(name="disponible" ,nullable = false)
    private boolean disponible;
    @Column(name="estado" ,nullable = false)
    private boolean estado;
    
    
    
    
    public Tecnico(Builder builder){
        
        this.idTecnico=builder.idTecnico;
         this.nroLegajo=builder.nroLegajo;
        this.nombre=builder.nombre;
        this.apellido=builder.apellido;
        this.email=builder.email;
        this.telefono=builder.telefono;
        this.disponible=builder.disponible;
        this.estado=builder.estado;
    
    
    
    
    
    }
    
    
    
    
    
    
    public static class Builder {

        private int idTecnico;
        private int nroLegajo;
        private String nombre;
        private String apellido;
        private String email;
        private String telefono;
        private boolean disponible;
        private boolean estado;

        public Tecnico.Builder IdTecnico(int idTecnico) {
            this.idTecnico = idTecnico;
            return this;
        }

        public Tecnico.Builder NroLegajo(int nroLegajo) {
            this.nroLegajo = nroLegajo;
            return this;
        }

        public Tecnico.Builder Nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Tecnico.Builder Apellido(String apellido) {
            this.apellido = apellido;
            return this;
        }

        public Tecnico.Builder Email(String email) {
            this.email = email;
            return this;
        }

        public Tecnico.Builder Telefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public Tecnico.Builder Disponible(boolean disponible) {
            this.disponible = disponible;
            return this;
        }

        public Tecnico.Builder Estado(boolean estado) {
            this.estado = estado;
            return this;
        }

        public Tecnico build() {

            return new Tecnico(this);
        }


    }
    
    
    
    
    
    
    
    
}
