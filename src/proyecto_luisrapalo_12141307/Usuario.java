package proyecto_luisrapalo_12141307;
public class Usuario {
    private String nombre;
    private String contraseña;
    private int tipo;

    public Usuario() {
    }

    public Usuario(String nombre, String contraseña, int tipo) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", contrase\u00f1a=" + contraseña + ", tipo=" + tipo + '}';
    }
}
