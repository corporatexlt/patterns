package creational.abstract_factory.botones;

/**
 * Todas las familias de "productos" tienen las mismas variedades (MacOS/Windows/Linux).
 *
 * Esta es otra variedad de un botón específico de windows.
 */
public class BotonWindows implements Boton {
    @Override
    public void pintar() {
        System.out.println("Has creado un botón de windows.");
    }
}
