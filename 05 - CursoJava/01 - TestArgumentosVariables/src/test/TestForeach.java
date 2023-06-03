package test;

import persona.Persona;

public class TestForeach {

    public static void main(String[] args) {
        int edades[] = {5, 6, 8, 9};
        for (int edad : edades) {
            System.out.println("edad = " + edad);
        }

        // Utilizamos el Foreach en arreglo Personas
        Persona personas[] = {new Persona("Juan"), new Persona("Karla"), new Persona("Agustin")};
        for (Persona persona : personas) {
            System.out.println("persona = " + persona);
        }
    }
}
