package cursoJava04;

public class cursoJava04OperadoresTernarios {

    public static void main(String[] args) {
        /* Operador Ternario (condicion ? verdadera : falsa) - Tiene tres partes, una condicion a evaluar y dependiendo del valor de 
        la evaluacion, regresa uno u otro valor. Es muy util para simplificar el uso de estructuras
        if-else
         */
        String resultado = (3 < 2) ? "verdadero" : "falso";
        System.out.println("resultado = " + resultado);
        int numero = 15;
        resultado = (numero % 2 == 0) ? "Es Par" : "Es Impar";
        System.out.println("resultado = " + resultado);
    }

}
