import java.util.Random;

public class Boletin7 {
    public static void main(String[] args) {

        //Este programa contiene un array que se visualiza del reves
        System.out.println("");
        System.out.println("ej1");
        int [] numeros = new int [6];
        numeros [0] = 23;
        numeros [1] = 43;
        numeros [2] = 4;
        numeros [3] = 34;
        numeros [4] = 22;
        numeros [5] = 12;
        System.out.println("");
        System.out.println("Array");
        for( int numero : numeros){
            System.out.print(numero + " ");
        }

        int[] inverso = new int[numeros.length];
        for(int i = 0; i < numeros.length; i++){
            inverso[i] = numeros[numeros.length - 1 - i];
        }
        System.out.println("");
        System.out.println("Array inverso");
        for(int num: inverso){
            System.out.print(num + " ");
        }
        System.out.println("");
        System.out.println("ej2");

        int[] notas ={2, 5, 8, 1, 9, 7, 3, 10, 4, 6, 0, 8, 5, 10, 2, 6, 9, 7, 3, 4, 1, 10, 3, 6, 8, 4, 7, 2, 9, 0};
        String[] nomes ={"Saray","Saul","Anton","Adriana","Ivan","Daniel","Daniel","Piero","Jorge","Fernando","Sofia","Javier","Oscar","Andrea","Karly","Alexandre","Ivan","Borja","Manuel","Carlos","Fran","Miguel","Samuel","Jose","Dima","Oliver","David","Adrian","Gael","Adrian"};

        int aprobados=0;
        int suspensos=0;
        int sumaNotas=0;
        int notaMasAlta=0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }

            sumaNotas += notas[i];

            if (notas[i] > notaMasAlta) {
                notaMasAlta = notas[i];
            }
        }
        double mediaClase = (double) sumaNotas/notas.length;

        System.out.println("Resultados de la clase:");
        System.out.println("Número de aprobados: " + aprobados);
        System.out.println("Número de suspensos: " + suspensos);
        System.out.println("Nota media de la clase: " + mediaClase);
        System.out.println("Nota más alta: " + notaMasAlta);
    }
}
