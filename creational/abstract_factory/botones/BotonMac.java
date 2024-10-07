package creational.abstract_factory.botones;

/**
 * Todas las familias de "productos" tienen las mismas variedades (MacOS/Windows/Linux).
 *
 * Esta es una variedad de un botón de Mac.
 */
public class BotonMac implements Boton {

    @Override
    public void pintar() {
        System.out.println("Has creado un botón de mac.");
    }
}