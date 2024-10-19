package creational.builder;

import creational.builder.builders.CarBuilder;
import creational.builder.builders.CarManualBuilder;
import creational.builder.cars.Carro;
import creational.builder.cars.Manual;
import creational.builder.director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.contruirCarroDeportivo(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Carro car = builder.getCarroResultado();
        System.out.println("Car built:\n" + car.getTipoCarro());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.contruirCarroDeportivo(manualBuilder);
        Manual carManual = manualBuilder.getManualResultado();
        System.out.println("\nCar manual built:\n" + carManual.imprimir());
    }
}
