package test;

import paquete1.Clase1;
import paquete2.ClaseHija;
import paquete3.ClasePrivada;

public class TestModificadoresAcceso {
    
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1("Publico");
        System.out.println("clase1 = " + clase1.atributoPublico);
        clase1.metodoPublico();
        System.out.println("-------------------------------------");
        ClaseHija claseHija = new ClaseHija();
        System.out.println("claseHija = " + claseHija);
        System.out.println("-------------------------------------");
        ClaseDefault claseDefault = new ClaseDefault("Default");
        System.out.println("claseDefault = " + claseDefault.atributoDefault);
        claseDefault.metodoDefault();
        System.out.println("-------------------------------------");
        ClasePrivada clasePrivada = new ClasePrivada("Publico");
        System.out.println("clasePrivada = " + clasePrivada.getAtributoPrivado());
       
    }
}
