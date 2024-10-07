package creational.abstract_factory.checkboxes;

/**
 * Todas las familias de "productos" tienen las mismas variedades (MacOS/Windows/Linux).
 *
 * Esta es la variedad de checkbox para Mac
 */
public class CheckboxMac implements Checkbox{
    @Override
    public void pintar() {
        System.out.println("Has creado un checkbox de Mac.");
    }
}
