package test;

import domain.*;

public class TestSobreescritura {

    public static void main(String[] args) {

        Gerente gerente1 = new Gerente("Pedro", 15000, "Finanzas");
        System.out.println(gerente1.obtenerDetalles());
        System.out.println("------------------------------------------");
        // Polimorfismo = Multiples comportamientos. En tiempo de ejecucion
        Empleado empleado = new Empleado("Juan", 5000);
        System.out.println(empleado.obtenerDetalles());
        imprimir(empleado); // referencia clase padre
        System.out.println("------------------------------------------");
        empleado = new Gerente("Karla", 10000, "Contabilidad");
        imprimir(empleado);
//        Gerente gerente = new Gerente("Karla", 10000, "Contabilidad");
//        System.out.println(gerente.obtenerDetalles());
//        imprimir(gerente); // referencia clase hija
//        System.out.println("------------------------------------------");
    }

    /* Metodo que va a imprimir el metodo de la clase padre o la clase hija dependiendo de la 
    referencia del objeto que se este pasando al momento de ejecutar el programa. Va a recibir un tipo, como sera
    de la clase padre o hija, debemos colocar uno que sea compatible colocaremos el de la clase padre.
    SIRVE PARA TENER METODOS MAS GENERICOS QUE PERMITAN LA IMPRESION DE REFERENCIAS TANTO DE CLASES PADRE O HIJAS
     */
    public static void imprimir(Empleado empleado) {
        System.out.println("empleado " + empleado.obtenerDetalles());
    }
}
