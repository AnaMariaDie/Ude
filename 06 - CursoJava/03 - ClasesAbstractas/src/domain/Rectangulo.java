package domain;
    /* Clase hija, como extiende de Clase abstracta. El IDE advierte que debemos implementar todos los metodos
       asbstractos, y si no lo hacemos debemos marcar esta clase como abstracta.    
    */

public class Rectangulo extends FiguraGeometrica{
    
    // Constructor con parametro para llamar al Constructor de la Clase Padre
    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }
    
    // Aqui no se sobreescribe el metodo abstracto, ya que en la clase padre no tiene ningun comportamiento
    // Como es la primera vez que estamos agregando un comportamiento, se dice que lo estamos implementando.
    // Cuando se implementa ya no utilizamos abstract.
    // Con getClass nos imprime el tipo de la clase y para obtener el nombre simple de la clase podemos usar el
    // getSumpleName.
    @Override
    public void dibujar() {
        System.out.println("Se imprime el tipo: " + this.getClass());
        System.out.println("Se imprime el tipo: " + this.getClass().getSimpleName());
    }
}
