public class Carro extends Vehiculo{
    private boolean tieneVolante;
    
    private boolean tieneAireacondicionado;
    
    private boolean tieneRadio;
    
    private int puertas;
    
    private int asientos;
    
    public Carro(int ruedas, boolean tienemotor, boolean tienecambios, int espejos, boolean tieneVolante,
            boolean tieneAireacondicionado, boolean tieneRadio, int puertas, int asientos) {
        super(ruedas, tienemotor, tienecambios, espejos);
        this.tieneVolante = tieneVolante;
        this.tieneAireacondicionado = tieneAireacondicionado;
        this.tieneRadio = tieneRadio;
        this.puertas = puertas;
        this.asientos = asientos;
    }

    public boolean getTieneVolante() {
        return tieneVolante;
    }
    public void setTieneVolante(boolean tieneVolante) {
        this.tieneVolante = tieneVolante;
    }
    public boolean getTieneAireacondicionado() {
        return tieneAireacondicionado;
    }
    public void setTieneAireacondicionado(boolean tieneAireacondicionado) {
        this.tieneAireacondicionado = tieneAireacondicionado;
    }
    public boolean getTieneRadio() {
        return tieneRadio;
    }
    public void setTieneRadio(boolean tieneRadio) {
        this.tieneRadio = tieneRadio;
    }
    public int getPuertas() {
        return puertas;
    }
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    public int getAsientos() {
        return asientos;
    }
    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }
}
