package creational.abstract_factory.factories;

import creational.abstract_factory.botones.Boton;
import creational.abstract_factory.checkboxes.Checkbox;

/**
 * Esta abstract factory conoce todos los (abstract) tipos de productos.
 */
public interface FactoryInterfaz {
    Boton createButton();
    Checkbox createCheckbox();
}
