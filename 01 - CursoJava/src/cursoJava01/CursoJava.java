package cursoJava01;

public class CursoJava {

    public static void main(String[] args) {
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
//        Modificar el valor de la variable ya definida
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);
//        System.out.println("miVariableCadena = " + miVariableCadena);
        
//  var - Inferencia de tipos en Java
//      var miVariableEntera2 = 15;
//      System.out.println(miVariableEntera2);
//      var miVariableCadena2 = "Nueva Cadena";
//      System.out.println(miVariableCadena2);

//  Valores Permitidos en la definicion e Variables
    int miVariable = 1;
    int _miVariable = 2;
    int $miVariable = 3;
//    int áVariable = 4; no se recomienda utilizar. 
//  No permite utilizar caracteres especiales
        System.out.println("miVariable = "+miVariable);
        System.out.println("_miVariable = "+_miVariable);
        System.out.println("$miVariable = "+$miVariable);
    }
    
}
