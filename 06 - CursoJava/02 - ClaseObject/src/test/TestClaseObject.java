package test;

import domain.*;

public class TestClaseObject {

    public static void main(String[] args) {
        // new crea nuevas referencias en memoria
        Empleado empleado1 = new Empleado("Juan", 5000);
        Empleado empleado2 = new Empleado("Juan", 5000);
        // El uso de == compara referencias en memoria 
        if (empleado1 == empleado2) {
            System.out.println("Tienen la misma referencia en memoria");
        } else {
            System.out.println("Tienen distinta referencia en memoria");
        }
        System.out.println("-----------------------------------------");
        // Para comparar el contenido utilizaremos el metodo equals en la clase empleado
        // Si lo hacemos con la ayuda del IDE este nos pedira realizar ambos equals y hashcode
        // Metodo equals
        if (empleado1.equals(empleado2)) {
            System.out.println("Los objetos son iguales en contenido");
        } else {
            System.out.println("Los ojbetos son diferentes en contenido");
        }
        System.out.println("-----------------------------------------");
        // Metodo hashcode
        if (empleado1.hashCode() == empleado2.hashCode()) {
            System.out.println("El valor hashcode es igual");
        } else {
            System.out.println("El valor hashcode es distinto");
        }
    }
}
