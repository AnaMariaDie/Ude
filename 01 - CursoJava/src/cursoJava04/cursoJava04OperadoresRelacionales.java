package cursoJava04;

public class cursoJava04OperadoresRelacionales {

    public static void main(String[] args) {
        int a = 3, b = 2;
        // Operador de Igualdad (==) devuelve un boolean (true or false)
        boolean c = (a == b);
        System.out.println("c = (a == b) = " + c);
        // Operador Diferente a (!=)
        boolean d = (a != b);
        System.out.println("d = (a != b) = " + d);
        /* Si estamos trabajando con Objetos y usamos el operador ==, lo que realmente se va a 
        comparar son las referencias que almacenan las variables que apuntan a los Objetos.
        Si trabajamos con Cadenas, no usaremos el operador == sino que hay un metodo especial para preguntar
        si el contenido de una Cadena es igual al de otra Cadena y es el metodo equals 
        Cadena.equals(Cadena2)
         */
        String cadena = "hola";
        String cadena2 = "adios";
        String cadena3 = "hola";
        boolean e = cadena.equals(cadena2);
        boolean f = cadena.equals(cadena3);
        System.out.println("hola == adios = " + e);
        System.out.println("hola == hola = " + f);
        // Operadores realcionales - Mayor > ; Mayor o Igual >= ; Menor < ; Menor o Igual <=        
        boolean g = (a >= b);
        boolean h = (a <= b);
        System.out.println("a >= b = " + g);
        System.out.println("a <= b = " + h);
        // Algoritmo consulta edad
        int edad = 30;
        int esAdulto = 18;
        if (edad >= esAdulto) {
            System.out.println("Es adulto");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}
