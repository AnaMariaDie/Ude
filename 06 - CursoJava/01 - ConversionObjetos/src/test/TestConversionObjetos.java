package test;

import domain.*;

public class TestConversionObjetos {

    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        System.out.println("empleado = " + empleado);
        System.out.println("-----------------------------------------");
        System.out.println("empleado = " + empleado.obtenerDetalles());
        System.out.println("-----------------------------------------");
        /* No podemos llamar un metodo de la clase hija ya que la variable apunta a la clase padre, 
           debemos convertirlo, con el parentesis indicamos el tipo al cual queremos convertir. 
           Envolviendo con otro parentesis el tipo y la variable podemos hacerlo o podemos asignarlo a una 
           variable de tipo Escritor para usar los metodos (DOWNCASTING)
         */
//        ((Escritor) empleado).getTipoEscritura();
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();
        System.out.println("-----------------------------------------");
        // Con el ULCASTING no es necesario indicar el tipo, ya que soporta bien el programa
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
    }
}
