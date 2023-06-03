package cursoJava04;

public class cursoJava04PrecedenciaOperadores {

    public static void main(String[] args) {

        /* Precedencia de Operadores - Prioridad de aplicacion en resolucion
        Primero los unarios (++, --, +, -, ~,!) (suma y resta unaria) Luego los ()
        Tercero los Aritmeticos (*,/,%) Luego la (+ y -) aritmetica y la concatenacion de cadena
        Posterior ver tabla        
         */
        int x = 5;
        int y = 10;
        int Z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("Z = " + Z);

        int resultado = 4 + 5 * 6 / 3;
        // Prioridad a multiplicacion y division y luego la suma 4 + ((5*6)/3) = 14
        System.out.println("resultado = " + resultado);
        resultado = (4 + 5) * 6 / 3;
        // Prioridad a parentesis y luego el resto de igual prioridad = 18
        System.out.println("resultado = " + resultado);
    }
}
