
package com.mycompany.entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name="incidente")

public class Incidente {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idIncidente")
    private int idIncidente;
    @Column(name="descripcion" ,nullable = false)
    private String descripcion;
    @Column(name="consideraciones" ,nullable = false)
    private String consideraciones;
    @ManyToOne
    @JoinColumn(name="idTipoProblema" ,nullable = false)
    private TipoProblema tipo;
    @ManyToOne
    @JoinColumn(name="idCliente" ,nullable = false)
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name="idTecnico" ,nullable = false)
    private Tecnico tecnico;
    @Column(name="fechaResolucion" ,nullable = false)
    private LocalDate  fechaResolucion;
    @Column(name="resuelto" ,nullable = false)
    private boolean resuelto;
    
    
    
    public Incidente(Builder builder){
    
        this.idIncidente = builder.idIncidente;
        this.descripcion = builder.descripcion;
        this.consideraciones = builder.consideraciones;
        this.tipo = builder.tipo;
        this.cliente = builder.cliente;
        this.tecnico = builder.tecnico;
        this.fechaResolucion = builder.fechaResolucion;
        this.resuelto = builder.resuelto;
    }
    
    
    
    
    public static class Builder{
    
    private int idIncidente;
    private String descripcion;
    private String consideraciones;
    private TipoProblema tipo;
    private Cliente cliente;
    private Tecnico tecnico;
    private LocalDate  fechaResolucion;
    private boolean resuelto;

        public Incidente.Builder IdIncidente(int idIncidente) {
            this.idIncidente = idIncidente;
            return this;
        }

        public Incidente.Builder Descripcion(String descripcion) {
            this.descripcion = descripcion;
            return this;
        }

        public Incidente.Builder Consideraciones(String consideraciones) {
            this.consideraciones = consideraciones;
            return this;
        }

        public Incidente.Builder Tipo(TipoProblema tipo) {
            this.tipo = tipo;
            return this;
        }

        public Incidente.Builder Cliente(Cliente cliente) {
            this.cliente = cliente;
            return this;
        }

        public Incidente.Builder Tecnico(Tecnico tecnico) {
            this.tecnico = tecnico;
            return this;
        }

        public Incidente.Builder FechaResolucion(LocalDate fechaResolucion) {
            this.fechaResolucion = fechaResolucion;
            return this;
        }

        public Incidente.Builder Resuelto(boolean resuelto) {
            this.resuelto = resuelto;
            return this;
        }
    
    
    public Incidente build(){
    
    return new Incidente(this);
    }
    
    
    
    }
    
    
    
    
    
}
