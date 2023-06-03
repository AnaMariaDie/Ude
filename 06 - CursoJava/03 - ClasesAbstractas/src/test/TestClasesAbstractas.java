package test;

import domain.*;

public class TestClasesAbstractas {
    
    public static void main(String[] args) {
        // No podemos crear objetos de una clase abstracta, solo podemos trabajar con clases hijas
        // Las clases abstractas pueden no tener metodos abstractos pero se marcan asi para
        // no permitir su instanciacion. Aprovechamos para trabajar polimorfisto.
        // Tipo de la clase padre pero se instancia como clase hija.
        // Upcasting asignamos un tipoHijo a un tipoPadre.
        FiguraGeometrica figura = new Rectangulo("rectangulo");
        // Llamos el metodo dibujar, se ejecuta el metodo que tengan en comun entre ambas clases. Aqui toma 
        // prioridad la clase de menor jerarquia, pero aqui no se podria ejecutar el de la clase padre ya que 
        // es abstracto
        figura.dibujar();
    }
}
