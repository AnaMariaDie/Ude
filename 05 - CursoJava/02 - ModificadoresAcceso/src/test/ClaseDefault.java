package test;

class ClaseDefault {
    // Modificador Default o Package esta en ausencia de modificador.
    // Definida una Clase no puede accederse desde otro paquete (error si quierieramos asignarle clases hijas)
    
    // Atributo Default o Package
    String atributoDefault = "Valor Atributo Default";
    
    ClaseDefault(String nombre) {
        System.out.println("Constructor Default");
    }
    
    void metodoDefault() {
        System.out.println("Metodo Default");
    }
}
