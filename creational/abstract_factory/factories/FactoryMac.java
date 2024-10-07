package creational.abstract_factory.factories;

import creational.abstract_factory.botones.Boton;
import creational.abstract_factory.botones.BotonMac;
import creational.abstract_factory.checkboxes.Checkbox;
import creational.abstract_factory.checkboxes.CheckboxMac;

/**
 * Cada factory concreta hereda de la factory basica y es responsable de la creación
 * de "productos" de una misma variante.
 */
public class FactoryMac implements FactoryInterfaz {

    @Override
    public Boton createButton() {
        return new BotonMac();
    }

    @Override
    public Checkbox createCheckbox() {
        return new CheckboxMac();
    }

}
