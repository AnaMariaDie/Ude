package domain;
// Clase Hija

public class Gerente extends Empleado {

    // Atributo de Gerente
    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    /* @ = anotacion. Lo que hace es modificar de cierta manera el comportamiento del metodo que esta definido
    posterior a la anotacion. Lo que le indica al compilador es que este metodo esta siendo sobreescrito desde
    la clase padre. Utilizamos el super para llamar al metodo y obtener los detalles de la Clase Padre.
    */
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", \nDepartamento: " + this.departamento;
    }
}
