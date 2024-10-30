import java.util.Scanner;

/**
 * Este programa muestra los multiplos del 7 menores que 100
 * @version 1.1
 * @author Borja de Saa
 */

public class bucleFor {
    public static void main(String[] args) {

        System.out.println("Multiplos de 7 menores que 100");
        // Bucle que recoge los numeros de (1 - 99)
        for (int i = 1; i < 100; i++) {
            // Cada uno de estos números que dividido entre 7 de 0, será mostrado por pantalla
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}
