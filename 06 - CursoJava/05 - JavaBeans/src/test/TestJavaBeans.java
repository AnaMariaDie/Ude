package test;

import domain.PersonaBean;
    // Serializacion quiere decir que convertimos nuestro objeto a 0 y 1, bytes. Esto permite enviar esto por red
    // y volver a construir el objeto 
public class TestJavaBeans {

    public static void main(String[] args) {
        // Objeto creado con Constructor vacio
        PersonaBean persona = new PersonaBean();
        // Para asignar los valores a los atributos lo haremos mediante el objeto y usando los seters
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        // Imprimir los valores
        System.out.println("persona " + persona);
        // Imprimir los valores de manera individual con metodos get
        System.out.println("Persona: Nombre = " + persona.getNombre());
        System.out.println("Persona: Apellido = " + persona.getApellido());
    }
}
