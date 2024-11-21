import java.util.Scanner;

public class ExemplosTaboas {
    public static  void main (String [] args){

        int [] edades;
        edades = new int [5];
        edades [0] = 31;
        edades [1] = 23;
        edades [2] = 56;
        edades [3] = 12;
        edades [4] = 32;

        String [] nomes = { "Manuel", "Jose", "Rosa", "Ana"};

        System.out.println(nomes[3] + " tiene " + edades[3] + " años.");

        int minimo = edades [0];
        for(int i = 0; i < edades.length; i++){
            if(minimo>edades[i]){
                minimo=edades[i];
            }
        }

        System.out.println("La edad mínima registrada es : " + minimo);

        for( int edad: edades){
            System.out.println(edad);
        }

        Scanner ExemplosTaboas=new Scanner(System.in);

        System.out.println("Introduce el numero de elementos que va a tener la lista: ");
        int nlista=ExemplosTaboas.nextInt();

        int [] lista= new int[nlista];
        for (int i = 0; i<lista.length;i++) {
            System.out.println("Escriba un numero");
            lista[i] = ExemplosTaboas.nextInt();
        }
        System.out.println("Escribe el numero que quieres buscar: ");
        int x=ExemplosTaboas.nextInt();
        int posicion = -1; // Por defecto, -1 indica que no se encontró

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == x) {
                posicion = i; // Guardamos la posición del número encontrado
                break; // Salimos del bucle al encontrar el número
            }
        }

        if (posicion == -1) {
            System.out.println("El número " + x + " no se encuentra en la lista.");
        } else {
            System.out.println("El número " + x + " se encuentra en la posición: " + (posicion + 1));
        }


    }
}
