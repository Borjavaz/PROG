import java.util.Scanner;

public class Examen1 {
    public static void main(String[] args) {

        //Calcular la raiz cuadrada de un numero natural, si no es exacta, mostrará el resto.

        Scanner Examen1 = new Scanner(System.in);

       System.out.println("Escriba un número para saber su raiz cuadrada y su resto ( si lo tiene): ");
        int n = Examen1.nextInt();
/*
        for (int base = 0; base <= 1000000000; base++) {

            int operacion;
           operacion= base ^ 2;

            if (n == operacion) {
                System.out.println("El resultado de la raiz cuadrada de " + n + " es: " + operacion);
            } else if (n > operacion) {
                int resto;
                resto = n - base;
                System.out.println("El resultado de la raiz cuadrada de " + n + " es: " + operacion);
                System.out.println("El resto es: " + resto);
            }
        }

*/
        int raiz = 0;
        int contador = 0;
        int operacion2;
        operacion2= contador ^ 2;

        System.out.println("Escriba un número para saber su raiz cuadrada y su resto ( si lo tiene)");
        int n_2 = Examen1.nextInt();

        do {
            contador++;
            if (n_2 == operacion2) {
                System.out.println("El resultado de la raiz cuadrada de " + n_2 + " es: " + operacion2);
            } else if (n_2 > operacion2) {
                int resto;
                resto = n_2 - contador;
                System.out.println("El resultado de la raiz cuadrada de " + n_2 + " es: " + operacion2);
                System.out.println("El resto es: " + resto);

        }


    }while (n <= operacion2);
}
}
