public class Boletin6 {


    //Escribir unha función o que se lle pasen dous enteiros e mostre tódolos números comprendidos entre eles.
    public static void mostrarNumerosEntre(int num1, int num2) {
        // Asegurarse de que num1 es menor que num2 para que funcione correctamente
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }


        // Mostrar los números comprendidos entre num1 y num2
        for (int i = num1 + 1; i < num2; i++) {
            System.out.println(i);
        }
    }


    //EJERCICIO 2
    // Función que imprime "Ecoo..." n veces

    public static void eco(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Ecoo...");
        }
    }

    public static void main(String[] args) {


        System.out.println("ej1");
        int num1 = 5;
        int num2 = 10;
        mostrarNumerosEntre(num1, num2);


        // Llamada a la función con un ejemplo de 5 repeticiones
        System.out.println("ej2");
        eco(5);

    }
}