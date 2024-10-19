package creational.builder.builders;

import creational.builder.cars.Carro;
import creational.builder.cars.TipoCarro;
import creational.builder.componentes.ComputadoraViaje;
import creational.builder.componentes.Motor;
import creational.builder.componentes.NavegadorGPS;
import creational.builder.componentes.Transmision;

/**
 * Builders concretos implementan pasos definidos en la interfaz común
 */
public class CarBuilder implements Builder{
    private TipoCarro tipo;
    private int numeroAsientos;
    private Motor motor;
    private Transmision transmision;
    private ComputadoraViaje computadoraViaje;
    private NavegadorGPS navegadorGPS;

    @Override
    public void setTipoDeCarro(TipoCarro tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setNumeroAsientos(int numeroAsientos) {
       this.numeroAsientos = numeroAsientos;
    }

    @Override
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }

    @Override
    public void setComputadoraViaje(ComputadoraViaje computadoraViaje) {
        this.computadoraViaje = computadoraViaje;
    }

    @Override
    public void setNavegadorGPS(NavegadorGPS navegadorGPS) {
        this.navegadorGPS = navegadorGPS;
    }

    public Carro getCarroResultado() {
        return new Carro(tipo, numeroAsientos, motor, transmision, computadoraViaje, navegadorGPS);
    }
}
