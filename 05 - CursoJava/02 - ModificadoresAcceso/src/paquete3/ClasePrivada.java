package paquete3;

public class ClasePrivada {
    /* Modificador Privado no funciona en clases, si en Atributos (ya no se pueden modificar desde otra clase, 
       solo con metodo get y set) 
       Constructor Privado solo podra ser utilizado dentro de esta misma clase.
     */
    private String atributoPrivado = "Atributo Privado";
    
    private ClasePrivada() {
        System.out.println("Constructor Privado");
        this.metodoPrivado();
    }
    
    public ClasePrivada(String argumento) {
        this();
        System.out.println("Constructor Publico");
        this.metodoPrivado();
    }
    // Metodo Privado no accesible desde la Clase Hija. Si puede usarse si se ejecuta dentro del constructor.
    private void metodoPrivado() {
        System.out.println("Metodo Privado");
    }

    public String getAtributoPrivado() {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
    
    
}
