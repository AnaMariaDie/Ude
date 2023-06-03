package cursoJava03;

import java.util.Scanner;

public class cursoJavaTarea {

    public static void main(String[] args) {
        String nombre;
        int id;
        double precio;
        boolean envioGratuito;
        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona el nombre: ");
        nombre = consola.nextLine();
        System.out.println("Proporciona el id: ");
        id = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el precio: ");
        precio = Double.parseDouble(consola.nextLine());
        System.out.println("Proporciona el envio gratuito: ");
        envioGratuito = Boolean.parseBoolean(consola.nextLine());
        System.out.println(nombre + " #" + id);
        System.out.println("Precio $ " + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);   
           }
} 
//        Profesor Resolucion
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Proporciona el nombre:");
//        String nombre = scanner.nextLine();
//        System.out.println("Proporciona el id:");
//        int id = Integer.parseInt(scanner.nextLine());
//        System.out.println("Proporciona el precio:");
//        double precio = Double.parseDouble(scanner.nextLine());
//        System.out.println("Proporciona el envio gratuito:");
//        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());
// 
//        System.out.println(nombre + " #" + id);
//        System.out.println("Precio: $" + precio);
//        System.out.println("Envio Gratuito: " + envioGratuito);

