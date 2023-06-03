package excepciones;
/**
 * @author Ana
 */
public class OperacionRuntimeExcepcion extends RuntimeException{
    // No hay diferencia en la clase de excepcion, si para su uso. El compilador no nos obliga a procesar este 
    // tipo de excepciones
    public OperacionRuntimeExcepcion(String mensaje) {
        super(mensaje);
    }
    /* Actualmente se recomienda utilizar excepciones de tipo RuntimeExceptions que limpien mas nuestro codigo y
    solo hacer try/catch de las excepciones que realmente estamos seguros que pueden suceder. Si no estmaos 
    seguros que la excepcion puede ocurrir nuestro codigo debe quedar lo mas limpio posible.
    
    */
}
