package Operaciones;

public class Aritmetica {

    // Atributos de la clase
    int a;
    int b;

    // Constructor Vacio
    public Aritmetica() {
        System.out.println("Ejecutando el constructor vacio");
    }

    // Constructor con Argumentos
    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando el constructor con argumentos");
    }

    // Metodo
    public void sumar() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno() {
//        int resultado = a + b;
//        return resultado;
        // Podemos colocar esto es una sola linea
        return a + b;
    }

    // los argumentos se llaman igual que los atributos de la clase
    public int sumarConArgumentos(int a, int b) {
        this.a = a;
        this.b = b;
        // return a + b; *** reutilizamos el return
        return this.sumarConRetorno();
    }
}
