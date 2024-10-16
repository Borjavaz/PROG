import java.util.Scanner;

public class Boletin2 {
    public static void main (String [] args){
        //double base = 4, altura = 3, area;
        double base, altura, area;
        base = 4;
        altura = 3;
        area = base * altura / 2;
        System.out.println(area);
        System.out.println("El area del triangululo es  " + area);


        System.out.println();
        System.out.println("ej3");
        double cambio, euros, dolares;
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce o cambio euro-dolar do día de hoxe:");
        cambio = entradaTeclado.nextDouble();
        System.out.println("Introduce a cantidade de euros a cambiar:");
        euros = entradaTeclado.nextDouble();
        dolares = euros*cambio;
        System.out.println(dolares +" dolares de cambio, por "+ euros+ " Euros.");
        entradaTeclado.close();

        System.out.println();
        System.out.println("ej3.1");

    }
}
