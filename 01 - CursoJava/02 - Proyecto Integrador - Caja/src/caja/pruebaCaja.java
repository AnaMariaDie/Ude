package caja;

public class pruebaCaja {

    public static void main(String[] args) {

        Caja caja1 = new Caja();
        int pruebaVol1 = caja1.calcularVolumen();
        
        Caja caja2 = new Caja(1,2,3);
        int pruebaVol0 = caja2.calcularVolumen();
        System.out.println("Calculo de Volumen: " + pruebaVol0);
        int pruebaVol2 = caja2.calcularVolumenConRetorno(3,2,6);
        System.out.println("El Volumen de la caja2 es: " + pruebaVol2);
            
    }
}
