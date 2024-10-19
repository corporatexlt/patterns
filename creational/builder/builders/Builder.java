package creational.builder.builders;

import creational.builder.cars.TipoCarro;
import creational.builder.componentes.ComputadoraViaje;
import creational.builder.componentes.Motor;
import creational.builder.componentes.NavegadorGPS;
import creational.builder.componentes.Transmision;

/**
 * Builder interface define todas las formas posibles de configurar un producto
 */
public interface Builder {
    void setTipoDeCarro(TipoCarro tipo);
    void setNumeroAsientos(int numeroAsientos);
    void setMotor(Motor motor);
    void setTransmision(Transmision transmision);
    void setComputadoraViaje(ComputadoraViaje computadoraViaje);
    void setNavegadorGPS(NavegadorGPS navegadorGPS);
}
