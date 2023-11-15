package Entidades;


public class Cliente {
    
    private int idCliente,cuit;
    private String razonSocial,nombre,apellido,email,telefono;
    private boolean estado;

    public Cliente() {
    }

    public Cliente(int idCliente, int cuit, String razonSocial, String nombre, String apellido, String email, String telefono, boolean estado) {
        this.idCliente = idCliente;
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.estado = estado;
    }

    public Cliente(int cuit, String razonSocial, String nombre, String apellido, String email, String telefono, boolean estado) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.estado = estado;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
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
        return "Cliente{" + "cuit=" + cuit + ", razonSocial=" + razonSocial + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
    
    
    
    
    
}
