package enumeracion;

public enum Continentes {
    /* Queremos definir paises dentro de los continentes, lo haremos con el atributo paises y sera final porque
       una vez definido no queremos que se modifique. Le pasaremos al continente la cantidad de paises por parametro
       y crearemos un contructor que se va a asociar a cada elemento de la enumeracion y tomara como parametro los 
       paises
     */
    AFRICA(53),
    AMERICA(34),
    ASIA(44),
    EUROPA(46),
    OCEANIA(14);

    private final int paises;

    // Constructor que se asociará a cada elenteto de la enumeracion, que usaremos para inicializar el atributo de paises
    Continentes(int paises) {
        this.paises = paises;
    }
    
    public int getPaises() {
        return this.paises;
    }
}
