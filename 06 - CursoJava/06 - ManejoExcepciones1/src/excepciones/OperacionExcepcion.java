package excepciones;

/* Crearemos una clase personalizada para que cuando ejecutemos la operacion de division, el compilador
   nos obligue a agregar la sintaxis de try/catch 
 */
public class OperacionExcepcion extends Exception {

    /* Si extiende de Exception el compilador nos oblica a agregar un bloque try/catch para atrapar la excepcion 
        (Tipo CheckedException) o a propagar esta excepcion.
       Si extiende de RuntimeException el compilar no nos obliga a agregar el bloque try/catch ni a reportarla 
        (Tipo UncheckedException) Excepciones en tiempo de ejecucion.
     */
    public OperacionExcepcion(String mensaje) {
        super(mensaje);
    }
    /* Cuando heredamos de la clase Exception lo que hacemos es mandar un mensaje pero este mensaje lo debemos de
       propagar hacia la clase padre. Para ello creamos un Constructor que recibe un String donde indicamos cual 
       es el mensaje de la excepcion. Y para inicializar correctamente la clase de excepcion, propagamos este 
       mensaje hacia la clase padre, con super(mensaje). Con esto es suficiente para definir nuestra propia clase 
       de excepcion
     */

}
