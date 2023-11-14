public class Case {
    private String modelo;
    private String fabricante;
    private String fuentepoder;
    private Dimensiones dimensiones;
    public Case(String modelo, String fabricante, String fuentepoder, Dimensiones dimensiones) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.fuentepoder = fuentepoder;
        this.dimensiones = dimensiones;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getFuentepoder() {
        return fuentepoder;
    }
    public void setFuentepoder(String fuentepoder) {
        this.fuentepoder = fuentepoder;
    }
    public Dimensiones getDimensiones() {
        return dimensiones;
    }
    public void setDimensiones(Dimensiones dimensiones) {
        this.dimensiones = dimensiones;
    }
    
    public void PresionarBotonEncendido(){
        System.out.println("Boton de encendido presionado.");
    }
}
