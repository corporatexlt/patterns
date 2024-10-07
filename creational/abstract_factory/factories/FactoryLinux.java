package creational.abstract_factory.factories;

import creational.abstract_factory.botones.Boton;
import creational.abstract_factory.botones.BotonLinux;
import creational.abstract_factory.checkboxes.Checkbox;
import creational.abstract_factory.checkboxes.CheckboxLinux;

/**
 * Cada factory concreta hereda de la factory basica y es responsable de la creación
 * de "productos" de una misma variante.
 */
public class FactoryLinux implements FactoryInterfaz {

    @Override
    public Boton createButton() {
        return new BotonLinux();
    }

    @Override
    public Checkbox createCheckbox() {
        return new CheckboxLinux();
    }

}
