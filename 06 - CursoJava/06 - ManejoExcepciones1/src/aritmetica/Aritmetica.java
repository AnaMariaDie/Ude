package aritmetica;

import excepciones.OperacionExcepcion;

public class Aritmetica {

    // Metodo de division. Lo creamos estatico para poder llamarlo sin necesidad de crear objetos de este tipo
    // Lo interesante de este sera reportar nuestras propias excepciones
    // Este metodo puede arrojar una excepcion y en la firma del metodo tambien tenemos que indicar la posible 
    // excepcion que va a arrojar este metodo, para ello utilizamos la palabra reservada throws y el nombre de la 
    // excepcion.
    public static int division(int numerador, int denominador) throws OperacionExcepcion {
        if (denominador == 0) {
            throw new OperacionExcepcion("Division por cero");
        }
        return numerador / denominador;
    }
}
