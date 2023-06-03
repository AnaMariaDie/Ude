
package cursoJava03;

public class cursoJava03Enteros {
    public static void main (String[] args) {
        /*
        Tipos Primitivos Enteros: byte, short, int, long
        */
        byte numeroByte = (byte)127;
        System.out.println("Valor de byte: " + numeroByte);
        System.out.println("Valor Minimo Byte : "  + Byte.MIN_VALUE);
        System.out.println("Valor Maximo Byte : "  + Byte.MAX_VALUE);
        short numeroShort = 32767;
        System.out.println("Valor de short: " + numeroShort);
        System.out.println("Valor Minimo Short : "  + Short.MIN_VALUE);
        System.out.println("Valor Maximo Short : "  + Short.MAX_VALUE);
        int numeroInt = (int)2147483648L; // Lo cambia a negativo
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor Minimo Int : " + Integer.MIN_VALUE);
        System.out.println("Valor Maximo Int : " + Integer.MAX_VALUE);
        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor Minimo Long : " + Long.MIN_VALUE);
        System.out.println("Valor Maximo Long : " + Long.MAX_VALUE);
    }
}
