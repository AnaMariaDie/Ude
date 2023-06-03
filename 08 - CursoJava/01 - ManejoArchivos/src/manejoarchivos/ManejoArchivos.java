package manejoarchivos;

import java.io.*;

public class ManejoArchivos {

    /* En esta clase vamos a manejar varios metodos, ya que el manejo de archivos implica varias operaciones 
    desde crear el archivo, guardar informacion en el archivo, eliminar informacion del archivo o eliminar por
    completo el archivo, entre otras. Crearemos metodos y dependiendo de la operacion que queramos realizar sera
    el metodo que vamos a mandar llamar. Los metodos que agregaremos a esta clase sera estaticos para que no 
    tengamos necesidad de crear un objeto de esta clase, vamos a poder utilizar estos metodos directamente.
    */
    
    /* En este primier metodo vamos a crear un archivo en nuestro disco duro, el metodo recibira un String
    y con este nombre de archivo vamos a crear el archivo. Vamos a usar File definimos una variable llamada 
    archivo e indicaremos la creacion de un nuevo tipo de archivo y entre los parentesis colocamos el String
    que recibimos. Vamos a importar esta clase del paquete java.io(que significa imput/output). Con esto creamos
    un objeto de tipo file en memoria, para guardarlo creamos un objeto de tipo PrintWriter, llamamos a la variable
    salida ya que vamos a escribir informacion al disco duro, creamos el objeto y en el parentesis le pasamos el 
    archivo creado como File e importamos esta clase, que como esta en el mismo paquete que file, podemos colocar *
    e importar todas las clases del paquete. Cuando creamos un objeto de esta clase, este constructor puede arrojar
    una excepcion, por lo que el IDE nos indica que no reportamos una excepcion llamada File Not Found. Esta 
    excepcion debe de ser cachada o declarada dentro del metodo para que nos indique este error. Si no se puede 
    crear el archivo el contructor nos envia la excepcion. 
    Podemos hacer dos cosas, 1. Agregar un bloque try/catch o 2. Reportamos esta excepcion en la firma del metodo
    (como esta excepcion hereda de la clase exception que es checked el compilador nos obliga a procesarla
    esto es add throws clause).
    Eligiendo la 1. podemos ayudarnos del IDE que nos indica como hacer el bloque(surround block with try/catch).
    Solo reportaremos la excepcion con printStackTrace e indicamos que lo mande a la consola standar.
    Hasta aqui aun no creamos el archivo en memoria, solo lo estamos abriendo. Para que se guarde en memoria 
    debemos cerrar el fluyo que se abrio, usando salida.close(). En este cierre se crea el archivo. Poemos avisar 
    con un mensaje
    */
    
    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } 
    }
}

