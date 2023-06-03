package domain;
    //  Clase padre, como tiene un metodo abstracto, la clase debe definirse como abstracta.
public abstract class FiguraGeometrica {
    protected String tipoFigura;
    
    protected FiguraGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    
    // En los metodos abstractos no abrimos y cerramos llaves, sino que colocamos ";"
    // Y como es abstracto, no estamos obligados a agregar un comportamiento por default, pero las hijas si.
    public abstract void dibujar();

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipoFigura = " + tipoFigura + '}';
    }   
    
}
