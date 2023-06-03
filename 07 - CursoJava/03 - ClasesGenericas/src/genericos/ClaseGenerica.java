package genericos;

public class ClaseGenerica <T>{
    // Utilizaremos una <T> para indicar un tipo generico y al momento de utilizarlo se va a definir el mismo.
    // De esta forma tendremos una plantilla generica hasta el momento de utilizarla.
    // Atributo generico
    private T objeto;
    
    // Constructor que inicializa el atributo
    public ClaseGenerica(T objeto) {
        this.objeto = objeto;
    }
    
    // Metodo para obtener el tipo con getClass y getSimpleName
    public void obtenerTipo() {
        System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
    }
}
