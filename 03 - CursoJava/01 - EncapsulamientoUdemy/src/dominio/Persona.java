package dominio;

// Declaramos atributos de la clase
public class Persona {

    private int idPersona;
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    private static int contadorPersonas;

    // Creamos el constructor no devuelde dato
    public Persona(String nombre, double sueldo, boolean eliminado) {
        // Diferenciamos el atributo de nuestra clase del argumento que estamos recibiendo
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
        Persona.contadorPersonas++;
        this.idPersona = Persona.contadorPersonas;
    }

    // Definimos Metodos get solo regresa el atributo y set no regresa pero recibe el argumento 
    // y lo modifica. El get si es boolean se usa en su lugar is como pregunta
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() {
        return this.eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        contadorPersonas = aContadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", sueldo="
                + sueldo + ", eliminado=" + eliminado + '}';
    }

}
