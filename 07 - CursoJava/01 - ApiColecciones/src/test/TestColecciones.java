package test;

import java.util.*;

public class TestColecciones {

    public static void main(String[] args) {
        // Creamos un tipo de la interface List y creamos un objeto que implemente la interface List(ArrayList)
        /* Una lista es similar a un array, permite agregar varios elementos a nuestro arreglo, pero una ventaja 
        es que puede crecer dinamicamente, es decir no es necesario indicar la cantidad y ademas mantiene el Orden 
        en el cual se van agregando los elementos. Ademas los elementos pueden duplicarse.
        En cambio un Set, no guarda el Orden de los elementos tal como se van agregando. Aqui si agregamos un 
        elemento duplicado, el mismo se desecha y no se guarda.
        Dentro de este Objeto(miLista), podemos agregar cualquier tipo de objeto, ya que lo que recibe es un
        tipo OBJECT, utilizando el metodo add y agregamos el objeto. 
         */
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        imprimir(miLista);
        /* Para imprimir la lista podemos recorrer cada uno de los elementos utilizando un ciclo Foreach.
        Declaramos el for y definimos una variable que va a almacenar cada uno de los elementos que hemos agregado
        a nuestra lista, como esta tiene elementos de tipo OBJECT, el elemento a recuperar tambien sera de este tipo
        y lo llamaremos elemento, luego colocamos ":" y proporcionamos la lista que queremos iterar, en este caso 
        "miLista". Entre las llaves colocaremos el texto que queremos aparecza por pantalla y la variable elemento.
         */
        
        /* Uso de ForEach
        for (Object elemento : miLista) {
            System.out.println("Elemento " + elemento);
        }
        */
        //Uso de Operacion LAMDA
//        miLista.forEach((elemento) -> {
//            System.out.println("Elemento " + elemento);
//        });
        System.out.println("---------------------------------------------------");
        /* Ahora trabajemos Set, este tipo no respeta el orden en el que fueron agregados los elementos y cuando
        los mandemos imprimir, si lo hacen en este mismo orden sera pura coincidencia.
        Crearemos una variable(miSet) de tipo Set y la clase que implementara esta interface(existen varias pero 
        usaremos la mas comun) sera HashSet.
        Como ambas List y Set heredan de Collection pero el metodo heredado add no esta definido en estas interfaces
        (solo en la clase Padre), las clases que lo implementan(en este caso ArrayList y HashSet) deben agregarlo, 
        por ello podemos utilizar el mismo metodo para ambas interfaces(List y Set).
        */
        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles"); 
        miSet.add("Jueves");
        miSet.add("Viernes");
        /* Para no usar los metodos ya vistos, crearemos un metodo mas generico, aplicaremos polimorfismo y vamos
        a mandar a imprimir los elementos de una Coleccion, ya sea List o Set.
        */
        imprimir(miSet);
        System.out.println("---------------------------------------------------");
        /* Trabajaremos con Map(interface). Un mapa es una coleccion de elementos pero almacenados en el concepto
        de LlaveValor. Es decir por cada Llave que agreguemos le asociaremos un valor. La clase que implementara la 
        interface sera HashMap. Esta clase no hereda de Collection, porque lo que no usaremos el metodo add.
        La interface Map utiliza el metodo put. Este metodo cambia porque el concepto tambien cambia. Agregaremos 
        una llave(tipo Object) y le asociamos un valor a ella.
        */
        Map miMapa = new HashMap();
        miMapa.put("Valor1", "Juan");
        miMapa.put("Valor2", "Karla");
        miMapa.put("Valor3", "Rosario");
        /* Para acceder a los elementos del mapa podemos hacerlo con el metodo get del objeto miMapa, indicando la 
        llave y luego cuando imprima el elemento traera el valor asociado. Pero como aqui vamos a asociar este valor
        a un String, es decir, haremos un downcast debemos indicarlo antes del objeto (String).
        Si lo que queremos es recuperar todos los valores, podemos mandar llamar el metodo keySet, pero como regresa
        un Set, no se garantiza el orden. Pero el set sera el primer termino indicado, es decir las llaves. Pero si
        queremos imprimir los valores lo hacemos con el metodo values.
        */
        String elemento = (String) miMapa.get("Valor1");
        System.out.println("Elemento = " + elemento);
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }
    /* Crearemos un metodo statico que no regresara nada, lo llamaremos imprimir y va a reciir el tipo mas generico
    la interface Collection. Dentro iteraremos cada uno de los elementos para mostrarlos. Podemos usar el ciclo 
    Foreach o podemos utilizar la sintaxis de Lamda.
    */
    public static void imprimir(Collection collection) {
        collection.forEach((elemento) -> {
            System.out.println("Elemento = " + elemento);
        });
    }
}
