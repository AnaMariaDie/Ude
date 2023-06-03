package test;

import accesodatos.*;

public class TestInterfaces {

    public static void main(String[] args) {
        // Crearemos variables de tipo interface
        // El objetivo de POO es hacer codigo mas generico. 
        // El uso de interfaces va a permitir esto, hacer metodos mas genericos recibiendo tipos interface que 
        // pueden apuntar a objetos que hayan implementado esta interface.
        // Polimorfismo con la variable datos.
        IAccesoDatos datos = new ImplementacionMySql();
        datos.insertar();
        datos.listar();
        imprimir(datos);
        // Podemos reasignar la variable a un objeto de implementacionOracle
        datos = new ImplementacionOracle();
        datos.insertar();
        datos.listar();
        imprimir(datos);
    }
    // Metodo imprimir - Imprime segun el objeto al cual apunta en tiempo de ejecucion
    public static void imprimir(IAccesoDatos datos) {
        datos.actualizar();
    }
}
