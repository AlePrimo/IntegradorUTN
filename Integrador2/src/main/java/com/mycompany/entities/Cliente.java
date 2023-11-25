




package com.mycompany.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name = "cliente")

public class Cliente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCliente")
    private int idCliente;
    @Column(name="cuit" ,nullable = false ,unique = true)
    private long cuit;
    @Column(name="razonSocial" ,nullable = false ,unique = true)
    private String razonSocial;
    @Column(name="nombre" ,nullable = false)
    private String nombre;
    @Column(name="apellido" ,nullable = false)
    private String apellido;
    @Column(name="email" ,nullable = false)
    private String email;
    @Column(name="telefono" ,nullable = false)
    private String telefono;
    @Column(name="estado" ,nullable = false)
    private boolean estado;
    
    
    
    
    

    public Cliente(Builder builder) {

        this.nombre = builder.nombre;
        this.apellido = builder.apellido;
        this.cuit = builder.cuit;
        this.razonSocial = builder.razonSocial;
        this.email = builder.email;
        this.telefono = builder.telefono;
        this.estado = builder.estado;
        this.idCliente = builder.idCliente;

    }

    public static class Builder {

        private int idCliente;

        private long cuit;

        private String razonSocial, nombre, apellido, email, telefono;
        private boolean estado;

        public Cliente.Builder IdCliente(int idCliente) {
            this.idCliente = idCliente;
            return this;
        }

        public Cliente.Builder Cuit(int cuit) {
            this.cuit = cuit;
            return this;
        }

        public Cliente.Builder RazonSocial(String razonSocial) {
            this.razonSocial = razonSocial;
            return this;
        }

        public Cliente.Builder Nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Cliente.Builder Apellido(String apellido) {
            this.apellido = apellido;
            return this;
        }

        public Cliente.Builder Email(String email) {
            this.email = email;
            return this;
        }

        public Cliente.Builder Telefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public Cliente.Builder Estado(boolean estado) {
            this.estado = estado;
            return this;
        }

        public Cliente build() {

            return new Cliente(this);
        }

    }

}
