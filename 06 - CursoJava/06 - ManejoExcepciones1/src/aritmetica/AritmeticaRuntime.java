package aritmetica;

import excepciones.OperacionRuntimeExcepcion;

public class AritmeticaRuntime {
    // Una diferencia es que el compilador no nos obliga a agregar esta excepcion en la firna del metodo
    // Esto deja a nuestro codigo mas limpio, pero si creamos la excepcion
    public static int division(int numerador, int denominador){
        if (denominador == 0) {
            throw new OperacionRuntimeExcepcion("Division por cero");
        }
        return numerador / denominador;
    }
}
