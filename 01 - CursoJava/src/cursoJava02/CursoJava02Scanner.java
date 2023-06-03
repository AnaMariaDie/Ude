package cursoJava02;

import java.util.Scanner;

public class CursoJava02Scanner {
        public static void main(String[] args) {
            System.out.println("Escribe tu nombre: ");
            Scanner consola = new Scanner(System.in);
            String usuario = consola.nextLine();
            System.out.println("Usuario = " + usuario);
            System.out.println("Escribe un titulo: ");
            String titulo = consola.nextLine();
            System.out.println("Resultado = " + titulo + " " + usuario);
    }
}