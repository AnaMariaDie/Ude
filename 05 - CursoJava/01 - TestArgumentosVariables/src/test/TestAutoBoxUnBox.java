package test;

public class TestAutoBoxUnBox {
    public static void main(String[] args) {
        /* Todos los tipos primitivos tienen asociada una clase Wrapper o envolvente
           int = Integer            byte = Byte
           long = Long              boolean = Boolean
           float = Float            short = Short
           double = Double          char = Character
        si solo queremos utilizar objetos en java podemos usar las clases envolventes(por el acceso a los metodos), 
        pero si usamos algoritmos lo recomendable es utilizar los tipos primitivos
        */
        // Autoboxing (primitivo a Object)
        int entero = 10; 
        Integer entera = 20; // clase entera 
        System.out.println("int entero = " + entero); // literal entera
        System.out.println("Integer entera = " + entera); // clase entera numero, podmeos usar para calcular
        System.out.println("String entera = " + entera.toString()); // entera tipo String o podemos convertirlo a int
        System.out.println("double entera = " + entera.doubleValue()); // float, long, short o double
        // Unboxing (Object a primitivo)
        // Al objeto que almacenaba una literal se le extrae
        int numero = entera;
        System.out.println("int numero " + numero);
        System.out.println("suna int = " + (entero + numero));
    }
}
