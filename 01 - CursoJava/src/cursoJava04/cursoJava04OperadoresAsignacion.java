package cursoJava04;

public class cursoJava04OperadoresAsignacion {

    public static void main(String[] args) {
        int a = 3, b = 2;
        int c = a + 5 - 2;
        /* Asignacion de un resultado a una variable. 
           Primero se evalua la prioridad de operadores y va de izquierda a derecha
         */
        System.out.println("c = " + c);
        // Operador de Composicion de Suma += 
        a += 1; // a = a + 1 
        System.out.println("a = " + a);
        a += 3;
        System.out.println("a = " + a);
        // Operador de Composicion de Resta -= 
        a -= 2; // a = a - 2
        System.out.println("a = " + a);
        // Operador de Composicion de Multiplicacion *= 
        a *= 2; // a = a * 2
        System.out.println("a = " + a);
        // Operador de Composicion de Division /= 
        a /= 2; // a = a / 2
        System.out.println("a = " + a);
        // Operador de Composicion de Modulo %= 
        a %= 2; // a = a % 2
        System.out.println("a = " + a);
    }
}
