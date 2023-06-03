package ar.com.adm.ventas;

import jdk.nashorn.internal.codegen.CompilerConstants;

public class Orden {

    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    // Para saber cuantos productos se agregaron al arreglo
    private static int contadorProductos;
    // Constante
    private static final int MAX_PRODUCTOS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        // Inicializamos el arreglo con nuestra constante
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
        contadorProductos = 0;
    }

    public void agregarProducto(Producto producto) {
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
            this.productos[this.contadorProductos++] = producto;
//                
//                this.contadorProductos < Orden.MAX_PRODUCTOS) {
//            this.productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado el maximo de productos: " + Orden.MAX_PRODUCTOS);
        }
    }
    // Calcular el total de la Orden
    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            // Producto que iteramos en este momento, variable local.
            // Producto producto = this.productos[i];
            // Llamamos al metodo getPrecio
            // total += producto.getPrecio();
            // tambien se puede indicar esto en una linea. Obtener el precio de cada producto
            total += this.productos[i].getPrecio();
        }
        return total;
    }
    
    public void mostrarOrden() {
        System.out.println("Id. Orden: " + this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("Total de la Orden: $ " + totalOrden);
        System.out.println("Productos de la Orden: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
    }
}
