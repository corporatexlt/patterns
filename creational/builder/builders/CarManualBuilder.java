package creational.builder.builders;

import creational.builder.cars.Manual;
import creational.builder.cars.TipoCarro;
import creational.builder.componentes.ComputadoraViaje;
import creational.builder.componentes.Motor;
import creational.builder.componentes.NavegadorGPS;
import creational.builder.componentes.Transmision;

/**
 * A diferencia de otros patrones crecionales, Builder puede construir productos no relacionados,
 * Que no tenga la interfaz común.
 *
 * En este caso contruimos un manual de usuario para un carro, usando los mismos pasos usados
 * para construir un carro. Esto permite producir manuales para modelos específicos de carros,
 * configurados con diferentes caraterísticas.
 */
public class CarManualBuilder implements Builder{
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

    public Manual getManualResultado() {
        return new Manual(tipo, numeroAsientos, motor, transmision, computadoraViaje, navegadorGPS);
    }
}
