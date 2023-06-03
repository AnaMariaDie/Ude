package test;

import domain.*;

public class TestInstanceOf {

    /* Determinar el tipo pero en tiempo de ejecucion. Es decir lo que se creo del lado derecho (new Empleado)
    la referencia que se asigna en memoria a la variable.
     */
    public static void main(String[] args) {
        /* empleado es de tipo Empleado en ambos casos, pero la referencia en la primera es Empleado y 
        en la segunda es Gerente. Una cosa es el tipo de la variable y otra cosa es el tipo al cual esta 
        apuntando en memoria.
         */
        Empleado empleado = new Empleado("Juan", 5000);
//        determinarTipo(empleado);
        empleado = new Gerente("Karla", 10000, "Contabilidad");
        determinarTipo(empleado);
        /* Dos formas de Conversion. Crear una variable local de tipo hija y asignarle la referencia en memoria de la 
           variable de tipo padre. Para ello debemos hacer una conversion. Debemos especificar el tipo al cual queremos
           convertir la variable. Asi asignamos la conversion a la variable gerente, con ella podemos acceder.
           Gerente gerente = (Gerente)empleado;
         */
    }

    /* Se consulta si la variable es una instancia de la clase hija. Se recomienda consultar primero por las 
    clases mas especificas y los ultimpos tipos deben ser los mas genericos hasta llegar a la clase object.
    Primero las clases hijas y ultimo las clases padre.
    Si no usamos else y solo if vemos porque debemos preguntar de hijas a padre. Indica que es Empleado y Object
     */
    public static void determinarTipo(Empleado empleado) {
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo Gerente");
            // Desde la clase hija no podemos acceder al atributo, pero podemos convertir a tipo padre. Esto es lo
            // que sugiere el IDE ((Gerente) empleado).getDepartamento();
            // debemos convertir la variable a una de tipo hijo y acceder al metodo.
            Gerente gerente = (Gerente) empleado;
            System.out.println("gerente = " + gerente.getDepartamento());
        } else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo Empleado");
        } else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
        }
    }
    // Esto nos sirve porque sabiendo de que tipo es podemos convertir una variable de tipo padre a una de 
    // tipo hijo. Esto para volver a tener acceso a los atributos y metodos de la clase hija.
}
