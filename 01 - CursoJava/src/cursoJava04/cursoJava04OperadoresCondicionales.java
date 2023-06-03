package cursoJava04;

public class cursoJava04OperadoresCondicionales {

    public static void main(String[] args) {
        int a = 15;
        int valorMinimo = 0;
        int valorMaximo = 10;
        /* Operador Condicional AND (&&) devuelve un boolean.
        Si usamos >= y <= incluye extremos sino >< solo los comprendidos sin los extremos. 
        Si ambas condiciones son verdaderas devuelve un true, pero si alguna es falsa, devuelve falso.
         */
        boolean resultado = (a >= valorMinimo) && (a <= valorMaximo);
        if (resultado == true) {
            System.out.println("El valor esta dentro del rango");
        } else {
            System.out.println("El valor esta fuera de rango");
        }
        /* Operador Condicional OR (||) devuelve un boolean. | (alt + 124)
        Si alguna de las condiciones es verdadera devuelve un true, solo si ambas condiciones son falsas,
        devuelve falso.
         */
        boolean vacaciones = true;
        boolean diaDescanso = false;
        if (vacaciones || diaDescanso) {
            System.out.println("Padre puede asistir al juego de su hijo");
        } else {
            System.out.println("Padre esta ocupado");
        }
    }

}
