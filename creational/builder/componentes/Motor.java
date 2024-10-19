package creational.builder.componentes;

/*
 * Característica de un carro
*/
public class Motor {
    private final double volumen;
    private double millasRecorriedas;
    private boolean estaIniciado;

    public Motor(double volumen, double millasRecorriedas) {
        this.volumen = volumen;
        this.millasRecorriedas = millasRecorriedas;
    }

    public void on() {
        estaIniciado = true;
    }

    public void off() {
        estaIniciado = false;
    }

    public boolean isStarted() {
        return estaIniciado;
    }

    public void ir(double millasRecorriedas) {
        if (estaIniciado) {
            this.millasRecorriedas += millasRecorriedas;
        } else {
            System.err.println("No se puede ir(), debe encender primero el motor!");
        }
    }

    public double getVolumen() {
        return volumen;
    }

    public double getMillasRecorriedas() {
        return millasRecorriedas;
    }
}
