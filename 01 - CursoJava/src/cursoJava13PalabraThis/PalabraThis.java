package cursoJava13PalabraThis;

public class PalabraThis {

    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Perez");
        // Lugar en memoria y valores
        System.out.println("Lugar en memoria persona = " + persona);
        System.out.println("nombre persona: " + persona.nombre);
        System.out.println("apellido persona: " + persona.apellido);

    }
}

class Persona {

    String nombre;
    String apellido;

    // Constructor
    Persona(String nombre, String apellido) {
        /* Constructor de la clase padre (objeto) es un Constructor vacio que se encarga
            de reservar el espacio en memoria. Es la primera linea de nuestro codigo que esta
            aunque no la veamos. Llamada implicita, por eso this puede imrimir la referencia en memoria
         */
        // super();
        this.nombre = nombre;
        this.apellido = apellido;
        // Imprimir objeto usando this
        System.out.println("Objeto persona usando this " + this);
        // Imprimir imprimir = new Imprimir(); 
        // Ahorro de variable
        new Imprimir().imprimir(this);
    }
    class Imprimir {
        public void imprimir(Persona persona) {
            System.out.println("persona desde Imprimir " + persona);
            System.out.println("imprimir el objeto actual (this) " + this);
        }
    }
}
