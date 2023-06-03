package domain;
// Clase Padre

public class Empleado {

    /* Atributos - Usaremos protected para que las clases hijas los hereden y puedan acceder directamente a ellos
    sin necesidad de usar los metodos get ni set.
     */
    protected String nombre;
    protected double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    // Podemos marcar el metodo como protected pero no podemos restringir mas el metodo de la clase hija.
    public String obtenerDetalles() {
        return "Nombre: " + this.nombre + ", \nSueldo: " + this.sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
