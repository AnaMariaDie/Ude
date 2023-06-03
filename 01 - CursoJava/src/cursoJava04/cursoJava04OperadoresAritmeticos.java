package cursoJava04;

public class cursoJava04OperadoresAritmeticos {

    public static void main(String[] args) {
        int a = 3, b = 2;
        int resultado = a + b;
        System.out.println("Resultado Suma = " + resultado);
        resultado = a - b;
        System.out.println("Resultado Resta = " + resultado);
        resultado = a * b;
        System.out.println("Resultado Multiplicacion = " + resultado);
        /* Si los numeros de la operacion son enteros, no importa si el resultado esta como flotante
        el calculo no dara correctamente (3/2=1.0)
        Debemos colocar en el numero a dividir su valor son la D para que devuelva el resultado correcto        
         */
        double resultado2 = 3D / b;
        System.out.println("Resultado Division = " + resultado2);
        //Modulo, resultado de la division, pero solo el entero. 
        resultado = a % b;
        System.out.println("Resultado Modulo = " + resultado);
        /*  Si el if solo tiene una linea y se encuentra dentro de la estructura del if
        puede omitirse el uso de llaves, lo mismo ocurre con el else
        si es par el resultado devuelve 0 pero si es impar el resultado devuelve 1
         */
        if (b % 2 == 0) {
            System.out.println("Es numero par ");
        } else {
            System.out.println("Es numero impar ");
        }

    }
}
