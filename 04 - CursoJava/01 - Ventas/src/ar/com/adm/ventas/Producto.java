package ar.com.adm.ventas;

public class Producto {
    // Podemos agregarle final ya que una vez que le asignemos un valor ya no lo vamos a poder modificar.
    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    private Producto() {
        this.idProducto = ++Producto.contadorProductos;
    }
    
    public Producto(String nombre, double precio) {
        // Llamada al constructor vacio
        this();
        this.nombre = nombre;
        this.precio = precio;
        
    }

    public int getIdProducto() {
        return this.idProducto;
    }   
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto {" + "idProducto = " + idProducto + ", nombre = " + nombre + ", precio = " +
                precio + '}';
    }
    
    
}
