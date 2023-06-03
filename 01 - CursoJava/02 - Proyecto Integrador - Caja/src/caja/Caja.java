package caja;

public class Caja {
    // Atributos
    int ancho;
    int alto;
    int profundo;

    // Constructor Vacio 
    public Caja() {
        System.out.println("Ejecutandose el Constructor Vacio");
    }

    // Constructor con Argumentos
    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
        System.out.println("Ejecutandose el Constructor con Argumentos");
    }

    // Metodo sin retorno
    public int calcularVolumen() {
        int volumen = ancho * alto * profundo;
        System.out.println("El Volumen de la caja es:" + volumen);
        return volumen;
    }

    // Metodo con retorno
    public int calcularVolumenConRetorno(int ancho, int alto, int profundo) {
        int volumen = ancho * alto * profundo;
        System.out.println("El Volumen de la caja es:" + volumen);
        return volumen;
    }

}
