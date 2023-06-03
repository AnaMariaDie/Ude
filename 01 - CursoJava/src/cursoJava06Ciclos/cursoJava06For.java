package cursoJava06Ciclos;

public class cursoJava06For {

    public static void main(String[] args) {

        /* Ciclo for, inicia revisando una condicion y si es verdadera se ejecuta el codigo y se puede
        incrementar/decrementar el contador asociado al ciclo, y vuelve a revisarse la condicion, si continua
        verdadera se repite, pero si es falsa se sale del ciclo.
        En Ciclo while y do/while, el contador es una variable externa, pero en el Ciclo for es interna
        tiene asignado un espacio para ella y puede tener mas de un contador.
        el mismo esta dentro del parentesis y separado por ; ( contador; condicion; incrementacion) luego van 
        las llaves que contienen las sentencias que se van a repetir hasta que la condicion sea falsa. 
        Al declararse la variable contador dentro del ciclo, no podemos usarla fuera de el, como si podemos 
        dentro de while y do/while
         */
        for (int contador = 0; contador < 3; contador++) {
            System.out.println("contador = " + contador);
        }
        // break rompe el ciclo
        // Ejemplo imprimir pares con break imprime solo el primer numero par 
        // sin break imprime todos los pares

        for (int contador = 0; contador < 3; contador++) {
            if (contador % 2 == 0) {
                System.out.println("contador = " + contador);
                break;
            }
        }
        // continue para que continue el ciclo
        // si no es numero par que continue la iteracion, es decir el numero de veces que se ejecuta el codigo
        for (int contador = 0; contador < 3; contador++) {
            if (contador % 2 != 0) {
                continue; // ir a la siguiene iteracion sin imprimir
            }
            System.out.println("contador = " + contador);
        }
        
        /* Etiquetas, nos permite indicarle a las palabras continue o break ir a un determinado lugar 
        especifico de nuestro programa. No es muy recomendable, se la conoce como go to y puede
        romper con la logica de nuestro programa.
        Agregamos un texto como Inicio: a donde debe volver. Si usamos continue podemos indicarle ir a inicio
        colocando continue inicio; esto podria ser util en el caso de for anidados
        
        */
    }
}
