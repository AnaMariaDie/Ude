package cursoJava03;

import java.util.Scanner;

public class cursoJava03ConversionTipos {
    
    public static void main(String[] args) {
//  Convertir String a Int
        String edad = "20";
        System.out.println("edad = " + edad);
//  Si lo convertimos
        String edad1 = "30";
        int numEdad1 = Integer.parseInt(edad1);
        System.out.println("numEdad1 = " + numEdad1);
//  Comprobamos si suma
        System.out.println("numEdad1 = " + (numEdad1 + 1));
        String valorPi = "3.1416";
        double valorPi2 = Double.parseDouble(valorPi);
        System.out.println("valorPi2 = " + valorPi2);
        System.out.println("valorPi2 = " + (valorPi2 + 1));
//  Ingreso de edad con String y conversion a Int
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingresa tu edad:");
        numEdad1 = Integer.parseInt(consola.nextLine());
        System.out.println("Tu Edad es : " + numEdad1);
//  Convertir Entero a String
        int edad3 = 25;
        String edadTexto = String.valueOf(edad3);
        System.out.println("edadTexto = " + edadTexto);
//  Convertir String a Char, solo un caracter
        String saludo = "hola";
        char soloLetra = saludo.charAt(0);
        System.out.println("soloLetra = " + soloLetra);
        System.out.println("Ingresa un caracter:");
        char caracter = consola.nextLine().charAt(0);
        System.out.println("El caracter ingresado es : " + caracter);
    }
}
