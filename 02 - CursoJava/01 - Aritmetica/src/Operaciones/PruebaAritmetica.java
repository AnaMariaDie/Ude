package Operaciones;

public class PruebaAritmetica {

    public static void main(String[] args) {
        // Variables Locales al metodo. Se usan y se destruyen cuando finaliza su ejecucion.
        // Se almacenan en Memoria Stack.
        
        // Variables de Clase, se usan mientras se esta usando el objeto creado o referenciado.
        // Se destruyen una vez finalice la ejecucion del programa. 
        // Se almacenan en Memoria Heap. Aqui tambien se almacenan los atributos de clase.
                
        // Recolector de Basura o Garbage Collector
        // Se usa para eliminar los objetos que ya no son referenciados por ninguna variable
        // System.gc(); No es comun que nosotros agreguemos esta linea, sino que los administradores
        // de sistemas ejecutan una limpieza de sistema.
        
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("Aritmetica a:" + aritmetica1.a);
        System.out.println("Aritmetica b:" + aritmetica1.b);
        
//        Aritmetica aritmetica2 = new Aritmetica(5, 8);
//        System.out.println("Aritmetica a:" + aritmetica2.a);
//        System.out.println("Aritmetica b:" + aritmetica2.b);
//        aritmetica1.a = 3;
//        aritmetica1.b = 2;
//        aritmetica1.sumar();
//
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado desde la prueba = " + resultado);
//        
//        resultado = aritmetica1.sumarConArgumentos(5, 8); 
//        System.out.println("resultado usando argumentos = " + resultado);
    }
}
