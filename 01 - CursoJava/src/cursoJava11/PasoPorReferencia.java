package cursoJava11;

import cursoJava07Clases.Persona;

public class PasoPorReferencia {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        System.out.println("Nombre de persona1 = " + persona1.nombre);
//        cambioValor(persona1);
        // Cambio y regreso del objeto modificado. Regresa a una variable
        persona1 = cambioValor(persona1);
        System.out.println("Nombre de persona1 = " + persona1.nombre);
    }
//    public static void cambioValor(Persona persona) {
//        persona.nombre = "Carla";
//    }
    
    // Regreso de un Object

    public static Persona cambioValor(Persona persona) {
        persona.nombre = "Carla";
        return persona;
    }
}
