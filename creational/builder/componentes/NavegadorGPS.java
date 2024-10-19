package creational.builder.componentes;

/*
 * Característica de un carro
*/
public class NavegadorGPS {
    private String ruta;

    public NavegadorGPS() {
        this.ruta = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London"; // :)
    }

    public NavegadorGPS(String manualRoute) {
        this.ruta = manualRoute;
    }

    public String getRuta() {
        return ruta;
    }
}
