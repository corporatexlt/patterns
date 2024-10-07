package creational.factory_method.factory;

import creational.factory_method.botones.Boton;
import creational.factory_method.botones.BotonHtml;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Boton crearBoton() {
        return new BotonHtml();
    }
}