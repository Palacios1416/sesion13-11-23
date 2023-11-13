public class HondaS2000 extends Carro {
    private String color;
    private boolean cajuela;
    private boolean transmision; //true-manual  false-automatica
    
    public HondaS2000(int ruedas, boolean tienemotor, boolean tienecambios, int espejos, boolean tieneVolante,
            boolean tieneAireacondicionado, boolean tieneRadio, int puertas, int asientos, String color,
            boolean cajuela, boolean transmision) {
        super(ruedas, tienemotor, tienecambios, espejos, tieneVolante, tieneAireacondicionado, tieneRadio, puertas,
                asientos);
        this.color = color;
        this.cajuela = cajuela;
        this.transmision = transmision;
    }

}
