package domain;
    //  Enumeracion de tipo de escritura
public enum TipoEscritura {
    // Solo dos tipos para agregar un atributo
    CLASICO("Escritura a mano"),
    MODERNO("Escritura digital");
    
    private final String descripcion;
    
    private TipoEscritura(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getDescripcion() {
        return this.descripcion;
    }
}
