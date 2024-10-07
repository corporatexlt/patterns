package creational.factory_method.factory;

import creational.factory_method.botones.Boton;

/**
 * Clase factory base. Notar que "factory" es meramente un rol para la clase. Debería
 * tener alguna lógica clave de negocio que necesite diferentes "productos" creados
 */
public abstract class Dialog {

    public void renderWindow() {
        // ... codigo con lógica ...

        Boton okButton = crearBoton();
        okButton.render();
    }

    /**
     * Las subclases deberán sobreescribir este método para crear su 
     * respectivo botón con sus necesidades
     */
    public abstract Boton crearBoton();
}
