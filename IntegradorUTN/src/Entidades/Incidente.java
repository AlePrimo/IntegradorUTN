
package Entidades;

import java.time.LocalDate;


public class Incidente {
    
    private int idIncidente;
    private String descripcion,consideraciones;
    private TipoProblema tipo;
    private Cliente cliente;
    private Tecnico tecnico;
    private LocalDate  fechaResolucion;
    private boolean resuelto;

    public Incidente() {
    }

    public Incidente(int idIncidente, String descripcion, String consideraciones, TipoProblema tipo, Cliente cliente, Tecnico tecnico, LocalDate fechaResolucion, boolean resuelto) {
        this.idIncidente = idIncidente;
        this.descripcion = descripcion;
        this.consideraciones = consideraciones;
        this.tipo = tipo;
        this.cliente = cliente;
        this.tecnico = tecnico;
        this.fechaResolucion = fechaResolucion;
        this.resuelto = resuelto;
    }

    public Incidente(String descripcion, String consideraciones, TipoProblema tipo, Cliente cliente, Tecnico tecnico, LocalDate fechaResolucion, boolean resuelto) {
        this.descripcion = descripcion;
        this.consideraciones = consideraciones;
        this.tipo = tipo;
        this.cliente = cliente;
        this.tecnico = tecnico;
        this.fechaResolucion = fechaResolucion;
        this.resuelto = resuelto;
    }

    public int getIdIncidente() {
        return idIncidente;
    }

    public void setIdIncidente(int idIncidente) {
        this.idIncidente = idIncidente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getConsideraciones() {
        return consideraciones;
    }

    public void setConsideraciones(String consideraciones) {
        this.consideraciones = consideraciones;
    }

    public TipoProblema getTipo() {
        return tipo;
    }

    public void setTipo(TipoProblema tipo) {
        this.tipo = tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public LocalDate getFechaResolucion() {
        return fechaResolucion;
    }

    public void setFechaResolucion(LocalDate fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }

    public boolean isResuelto() {
        return resuelto;
    }

    public void setResuelto(boolean resuelto) {
        this.resuelto = resuelto;
    }

    @Override
    public String toString() {
        return "Incidente{" + "descripcion=" + descripcion + ", cliente=" + cliente.getRazonSocial() + ", tecnico=" + tecnico.getNombre() + ", fechaResolucion=" + fechaResolucion + '}';
    }
    
    
    
    
    
    
}
