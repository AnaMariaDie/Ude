package cursoJava05;

import java.util.Scanner;

public class cursoJava05SentenciasControl {

    public static void main(String[] args) {
        boolean condicion = false;
        //  Si en if o else hay solo una linea de codigo pordemos no colocar las llaves
        if (condicion == true) {
            System.out.println("Condicion Verdadera");
        } else {
            System.out.println("Condicion Falsa");
        }
        // Ejercicio de convertir numero a letra
        int numero = 4;
        String numeroTexto = "Numero Desconocido";

        if (numero == 1) {
            numeroTexto = "Numero Uno";
        } else {
            if (numero == 2) {
                numeroTexto = "Numero Dos";
            } else {
                if (numero == 3) {
                    numeroTexto = "Numero Tres";
                } else {
                    if (numero == 4) {
                        numeroTexto = "Numero Cuatro";
                    } else {
                        numeroTexto = "Numero no encontrado";
                    }
                }
            }
        }
        System.out.println("numeroTexto = " + numeroTexto);

        // Segun el mes que estacion es?
        // Ejemplo con ingreso de mes por usuario
        Scanner consola = new Scanner(System.in);
        int mes = Integer.parseInt(consola.nextLine());
//        int mes = 1;
        String estacion = "Estacion Desconocida";

        if (mes == 1 || mes == 2 || mes == 3) {
            estacion = "Verano";
        } else {
            if (mes == 4 || mes == 5 || mes == 6) {
                estacion = "Otoño";
            } else {
                if (mes == 7 || mes == 8 || mes == 9) {
                    estacion = "Invierno";
                } else {
                    if (mes == 10 || mes == 11 || mes == 12) {
                        estacion = "Primavera";
                    }
                }
            }
        }
        System.out.println("estacion = " + estacion);
    }
}
