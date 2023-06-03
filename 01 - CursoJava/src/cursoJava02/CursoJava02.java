package cursoJava02;

public class CursoJava02 {

    public static void main(String[] args) {
        String usuario = "Juan";
        String titulo = "Ingeniero";
        String union = titulo + " " + usuario;
        System.out.println("union = " + union);

//  Con Enteros
        int entero1 = 3;
        int entero2 = 4;
//  Devuelve la suma de los enteros
        System.out.println(entero1 + entero2);
//  Concatenar las Variables: de izquierda a derecha
        System.out.println(entero1 + entero2 + union);
//  Concatenar Cadena y Enteros: Si lo primero es cadena, toma al resto como cadena.
        System.out.println(union + entero1 + entero2);
//  Si queremos que sume enteros los encerramos en parentesis para darles prioridad en la ejecucion
        System.out.println(union + (entero1 + entero2));
        String nombre = "Carla";
        System.out.println("Nueva Linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Comilla Simple: \'" + nombre + "\'");
        System.out.println("Comilla Simple: \"" + nombre + "\"");
    }
}
