package creational.builder.componentes;

import creational.builder.cars.Carro;

public class ComputadoraViaje {
    private Carro carro;

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public void mostrarNivelCombustible() {
        System.out.println("Fuel level: " + carro.getCombustible());
    }

    public void showEstado() {
        if (this.carro.getMotor().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }
}
