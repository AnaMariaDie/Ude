package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        // Para llamar enumeraciones nos manejaremos como si fuera un atributo estatico
        // de entrada estos elementos son como cadenas
//        System.out.println("Dia 1: " + Dias.LUNES);
//        indicarDiasSemana(Dias.LUNES);

        System.out.println("Continente N° 2 " + Continentes.AMERICA);
        System.out.println("N° de Paises en el 2° Continente " + Continentes.AMERICA.getPaises());
        System.out.println("Continente N° 1 " + Continentes.AFRICA);
        System.out.println("N° de Paises en el 1° Continente " + Continentes.AFRICA.getPaises());
    }
    
    private static void indicarDiasSemana(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
                case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
                case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
                case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
                case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
                case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
                case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;
            default:
                System.out.println("Dato invalido");;
        }
    }
}
