package main;

import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author benjamin
 *
 * Toma los argumentos recibidos en la ejecucion de un programa java y los setea
 * a una clase POJO con atributos del mismo nombre de argumento incluye la
 * conversion al tipo de atributo de clase, el ejemplo de ingreso de parametros
 * es el siguiente: java -jar App.jar parametro1=1 parametro2=parametro2.
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            ArgumentosHelper.showAvalaibleParams(Argumentos.class);
            Argumentos a = ArgumentosHelper.proccessArgs(args, Argumentos.class);
            System.out.println("ARGUMENTOS GENERIC = " + a);
            ArgumentosHelper.showAttributes(a);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace(System.err);
        }

    }

}
