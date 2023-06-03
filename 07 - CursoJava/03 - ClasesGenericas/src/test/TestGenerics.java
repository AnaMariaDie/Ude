package test;

import genericos.ClaseGenerica;

public class TestGenerics {

    public static void main(String[] args) {
        // Indicar el tipo con el que trabajamos debemos hacerlo entre los <>, puede ser cualquier tipo Object
        // No podemos utilizar tipos primitivos, solo las clases envolventes equivalentes.
        // Dentro del constructor debemos especificar el valor con el que vamos a inicializar el objeto.
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
        objetoInt.obtenerTipo();
        
        // La ventaja es con este mismo molde podemos crear otro objeto de esta clase indicando otro tipo.
        ClaseGenerica<String> objetoString = new ClaseGenerica("Juan");
        objetoString.obtenerTipo();
        // Al definir un tipo debe coincidir con el tipo que estamos proporcionando o ser un tipo compatible, es 
        // decir que primero podemos colocar un tipo de clase padre y luego proporcionar un tipo de clase hija o
        // primero colocar un tipo interface y luego proporcionar un tipo que implemente la interface.
    }
}
