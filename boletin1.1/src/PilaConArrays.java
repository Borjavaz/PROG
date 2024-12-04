import java.util.Scanner;

public class PilaConArrays {
    public static void main ( String[] args){
        Scanner PilaConArrays= new Scanner(System.in);
        int [] pila;
        int cabeza = -1;
        pila = new int [5];
        cabeza = apilar(pila,cabeza,5);
        cabeza = apilar(pila,cabeza,6);
        cabeza = apilar(pila,cabeza,10);
        cabeza = apilar(pila,cabeza,15);
        cabeza = apilar(pila,cabeza,20);
        cabeza = apilar(pila,cabeza,30);
        mostrarPila(pila, cabeza);
        cabeza = desapilar(pila,cabeza);
        cabeza = desapilar(pila,cabeza);
        cabeza = desapilar(pila,cabeza);
        mostrarPila(pila, cabeza);
        cabeza = apilar(pila,cabeza,9);
        cabeza = apilar(pila,cabeza,13);
        mostrarPila(pila,cabeza);


    }
    public static int apilar (int [] pila, int cab,int num){
        if(cab< pila.length-1){
            pila[cab+1]= num;
            cab++;
            System.out.println("Número " + num + " apilado");
        }else{
            System.out.println("A pila está desbordada, non se almacena o número");
        }return cab;
    }
    public static void mostrarPila(int [] pila, int cab){
        if(cab>=0){
            for(int i = 0;i<= cab; i++)
            System.out.println("O número da pila é: " + pila[i]);
        }else{
            System.out.println("Pila baleira");
        }
    }
    public static int desapilar(int [] pila, int cab){
        if (cab >= 0){
            System.out.println("O valor desapilado é: " + pila[cab]);
            cab--;
        }else{
            System.out.println("A pila esta baleira");
        }return cab;
    }
}
