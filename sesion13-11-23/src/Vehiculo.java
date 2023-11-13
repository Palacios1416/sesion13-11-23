public class Vehiculo {
    private int ruedas;
    private boolean tienemotor;
    private boolean tienecambios;
    private int espejos;

    public Vehiculo(int ruedas, boolean tienemotor, boolean tienecambios, int espejos) {
        this.ruedas = ruedas;
        this.tienemotor = tienemotor;
        this.tienecambios = tienecambios;
        this.espejos = espejos;
    }

    public int getRuedas() {
        return ruedas;
    }
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
    public boolean getTienemotor() {
        return tienemotor;
    }
    public void setTienemotor(boolean tienemotor) {
        this.tienemotor = tienemotor;
    }
    public boolean getTienecambios() {
        return tienecambios;
    }
    public void setTienecambios(boolean tienecambios) {
        this.tienecambios = tienecambios;
    }
    public int getEspejos() {
        return espejos;
    }
    public void setEspejos(int espejos) {
        this.espejos = espejos;
    }

    
}
