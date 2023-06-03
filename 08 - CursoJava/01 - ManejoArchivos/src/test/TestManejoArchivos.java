package test;

import static manejoarchivos.ManejoArchivos.crearArchivo;

public class TestManejoArchivos {

    public static void main(String[] args) {
        /* No vemos la creacion en la vista de proyecto pero si en la vista de files.
        Tambien podemos pasar una ruta de archivo en el nombre. por ejemplo c:\\carpeta\\prueba.txt 
        (se usa doble diagonal ya que la primera es para escapar este caracter de diagonal inversa, ya que como 
        sabemos este caracter en cadenas se usa como caracter de escape. Recordemos que tenemos que estar seguros
        de tener permisos para escribir en esa carpeta, de lo contrario no podremos agregar este archivo)
        */
        String nombreArchivo = "prueba.txt";
        crearArchivo(nombreArchivo);
    }
}
