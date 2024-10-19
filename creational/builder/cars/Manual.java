package creational.builder.cars;

import creational.builder.componentes.ComputadoraViaje;
import creational.builder.componentes.Motor;
import creational.builder.componentes.NavegadorGPS;
import creational.builder.componentes.Transmision;

/**
 * Car manual is another product. Note that it does not have the same ancestor
 * as a Car. No están relacionados.
 */
public class Manual {
    private final TipoCarro tipo;
    private final int numeroAsientos;
    private final Motor motor;
    private final Transmision transmision;
    private final ComputadoraViaje computadoraViaje;
    private final NavegadorGPS navegadorGPS;

    public Manual(TipoCarro tipo, int numeroAsientos, Motor motor, Transmision transmision,
    ComputadoraViaje computadoraViaje, NavegadorGPS navegadorGPS) {
        this.tipo = tipo;
        this.numeroAsientos = numeroAsientos;
        this.motor = motor;
        this.transmision = transmision;
        this.computadoraViaje = computadoraViaje;
        this.navegadorGPS = navegadorGPS;
    }

    public String imprimir() {
        String info = "";
        info += "Type of car: " + tipo + "\n";
        info += "Count of seats: " + numeroAsientos + "\n";
        info += "Engine: volume - " + motor.getVolumen() + "; mileage - " + motor.getMillasRecorriedas() + "\n";
        info += "Transmission: " + transmision + "\n";
        if (this.computadoraViaje != null) {
            info += "Trip Computer: Functional" + "\n";
        } else {
            info += "Trip Computer: N/A" + "\n";
        }
        if (this.navegadorGPS != null) {
            info += "GPS Navigator: Functional" + "\n";
        } else {
            info += "GPS Navigator: N/A" + "\n";
        }
        return info;
    }
}
