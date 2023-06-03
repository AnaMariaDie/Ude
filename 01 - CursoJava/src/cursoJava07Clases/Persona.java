package cursoJava07Clases;

public class Persona {
    /* La creacion de una clase se realiza primero definiendola, esta clase es 
        una plantilla con la que podemos crear objetos que tendran atributos (nombre, apellido) y 
        metodos (comer, dormir, etc).
        Primero se indica el paquete y nombre que es donde vamos a alojar el codigo/clase.
        Luego la palabra public nos indica que podemos acceder desde cualquier otro archivo, podemos declarar 
        aqui clases a las que no se puede acceder, luego indicamos que es una clase class y luego el nombre 
        de la clase que debe ir con mayuscula su primera letra (si hay mas de una palabra cada una debe ir en 
        mayuscula su primer letra).
        Primero colocamos los atributos y luego definiremos los metodos que va a tener esta clase.
        El metodo es una parte de codigo, puede reutilizarse y llamarla cuantas veces queramos. Podemos pasarle
        valores (argumentos) y puede regresar un valor (valor de retorno)
        Para definir un metodo iniciamos con la palabra reservada public que indica que podemos utilizarlo
        fuera de esta clase.
        Para definir el metodo iniciamos con public ya que podra utilizarse fuera de esta clase y la palabra 
        void que indica que no regresara valores o informacion, luego su nombre y () indicando que podria 
        recibir informacion (argumentos - no sera este caso). Luego dentro de llaves agregamos el cuerpo del 
        metodo. Aqui solo haremos que se despliequen los atributos (nombre y apellido). 
        A pesar de no estar definidos dentro del metodo podemos utilizarlos ya que son atributos de esta clase.
        Esto nos permite usarlos dentro de cualquier metodo definido dentro de esta clase.
        */
    // Atributos de la clase Persona
    public String nombre;
    public String apellido;
    // Metodo Desplegar Informacion
    public void desplegarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }
}
