
package Entidades;


public class ServicioContratado {
    
    private int idServicio;
    private Cliente cliente;
    private Especialidad especial;
    private boolean estado;

    public ServicioContratado() {
    }

    public ServicioContratado(int idServicio, Cliente cliente, Especialidad especial, boolean estado) {
        this.idServicio = idServicio;
        this.cliente = cliente;
        this.especial = especial;
        this.estado = estado;
    }

    public ServicioContratado(Cliente cliente, Especialidad especial, boolean estado) {
        this.cliente = cliente;
        this.especial = especial;
        this.estado = estado;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Especialidad getEspecial() {
        return especial;
    }

    public void setEspecial(Especialidad especial) {
        this.especial = especial;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "ServicioContratado{" + "cliente=" + cliente.getRazonSocial() + ", especial=" + especial + ", estado=" + estado + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
