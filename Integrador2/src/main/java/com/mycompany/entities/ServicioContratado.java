
package com.mycompany.entities;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name="serviciocontratado" )

public class ServicioContratado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idServicio")
    private int idServicio;
    @ManyToOne
    @JoinColumn(name="idCliente" ,nullable = false)
    private Cliente cliente;
    @Column(name="especialidad" ,nullable = false)
    @Enumerated(EnumType.STRING)
    private Especialidad especialidad;
    @Column(name= "estado " ,nullable = false  )
    private boolean estado;
    
    
    
    public ServicioContratado(Builder builder){
    
        this.idServicio = builder.idServicio;
        this.cliente = builder.cliente;
        this.especialidad = builder.especialidad;
        this.estado = builder.estado;
    
    }
    
    
    
    
    
    
    public static class Builder{
        
        private int idServicio;
        private Cliente cliente;
        private Especialidad especialidad;
        private boolean estado;

        public ServicioContratado.Builder IdServicio(int idServicio) {
            this.idServicio = idServicio;
            return this;
        }

        public ServicioContratado.Builder Cliente(Cliente cliente) {
            this.cliente = cliente;
            return this;
        }

        public ServicioContratado.Builder Especial(Especialidad especialidad) {
            this.especialidad = especialidad;
            return this;
        }

        public ServicioContratado.Builder Estado(boolean estado) {
            this.estado = estado;
            return this;
        }

        public ServicioContratado build() {

            return new ServicioContratado(this);

        }
    
    
    
    }
    
    
    
    
}
