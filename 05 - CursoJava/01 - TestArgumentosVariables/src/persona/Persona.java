package persona;

public class Persona {

    private final int idPersona;
    private static int contadorPersonas;
    private String nombre;

    static {
//        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas;
    }

    {
//        System.out.println("Ejecucion bloque NO estatico");
        this.idPersona = Persona.contadorPersonas++;
    }

    public Persona() {
        System.out.println("Ejecucion constructor");
    }

    public Persona(String nombre) {

        this.nombre = nombre;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre = " + nombre + '}';
    }

}
