package accesodatos;
  // Para implementar el comportamiento de una interface usamos la palabra "implements" y el nombre de la interface 
 // Con esto obligamos a las clases que quieren implementar la interface a que agreguen el comportamiento definido 
 // en sus metodos. Si no lo hacemos establos obligados a definir la clase como abstracta.
public class ImplementacionMySql implements IAccesoDatos{
    // Implementacion de Metodos.
    // En la implementacion por default del IDE agrega una excepcion. Si mandamos llamar al metodo nos va a 
    // arrojar una excepcion ya que nos indica que todavia no hemos implementado el metodo, debemos agregar el 
    // codigo.
    @Override
    public void insertar() {
        System.out.println("Insertar desde MySql");
    // throw new UnsupportedOperationException("Not supported yet."); 
    //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listar() {
        System.out.println("Listar desde MySql");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde MySql");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde MySql");
    }
    
}
