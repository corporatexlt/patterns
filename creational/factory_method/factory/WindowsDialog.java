package creational.factory_method.factory;

import creational.factory_method.botones.Boton;
import creational.factory_method.botones.BotonWindows;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Boton crearBoton() {
        return new BotonWindows();
    }
}
