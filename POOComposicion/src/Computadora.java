public class Computadora {
private Case elCase; //Esto es composición
private Monitor monitor; //Esto es composición
private TarjetaMadre tarjetaMadre; //Esto es composición
public Computadora(Case elCase, Monitor monitor, TarjetaMadre tarjetaMadre) {
this.elCase = elCase;
this.monitor = monitor;
this.tarjetaMadre = tarjetaMadre;
}

public Case getElCase() {
    return elCase;
}

public void setElCase(Case elCase) {
    this.elCase = elCase;
}

public Monitor getMonitor() {
    return monitor;
}

public void setMonitor(Monitor monitor) {
    this.monitor = monitor;
}

public TarjetaMadre getTarjetaMadre() {
    return tarjetaMadre;
}

public void setTarjetaMadre(TarjetaMadre tarjetaMadre) {
    this.tarjetaMadre = tarjetaMadre;
}


}
