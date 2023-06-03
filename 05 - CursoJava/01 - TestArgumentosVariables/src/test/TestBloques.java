package test;

import persona.Persona;

public class TestBloques {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        System.out.println("id Persona " + persona1.getIdPersona());
        System.out.println(persona1.toString());
        Persona persona2 = new Persona();
        System.out.println("id Persona " + persona2.getIdPersona());
        System.out.println(persona2.toString());
    }
}
