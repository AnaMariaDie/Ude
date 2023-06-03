package cursoJava02;

import java.util.Scanner;

public class CursoJava02Tarea {

    public static void main(String[] args) {
        System.out.println("Indique el Titulo del Libro: ");
        Scanner consola = new Scanner(System.in);
        String titulo = consola.nextLine();
        System.out.println("Indique el Nombre del Autor: ");
        String nombreAutor = consola.nextLine();
        System.out.println("Resultado = El libro: " + titulo + " fue escrito por " + nombreAutor);
    }
}
