package ar.com.amd.ventas.test;

import ar.com.adm.ventas.Orden;
import ar.com.adm.ventas.Producto;



public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 50.00);
        Producto producto2 = new Producto("Pantalon", 100.00);
        Producto producto3 = new Producto("Medias", 10.00);
        Producto producto4 = new Producto("Remera", 30.00);
        Producto producto5 = new Producto("Vaquero", 125.00);
        Producto producto6 = new Producto("Campera", 200.00);
        Producto producto7 = new Producto("Polera", 145.00);
        Producto producto8 = new Producto("Buzo", 65.00);
        
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
        
        Orden orden2 = new Orden();
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto4);
        orden2.agregarProducto(producto5);
        orden2.agregarProducto(producto6);
        orden2.agregarProducto(producto7);
        orden2.agregarProducto(producto8);
        orden2.mostrarOrden();
        
    }
}
