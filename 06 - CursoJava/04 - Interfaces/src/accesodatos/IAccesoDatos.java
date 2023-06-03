package accesodatos;
    // La I representa Interface. Al no ser una clase no heredamos de la clase object. Si podemos extender de 
    // otras interfaces 
public interface IAccesoDatos {
    // Si definimos atribustos deben ser constantes, hay que definirmos como "public final static"
    // Esta constante simulara la cantidad de registros que vamos a poder insertar en la base de datos.
    // Constantes van en mayusculas y si son mas de dos palabras se separan con guion bajo.
    // En una interface no podemos dejar un atributo sin asignarle un valor. 
    // Las interfaces no tienen Constructores y todos sus metodos seran publicos y abstractos.
    int MAX_REGISTROS = 10;

    void insertar();
    
    void listar();
    
    void actualizar();
    
    void eliminar();
    
    // Simularemos una implementacion pero no conectaremos con una base de datos
    // Agregaremos el comportamiento de los metodos
}
