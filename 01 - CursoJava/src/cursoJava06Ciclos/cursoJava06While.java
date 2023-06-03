package cursoJava06Ciclos;

public class cursoJava06While {

    public static void main(String[] args) {
        /* Estructuras de Ciclo en la que se evalua una condicion y si se cumple se ejecuta una sentencia
        y vuelve a evaluarse la condicion, mientras esta se cumpla continua ejecutandose, hasta que la condicion
        ya no se cumple.
        Para esto utilizaremos una variable contador que incrementaremos.
        
         */
        int contador = 0;

        while (contador < 3) {
            System.out.println("contador = " + contador);
            contador++;
        }

        /* Estructura do/while. En este caso la/s sentencias se ejecutan primero, luego se evalua la condicion
        mientras que sea true se continua en el ciclo hasta que la condicion se vuelve false y se sale.
         */
        int contador2 = 3;

        do {
            System.out.println("contador2 = " + contador2);
            contador2++;
        } while (contador2 < 0);
    }
}
