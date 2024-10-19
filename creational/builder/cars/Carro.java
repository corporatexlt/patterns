package creational.builder.cars;

import creational.builder.componentes.ComputadoraViaje;
import creational.builder.componentes.Motor;
import creational.builder.componentes.NavegadorGPS;
import creational.builder.componentes.Transmision;

/**
 * Carro es una clase de un producto.
 */
public class Carro {
    private final TipoCarro tipo;
    private final int numeroAsientos;
    private final Motor motor;
    private final Transmision transmision;
    private final ComputadoraViaje computadoraViaje;
    private final NavegadorGPS navegadorGPS;
    private double combustible = 0;

    public Carro(TipoCarro tipo, int numeroAsientos, Motor motor, Transmision transmision,
    ComputadoraViaje computadoraViaje, NavegadorGPS navegadorGPS) {
        this.tipo = tipo;
        this.numeroAsientos = numeroAsientos;
        this.motor = motor;
        this.transmision = transmision;
        this.computadoraViaje = computadoraViaje;
        if (this.computadoraViaje != null) {
            this.computadoraViaje.setCarro(this);
        }
        this.navegadorGPS = navegadorGPS;
    }

    public TipoCarro getTipoCarro() {
        return tipo;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }

    public int getAsientos() {
        return numeroAsientos;
    }

    public Motor getMotor() {
        return motor;
    }

    public Transmision getTransmision() {
        return transmision;
    }

    public ComputadoraViaje getComputadoraViaje() {
        return computadoraViaje;
    }

    public NavegadorGPS getNavegadorGPS() {
        return navegadorGPS;
    }
}
