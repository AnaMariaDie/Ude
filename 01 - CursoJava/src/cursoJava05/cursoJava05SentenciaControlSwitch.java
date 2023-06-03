package cursoJava05;

import java.util.Scanner;

public class cursoJava05SentenciaControlSwitch {

    public static void main(String[] args) {
        /* La estructura switch evalua una espresion que puede ser numeros o String
        en base a ella, segun corresponda el caso ejecuta las sentencias comprendidas en el mismo.
        Dentro de cada caso debemos colocar la sentencia break para que una vez encontrado el caso, 
        se ejecuten las sentencias comprendidas y luego finalice la estructura switch.
        Sin este break, una vez encontrado igual continua con la revision de los casos.
        Luego de indicar los casos, podemos colocar una opcion que es si no corresponde ninguna de las 
        anteriores. Esto tiene una palabra reservada default.
        En general se utiliza en opciones de Menus
        
        Ejemplo convertir numero a texto, de 1 a 4
         */
        int numero = 2;
        String numeroTexto = "Valor Desconocido";
        switch (numero) {
            case 1:
                numeroTexto = "Numero Uno";
                break;
            case 2:
                numeroTexto = "Numero Dos";
                break;
            case 3:
                numeroTexto = "Numero Tres";
                break;
            case 4:
                numeroTexto = "Numero Cuatro";
                break;
            default:
                numeroTexto = "Caso no encontrado";
        }
        System.out.println("El valor ingresado es = " + numeroTexto);
//  Ejemplo con estacion del año segun mes, su ingreso proporcionado por usuario
        Scanner consola = new Scanner(System.in);
//        int mes = 1;
        System.out.println("Ingrese un mes en valor entero");
        int mes = Integer.parseInt(consola.nextLine());
        String estacion = "Estacion Desconocida";

        switch (mes) {
            case 1:
            case 2:
            case 3:
                estacion = "Verano";
                break;
            case 4:
            case 5:
            case 6:
                estacion = "Otoño";
                break;
            case 7:
            case 8:
            case 9:
                estacion = "Invierno";
                break;
            case 10:
            case 11:
            case 12:
                estacion = "Primavera";
                break;
        }
        System.out.println("La Estacion del año segun el mes indicado es: " + estacion);
    }
}
