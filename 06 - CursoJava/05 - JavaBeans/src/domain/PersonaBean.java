package domain;
    // Se acostumbra colocar luego del nombre de la clase BEAN, pero no es necesario
    // Para que sea BEAN debe implementar la Interface Serializable que debemos importar del paquete 
import java.io.Serializable;
import java.util.Objects;

public class PersonaBean implements Serializable{
    
    // Atributos tienen que ser privados
    private String nombre;
    private String apellido;
    
    // Constructor vacio publico
    public PersonaBean() {
    }
    
    // Constructor no necesario pero puede tenerlo
    public PersonaBean(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    // Getter y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
 
    // Metodos To String 
    @Override
    public String toString() {
        return "PersonaBean{" + "nombre = " + nombre + ", apellido = " + apellido + '}';
    }
    // Metodo Equals y Hashcode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + Objects.hashCode(this.apellido);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PersonaBean other = (PersonaBean) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return true;
    }
    
}
