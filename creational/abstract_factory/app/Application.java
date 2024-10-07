package creational.abstract_factory.app;

import creational.abstract_factory.botones.Boton;
import creational.abstract_factory.checkboxes.Checkbox;
import creational.abstract_factory.factories.FactoryInterfaz;

/**
 * Quienes usan los factories no se preocupan mucho por las factories concretas dad que usan
 * factories y "productos" a través de interfaces abstractas.
 */
public class Application {
    private Boton button;
    private Checkbox checkbox;

    public Application(FactoryInterfaz factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.pintar();
        checkbox.pintar();
    }
}
