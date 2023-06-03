package test;

import static aritmetica.AritmeticaRuntime.division;

public class TestRuntimeExcepciones {
    
    public static void main(String[] args) {
        // Como en este metodo no esta reportada ninguna excepcion, podemos quitar el bloque try/catch y el 
        // compilador no nos marcara problemas. Sin embargo el problema va a seguir ocurriendo.
        // El programa termina abruptamente ya que no estamos controlando correctamente la excepcion.
        int resultado2 = 0;
            resultado2 = division(10, 0);
        System.out.println("Resultado2 = " + resultado2);      
    }
}
