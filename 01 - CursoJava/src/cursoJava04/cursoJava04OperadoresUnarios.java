package cursoJava04;

public class cursoJava04OperadoresUnarios {

    public static void main(String[] args) {
        int a = 3;
        // Operador Unario de Cambio de Signo (-)
        int b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        // Operador Unario de Negacion (!)
        boolean c = true;
        boolean d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        /* Operador Unario de Incremento
        1. Preincremento (++) se coloca antes de la variable, solo suma uno a la unidad
        primero se incrementa y luego se usa su valor. Esto modifica la variable preincrementada
         */
        int e = 3;
        int f = ++e;
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        /* 2. Posincremento (++) se coloca despues de la variable. 
        primero se guarda el valor en la variable nueva y luego queda pendiente el incremento 
        cuando la variable posincrementada se vuelva a leer se aplica. Esto seria cuando la estamos ejecutando
         */
        int g = 5;
        int h = g++;
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        /* Operador Unario de Decremento
        1. Predcremento (--) se coloca antes de la variable, solo resta uno a la unidad
        primero se decrementa y luego se usa su valor. Esto modifica la variable predecrementada
         */
        int i = 2;
        int j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        /* 2. Posdecremento (--) se coloca despues de la variable. 
        primero se guarda el valor en la variable nueva y luego queda pendiente el decremento 
        cuando la variable posdecrementada se vuelva a leer se aplica. Esto seria cuando la estamos ejecutando
         */
        int k = 4;
        int l = k--;
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
