package domain;

public class Persona {

    /* Las clases hijas pueden heredar los atributos protegidos no lo privados. 
    Si son publicos cualquiera puede acceder.
     */
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;

    // Creamos el Constructor vacio
    public Persona () {
        
    }
    
    // Creamos un Constructor con un argumento para inicializar el atributo nombre
    public Persona (String nombre) {
        this.nombre = nombre;
    }
    
    /* Otro Constructor que nos permite crear distintos objetos de distintas maneras.
    Hacemos un Constructor completo. Lo podemos hacer con insert code.
    */
    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }
    /* Luego agregamos los metodos get y set para cada atributo. Lo podemos hacer de igual con insert code.
    Ponemos encapsular fields para que utilice el operador this. Agregar operador en get si no lo usa.
    */

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    /* Agregamos el metodo toString de igual forma, donde imprimimos el estado del objeto con 
    cada uno de los atributos de nuestra clase.
    */

    @Override
    public String toString() {
        return " Persona {" + " nombre = " + nombre + ", genero = " + genero + ", edad = " + edad + ", direccion = " 
                + direccion + '}';
    }
    
}
