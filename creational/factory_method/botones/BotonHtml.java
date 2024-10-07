package creational.factory_method.botones;

/**
 * Implementación para un botón HTML.
 */
public class BotonHtml implements Boton {

    public void render() {
        System.out.println("<button>Probar botón</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! El botón dice - 'Hola mundo!'");
    }
}