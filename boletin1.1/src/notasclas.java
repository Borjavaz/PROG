import java.util.Scanner;

public class notasclas {
    public static void main(String[] args) {
        Scanner notaclas = new Scanner(System.in);


        System.out.println("Escriba la nota obtenida");
        int nota = notaclas.nextInt();


        switch (nota){

            case 0:
                System.out.println("El examen está suspenso");
                break;

            case 1:
                System.out.println("El examen está suspenso");
                break;

            case 2:
                System.out.println("El examen está suspenso");
                break;

            case 3:
                System.out.println("El examen está suspenso");
                break;

            case 4:
                System.out.println("El examen está suspenso");
                break;

            case 5:
                System.out.println("El examen está suficiente");
                break;

            case 6:
                System.out.println("El examen está bien");
                break;

            case 7:
                System.out.println("El examen está notable");
                break;

            case 8:
                System.out.println("El examen está notable");
                break;

            case 9:
                System.out.println("El examen está sobresaliente");
                break;

            case 10:
                System.out.println("El examen está sobresaliente");
                break;


        }

        notaclas.close();

    }

}