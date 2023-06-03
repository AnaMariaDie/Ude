package cursoJava04;

import java.util.Scanner;

public class cursoJava04Tarea01 {

    public static void main(String[] args) {
        int alto = 0;
        int ancho = 0;
        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona el alto: ");
        alto = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el ancho: ");
        ancho = Integer.parseInt(consola.nextLine());
        int area = alto * ancho;
        System.out.println("Area: " + area);
        int perimetro = (alto + ancho) * 2;
        System.out.println("Perimetro: " + perimetro);
    }
}
        /* Solucion Profesor
        System.out.println("Proporciona el alto:");
        int alto = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el ancho:");
        int ancho = Integer.parseInt(scanner.nextLine());
        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
        */
