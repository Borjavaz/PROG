import java.util.logging.Logger;

/**
 * @author Borja de Saa
 * @version 1.0
 */
public class ejCod {

    private static final Logger myLog = Logger.getLogger("cod");

    /**
     * Se encuentran las palabras a las que le vas a contar las letras
     *
     * @param args Metodos principales del Main
     */
    public static void main(String[] args) {
        /**
         *
         */
        cuentaLetras("hola", "mundo");
    }

    /**
     * Cuenta la cantidad de letras de una palabra
     *
     * @param a Palabra a contar caracteres
     * @param b Palabra a contar caracteres
     * @return Numero de caracteres totales
     */

    static int cuentaLetras(String a, String b) {
        int totales = a.length() + b.length();
        return 0;
    }
}
