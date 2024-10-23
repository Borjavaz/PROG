import java.util.Scanner;

/**
 * Este programa calcula el area de un triangulo del que ya sabemos su base y su altura
 * @version 1.1
 * @author Borja de Saa
 */

public class bucleWhile {
    public static void main(String[] args) {

        Scanner bucleWhile = new Scanner(System.in);
        int media =0;
        int contador=0;

        System.out.println("Escriba la nota del examen: ");
        int nota = bucleWhile.nextInt();

        while ( nota != -1) {
            media += nota;
            contador++;
            System.out.println("Escriba la nota del examen (introduzca -1 para salir): ");
            nota = bucleWhile.nextInt();
        }
        media = media/contador;
        System.out.println("La media de los examenes es: " + media);

        bucleWhile.close();
    }
}
