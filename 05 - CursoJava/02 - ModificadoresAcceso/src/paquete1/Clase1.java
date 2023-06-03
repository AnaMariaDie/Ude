package paquete1;

public class Clase1 {

    // Ejemplos de Modificador de Acceso Publico - Menos restrictivo
    public String atributoPublico = "Valor Atributo Publico";
    /* Modificador Protected accesible desde las clases hijas(Atributos, Constructores o Metodos)
     Con Super podemos acceder a los Constructores de la clase padre. Pero si es Privado ya no lo podremos 
     acceder incluso usando Super.
     */
    // Atributo Protegido olo lo podemos usar desde clases hijas
    protected String atributoProtegido = "Valor Atributo Protegido";

    public Clase1(String nombre) {
        System.out.println("Constructor Publico");
    }

    public void metodoPublico() {
        System.out.println("Metodo Publico");
    }

    // Constructor Protegido solo lo podemos usar desde clases hijas
    protected Clase1() {
        System.out.println("Constructor Protegido");
    }

    // Metodo Protegido solo lo podemos usar desde clases hijas
    protected void metodoProtegido() {
        System.out.println("Metodo Protegido");
    }
}
