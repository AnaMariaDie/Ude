package test;

import static aritmetica.Aritmetica.division;

public class TestExcepciones {

    public static void main(String[] args) {
        // Excepcion de Division por 0. 
        int resultado = 0;
        // Bloque try/catch para atrapar la excepcion y que el programa no se detenga de manera abrupta.
        try {
            resultado = 10 / 0;
        } catch (Exception e) {
            // La e es la variable que aloja la excepcion y luego imprimimos la pila de excepciones.
            e.printStackTrace(System.out);
        }
        System.out.println("resultado " + resultado);
        // Lo que se puede hacer es evitar la division por 0(try) o mandar a imprimir el mensaje(catch) y asi 
        // continuar con nuestro programa. Al final no se realiza la division y el mensaje que se imprime con el 
        // resultado es el valor por default.
        System.out.println("--------------------------------------------------------------");
        int resultado2 = 0;
        try {
            resultado2 = division(10, 0);
        } catch (Exception e) {
            System.out.println("Ocurrio un Error: ");
            // e.printStackTrace(System.out);
            // Tambien podemos solo imprimir el mensaje y no la pila de excepciones con
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Se reviso la division entre cero");
        }

        System.out.println("Resultado2 = " + resultado2);
        /* En try/catch podemos agregar un bloque finally que siempre se va a ejecutar incluso si ocurre una 
        excepcion. Podemos usarlo para cerrar recursos, por ejemplo si hemos abierto una conexion con una 
        base de datos o un archivo.
        Dentro del bloque try podemos procesar mas de una excecion, esto se hace dentro de los bloques catch, 
        que colocamos uno detras de otro, al cerrar el anterior. Se recomienda primero procesar las excepciones
        de menor jerarquia(primero clases hijas y por ultimo la clase padre).
         */
    }
}
