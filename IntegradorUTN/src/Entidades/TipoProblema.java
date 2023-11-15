
package Entidades;


public class TipoProblema {
    
    private int idTipoProblema,tiempoEstimado,tiempoMaximo;
    private String detalleProblema;
    private Especialidad especial;

    public TipoProblema() {
    }

    public TipoProblema(int idTipoProblema, int tiempoEstimado, int tiempoMaximo, String detalleProblema, Especialidad especial) {
        this.idTipoProblema = idTipoProblema;
        this.tiempoEstimado = tiempoEstimado;
        this.tiempoMaximo = tiempoMaximo;
        this.detalleProblema = detalleProblema;
        this.especial = especial;
    }

    public TipoProblema(int tiempoEstimado, int tiempoMaximo, String detalleProblema, Especialidad especial) {
        this.tiempoEstimado = tiempoEstimado;
        this.tiempoMaximo = tiempoMaximo;
        this.detalleProblema = detalleProblema;
        this.especial = especial;
    }

    public int getIdTipoProblema() {
        return idTipoProblema;
    }

    public void setIdTipoProblema(int idTipoProblema) {
        this.idTipoProblema = idTipoProblema;
    }

    public int getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public int getTiempoMaximo() {
        return tiempoMaximo;
    }

    public void setTiempoMaximo(int tiempoMaximo) {
        this.tiempoMaximo = tiempoMaximo;
    }

    public String getDetalleProblema() {
        return detalleProblema;
    }

    public void setDetalleProblema(String detalleProblema) {
        this.detalleProblema = detalleProblema;
    }

    public Especialidad getEspecial() {
        return especial;
    }

    public void setEspecial(Especialidad especial) {
        this.especial = especial;
    }

    @Override
    public String toString() {
        return "TipoProblema{" + "detalleProblema=" + detalleProblema + '}';
    }
    
    
    
    
    
    
    
}
