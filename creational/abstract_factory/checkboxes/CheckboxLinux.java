package creational.abstract_factory.checkboxes;

/**
 * Todas las familias de "productos" tienen las mismas variedades (MacOS/Windows/Linux).
 *
 * Esta es la variedad de checkbox para Linux
 */
public class CheckboxLinux implements Checkbox{
    @Override
    public void pintar() {
        System.out.println("Has creado un checkbox de Linux.");
    }
}
