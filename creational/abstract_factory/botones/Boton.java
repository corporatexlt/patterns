package creational.abstract_factory.botones;

/**
 * Abstract Factory asume que existen diferentes familias de "productos",
 * estructurados en diferentes jerarquías de clases (Boton/Checkbox). Todos los "productos"
 * de la misma familia tienen la misma interfaz común.
 *
 * Esta es la interfaz común de la familia de botones.
 */
public interface Boton {
    void pintar();
}