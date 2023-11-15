
package Entidades;


public class Tecnico {
    
    private int idTecnico,nroLegajo;
    private String nombre,apellido,email,telefono;
    private boolean estado;

    public Tecnico() {
    }

    public Tecnico(int nroLegajo, String nombre, String apellido, String email, String telefono, boolean estado) {
        this.nroLegajo = nroLegajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.estado = estado;
    }

    public Tecnico(int idTecnico, int nroLegajo, String nombre, String apellido, String email, String telefono, boolean estado) {
        this.idTecnico = idTecnico;
        this.nroLegajo = nroLegajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.estado = estado;
    }

    public int getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(int idTecnico) {
        this.idTecnico = idTecnico;
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Tecnico{" + "nroLegajo=" + nroLegajo + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
    
    
    
    
}
