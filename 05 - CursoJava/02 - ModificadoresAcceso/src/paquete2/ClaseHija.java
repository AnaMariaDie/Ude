package paquete2;

import paquete1.Clase1;

public class ClaseHija extends Clase1{
    
    public ClaseHija() {
        // Constructor de la Clase Padre
        super();
        // Artibuto Protegido
        this.atributoProtegido = "Modificacion Atributo Protegido";
        System.out.println("Atributo Protegido " + this.atributoProtegido);
        // Metodo Protegido
        this.metodoProtegido();
    }
}
