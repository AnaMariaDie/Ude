package cursoJava07Clases;

public class cursoJava07Clases {
    
    public static void main(String[] args) {
        
        Persona persona1;
        persona1 = new Persona();
        /* Aqui mandamos a llamar al constructor que nos permitira asignar valores al objeto desde su creacion
        y reservar memoria, ya que objetos y variables se almacenan en lugares diferentes de la memoria.
        Una vez creado el objeto, se regresa a la referencia donde se ha creado este objeto y se le asigna
        a la variable persona1. Con esta linea ya se puede acceder a los atributos y metodos de este objeto.
        */
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.desplegarInformacion();
        
        Persona persona2 = new Persona();
        System.out.println("persona1 = " + persona1);
        System.out.println("persona2 = " + persona2);
        persona2.desplegarInformacion();
        persona2.nombre = "Carla";
        persona2.apellido = "Lara";
        persona2.desplegarInformacion();
    }
}
