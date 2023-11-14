public class Monitor {
    private String modelo;
    private String fabricante;
    private double tamano;
    private Resolucion resolucionNativa;
    public Monitor(String modelo, String fabricante, double tamano, Resolucion resolucionNativa) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.tamano = tamano;
        this.resolucionNativa = resolucionNativa;
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
    public double getTamano() {
        return tamano;
    }
    public void setTamano(double tamano) {
        this.tamano = tamano;
    }
    public Resolucion getResolucionNativa() {
        return resolucionNativa;
    }
    public void setResolucionNativa(Resolucion resolucionNativa) {
        this.resolucionNativa = resolucionNativa;
    }

    public void DibujarPixel(int x, int y, String color){
        System.out.println("Dibujando pixel en la posicion"+ x + ","+ y +" en color "+color);
    }
}
