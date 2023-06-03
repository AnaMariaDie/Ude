package domain;

/* extends significa que hereda de Persona(clase padre). Las clases que no lo indiquen 
extends de Object.
 */
public class Empleado extends Persona {

    private int idEmpleado;
    private double sueldo;
    /* Contador de tipo static para contabilizar la cantidad de objetos de tipo empleado creamos.
    Esta incrementara en uno cada vez que se cree un nuevo objeto de este tipo. Esta variable
    es la que utilizaremos para asignar un valor unico al atributo idEmpleado.
     */
    private static int contadorEmpleado;

    /* Creamos el Constructor si elegimos uno de la clase padre, hace uno para la clase hija, pero
    como los constructores no se hereda, para inicializar los atributos de la clase padre hace uso de
    la palabra super. 
    public Empleado(String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
    }
     */
    // Constructor de la clase hija
    /* Como idEmpleado lo vamos a asignar de manera interna lo borramos e inicializamos el nombre de la
     clase padre*/
    // Para inicializar los argumentos de la clase padre, usaremos this y los llamaremos accediendo directamente
    // al atributo.
    public Empleado(String nombre, double sueldo) {
//        super(nombre);
//        this.idEmpleado = ++Empleado.contadorEmpleado;
        this();
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    // Constructor Vacio que inicializa el contador idEmpleado y mandarlo llamar desde el Constructor con 
    // argumentos para inicializar idEmpleado. Super siempre es la primera linea dentro de la clase hija a 
    // menos que necesitemos llamar a un constrictor de la propia clase. En este caso no utilizaremos super a que 
    // necesitamos utilizar this (para llamar al constructor vacio) y ambos no pueden usarse juntos.
    
    public Empleado() {
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }

    /* Como idEmpleado ya lo inicializamos y lo vamos a manejar internamente, solo crearemos el metodo
    get para este atributo.
     */

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // Metodo toString StringBuilder hace mas facil la concatenacion de cadenas y mas rapido
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" Empleado (idEmpleado) = ").append(this.idEmpleado);
        sb.append(", nombre = ").append(this.nombre);
        sb.append(", sueldo = ").append(this.sueldo);
        sb.append(")");
        // O podemos colocar para que acceda a todos los atributos de la clase padre
        sb.append(super.toString());
        return sb.toString();
        //"Empleado{" + "idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + '}';
    }

}
