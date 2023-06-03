package cursoJava11;

public class PasoPorValor {

    public static void main(String[] args) {
        int x = 10;
        System.out.println("El valor de x es:" + x);
        cambioValor(x);
        
        System.out.println("El valor de x ahora es:" + x);
    }

    public static void cambioValor(int arg1) {
        System.out.println("El valor del arg1 es: " + arg1);
        arg1 = 15;
    }
}
