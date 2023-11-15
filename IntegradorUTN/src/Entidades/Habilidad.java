
package Entidades;


public class Habilidad {
    
    private int idHabilidad;
    private Tecnico tecnico;
    private Especialidad especial;
    private boolean estado;

    public Habilidad() {
    }

    public Habilidad(int idHabilidad, Tecnico tecnico, Especialidad especial, boolean estado) {
        this.idHabilidad = idHabilidad;
        this.tecnico = tecnico;
        this.especial = especial;
        this.estado = estado;
    }

    public Habilidad(Tecnico tecnico, Especialidad especial, boolean estado) {
        this.tecnico = tecnico;
        this.especial = especial;
        this.estado = estado;
    }

    public int getIdHabilidad() {
        return idHabilidad;
    }

    public void setIdHabilidad(int idHabilidad) {
        this.idHabilidad = idHabilidad;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
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
        return "Habilidad{" + "tecnico=" + tecnico.getNombre() + ", especial=" + especial + ", estado=" + estado + '}';
    }
    
    
    
    
    
    
}
