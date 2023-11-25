
package com.mycompany.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name="tipoproblema")

public class TipoProblema {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idTipoProblema")
    private int idTipoProblema;
    @Column(name="tiempoEstimado" ,nullable = false)
    private int tiempoEstimado;
    @Column(name="tiempoMaximo" ,nullable = false)
    private int tiempoMaximo;
    @Column(name="detalleProblema" ,nullable = false)
    private String detalleProblema;
    @Column(name="especialidad" ,nullable = false)
    @Enumerated(EnumType.STRING)
    private Especialidad especialidad;
    
   
    
    public TipoProblema(Builder builder){
        
        this.idTipoProblema = builder.idTipoProblema;
        this.tiempoEstimado = builder.tiempoEstimado;
        this.tiempoMaximo = builder.tiempoMaximo;
        this.detalleProblema = builder.detalleProblema;
        this.especialidad = builder.especialidad;
    
    }
    
    
    
    
  public static class Builder{
  
      private int idTipoProblema;
      private int tiempoEstimado, tiempoMaximo;
      private String detalleProblema;
      private Especialidad especialidad;

      public TipoProblema.Builder IdTipoProblema(int idTipoProblema) {
          this.idTipoProblema = idTipoProblema;
          return this;
      }

      public TipoProblema.Builder TiempoEstimado(int tiempoEstimado) {
          this.tiempoEstimado = tiempoEstimado;
          return this;
      }

      public TipoProblema.Builder TiempoMaximo(int tiempoMaximo) {
          this.tiempoMaximo = tiempoMaximo;
          return this;
      }

      public TipoProblema.Builder DetalleProblema(String detalleProblema) {
          this.detalleProblema = detalleProblema;
          return this;
      }

      public TipoProblema.Builder Especial(Especialidad especialidad) {
          this.especialidad = especialidad;
          return this;
      }

      public TipoProblema build() {

          return new TipoProblema(this);

  }
  
  
  }  
    
    
    
    
    
}
