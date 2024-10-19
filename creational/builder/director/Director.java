package creational.builder.director;

import creational.builder.builders.Builder;
import creational.builder.cars.TipoCarro;
import creational.builder.componentes.ComputadoraViaje;
import creational.builder.componentes.Motor;
import creational.builder.componentes.NavegadorGPS;
import creational.builder.componentes.Transmision;

/**
 * Director define el orden de los pasos de construcción. trabaja con un objeto Builder
 * a través de la interfaz común Builder. Esto significa que puede no saber que producto se 
 * está construyendo
 */
public class Director {
    public void contruirCarroDeportivo(Builder builder) {
        builder.setTipoDeCarro(TipoCarro.SPORTS_CAR);
        builder.setNumeroAsientos(2);
        builder.setMotor(new Motor(3.0, 0));
        builder.setTransmision(Transmision.SEMI_AUTOMATIC);
        builder.setComputadoraViaje(new ComputadoraViaje());
        builder.setNavegadorGPS(new NavegadorGPS());
    }

    public void construirCarroDeCiudad(Builder builder) {
        builder.setTipoDeCarro(TipoCarro.CITY_CAR);
        builder.setNumeroAsientos(2);
        builder.setMotor(new Motor(1.2, 0));
        builder.setTransmision(Transmision.AUTOMATIC);
        builder.setComputadoraViaje(new ComputadoraViaje());
        builder.setNavegadorGPS(new NavegadorGPS());
    }

    public void construirSUV(Builder builder) {
        builder.setTipoDeCarro(TipoCarro.SUV);
        builder.setNumeroAsientos(4);
        builder.setMotor(new Motor(2.5, 0));
        builder.setTransmision(Transmision.MANUAL);
        builder.setNavegadorGPS(new NavegadorGPS());
    }
}
