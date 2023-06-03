package test;

public class TestArgumentosVariables {

    public static void main(String[] args) {
        imprimirNumeros(3, 4, 5);
        imprimirNumeros(1, 2);
        variosParametros("Juan", 8, 9, 10);
    } 
    /* Metodo con VarArg Argumentos variables. Se define en los parametros que recibe el metodo (el tipo de dato + 
    ... (que indica que no se sabe cuantos se van a pasar) + nombre de argimento) 
    Solo hasta el momentos que se ejecuta el codigo es que se define cuantos argumentos va a recibir el metodo
    */
    // Lo definimos privado porque solo lo usaremos aqui y estatico para que se use en el metodo estatico main
    // dentro del for, una vez pasados los argumentos, numeros se convertira en un arreglo por ello podemos usar
    // length
    private static void imprimirNumeros(int... numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento: " + numeros[i]);   
        }
    }
    // En el caso que pasemos mas de un tipo, el de VarArg debe ser el ultimo    
    private static void variosParametros(String nombre, int... numeros) {
        System.out.println("Nombre: " + nombre);
        imprimirNumeros(numeros);
    }
}
