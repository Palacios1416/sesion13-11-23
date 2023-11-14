public class TarjetaMadre {
private String modelo;
private String fabricante;
private int bancosMemoria;
private int bancosExpansion;
private String nombreBios;

public TarjetaMadre(String modelo, String fabricante, int bancosMemoria, int bancosExpansion, String nombreBios) {
this.modelo = modelo;
this.fabricante = fabricante;
this.bancosMemoria = bancosMemoria;
this.bancosExpansion = bancosExpansion;
this.nombreBios = nombreBios;
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

public int getBancosMemoria() {
    return bancosMemoria;
}

public void setBancosMemoria(int bancosMemoria) {
    this.bancosMemoria = bancosMemoria;
}

public int getBancosExpansion() {
    return bancosExpansion;
}

public void setBancosExpansion(int bancosExpansion) {
    this.bancosExpansion = bancosExpansion;
}

public String getNombreBios() {
    return nombreBios;
}

public void setNombreBios(String nombreBios) {
    this.nombreBios = nombreBios;
}

public void cargarPrograma(String programa) {
System.out.println("El programa " + programa + " está cargando!");
}


}
