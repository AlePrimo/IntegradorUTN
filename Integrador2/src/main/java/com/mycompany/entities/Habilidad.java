
package com.mycompany.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@ToString
@Entity
@Table(name="habilidad")

public class Habilidad {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idHabilidad")
    private int idHabilidad;
    @ManyToOne
    @JoinColumn(name="idTecnico" ,nullable = false)
    private Tecnico tecnico;
    @Column(name="especialidad" ,nullable = false)
    @Enumerated(EnumType.STRING)
    private Especialidad especialidad;
    @Column(name="estado" ,nullable = false)
    private boolean estado;
    
    
    public Habilidad(Builder builder){
    
     this.tecnico = builder.tecnico;
     this.especialidad = builder.especialidad;
    this.estado = builder.estado;
    this.idHabilidad=builder.idHabilidad;
    }
    
    
    
    public static class Builder{
   private int idHabilidad;
    private Tecnico tecnico;
    private Especialidad especialidad;
    private boolean estado; 

        public Habilidad.Builder IdHabilidad(int idHabilidad) {
            this.idHabilidad = idHabilidad;
            return this;
        }
    
    

        public Habilidad.Builder Tecnico(Tecnico tecnico) {
            this.tecnico = tecnico;
            return this;
        }

        public Habilidad.Builder Especial(Especialidad especialidad) {
            this.especialidad = especialidad;
            return this;
        }

        public Habilidad.Builder Estado(boolean estado) {
            this.estado = estado;
            return this;
        }
        
        
        public Habilidad build(){
        
        return new Habilidad(this);
        }
        




}
    
    
}
