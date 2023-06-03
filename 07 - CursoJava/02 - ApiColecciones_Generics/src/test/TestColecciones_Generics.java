package test;

import java.util.*;

public class TestColecciones_Generics {

    public static void main(String[] args) {
        /* Trabajando con Genericos, asi que la notacion <> nos ayuda a declarar el tipo de dato al momento de 
        utilizar la clase, y en la instanciación solo colocamos <>.
        Aqui cuando colocamos add, si damos clic nos indica que necesita un parametro String porque es lo que
        definimos. Lo ideal es que indiquemos el tipo que vamos a utilizar en nuestra lista, ya sea tipos interface
        o clase padre y luego agregar nuestros tipos de la clase indicada, o de clases que implementen la interface o
        clases hijas.
        Podemos ver que como no modificamos la Set, podemos agregar un object, enteros o Strings sin ningun 
        problema. Pero lo ideal es que no podamos agregar cualquier tipo de dato, sino que en tiempo de compilacion
        tengamos este tipo de validaciones.
        Por ello el API de Collections soporta los tipos genericos para indicar el tipo en tiempo de compilacion y 
        durante el mismo tengamos la validacion de los elementos que estamos agregando a la lista. 
        Otra ventaja es la validacion al recuperarlos también, ya no tenemos que hacer la converción de object al tipo
        que deseemos, podemos recuperar directamente un elemento del tipo indicado. Usamos el metodo get, el indice
        arranca en 0 y mandamos a imprimir el elemento.
         */
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        String elemento = miLista.get(0);
        System.out.println("elemento " + elemento);

        /* Para imprimir la lista debemos hacer unas modificaciones en el metodo imprimir.
        */
        imprimir(miLista);
        System.out.println("---------------------------------------------------");    
        /* Lo mismo ocurre con los Set.
        */        
        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles"); 
        miSet.add("Jueves");
        miSet.add("Viernes");   
        imprimir(miSet);
        System.out.println("---------------------------------------------------");
        /* Pero con el Map necesitamos aclarar el tipo de la llave y del valor.
        */
       
        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("Valor1", "Juan");
        miMapa.put("Valor2", "Karla");
        miMapa.put("Valor3", "Rosario");
        miMapa.put("Valor3", "Carlos");
        // Antes debiamos realizar una conversion pero ahora ya no.
        // Si introducimos una llave que ya tiene un valor asociado pero aqui indicamos otro, el valor anterior 
        // se substituira con el nuevo. No se duplican las llaves pero el valor asociado se modifica.
        String elementoMapa = miMapa.get("Valor1");
        System.out.println("Elemento Mapa = " + elementoMapa);
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }
    /* Aqui el metodo requiere un object para imprimir, podemos especificar que es del tipo String
    */
    public static void imprimir(Collection<String> collection) {
        collection.forEach((elemento) -> {
            System.out.println("Elemento = " + elemento);
        });
    }
}
