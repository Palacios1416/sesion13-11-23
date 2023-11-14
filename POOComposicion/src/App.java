public class App {
    public static void main(String[] args) throws Exception {
        Dimensiones dimensiones = new Dimensiones(20,20,5);
        Case cajon = new Case("220B","Dell","460",dimensiones);
        Monitor monitor = new Monitor("Beast de 27", "Beast", 27, new Resolucion(2540, 1440));
        TarjetaMadre tarjetamadre = new TarjetaMadre("BJ-200","Asus", 4, 6, "v2.44");
        Case miCase = new Case("AL-K34", "null", null, dimensiones);
        Computadora miComputadora = new Computadora(miCase, monitor, tarjetamadre);
        
    }
}
