package domain;

import java.util.Date;

public class Cliente extends Persona {

    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;

    private static int contadorCliente;

    public Cliente(String nombre, char genero, int edad, String direccion, Date fechaRegistro, boolean vip) {
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" Cliente (idCliente) = ").append(this.idCliente);
        sb.append(", nombre = ").append(this.nombre);
        sb.append(", fechaRegistro = ").append(this.fechaRegistro);
        sb.append(", vip = ").append(this.vip);
        sb.append(")");
        // O podemos colocar para que acceda a todos los atributos de la clase padre
        sb.append(super.toString());
        return sb.toString();
    }

}
