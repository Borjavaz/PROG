/**
 * Este programa muestra los multiplos del 7 menores que 100
 * @version 1.1
 * @author Borja de Saa
 */

public class multiplos7 {
    public static void main(String[] args) {
        // Bucle que muestra los multiplos de 7 menores que 100

        System.out.println("Multiplos de 7 menores que 100");

        for (int i = 1; i < 100; i++){

            if( i % 7 == 0){
                System.out.println(i);
            }
        }
    }
}
