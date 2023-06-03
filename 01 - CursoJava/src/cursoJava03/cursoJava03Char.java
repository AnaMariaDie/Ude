package cursoJava03;

public class cursoJava03Char {

    public static void main(String[] args) {
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);
        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);
        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        /*
        Si usamos la variable var lo tomara bien salvo el codigo 33 ya que tomara la literal como entero.
         */
        int variableEnteraSimbolo = '!';
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);
        int letra = 'a';
        System.out.println("letra = " + letra);
        int letra1 = 'A';
        System.out.println("letra1 = " + letra1);
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);
        if (varBoolean == true) { //Tambien podemos escribir solo (varBoolean) sin especificar
            System.out.println("La Bandera es Verdadera");
        } else {
            System.out.println("La Bandera es Falsa");
        }
        int edad = 30;
//        boolean esAdulto = edad >= 18;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}
