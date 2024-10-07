package creational.abstract_factory;

import creational.abstract_factory.app.Application;
import creational.abstract_factory.factories.FactoryInterfaz;
import creational.abstract_factory.factories.FactoryLinux;
import creational.abstract_factory.factories.FactoryMac;
import creational.abstract_factory.factories.FactoryWindows;

public class Demo {
    /**
     * Application selecciona el tupo de factorie y lo crea en tiempo de ejecución (usualmente
     * en la fase de inicialización), dependiendo de la configuración de las variables
     * de ambiente.
     */
    private static Application configureApplication() {
        Application app;
        FactoryInterfaz factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new FactoryMac();
        } else if (osName.contains("windows")){
            factory = new FactoryWindows();
        } else {
            factory = new FactoryLinux();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
