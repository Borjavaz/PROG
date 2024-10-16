import java.util.Scanner;

public class num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca las decenas de su número (0-9): ");
        int decenas = scanner.nextInt();
        System.out.println("Introduzca el número de las unidades (0-9): ");
        int unidades = scanner.nextInt();

        String nombreDecenas;
        String nombreUnidades;

        switch (decenas) {
            case 1:
                nombreDecenas = "diez";
                break;
            case 2:
                nombreDecenas = "veinte";
                break;
            case 3:
                nombreDecenas = "treinta";
                break;
            case 4:
                nombreDecenas = "cuarenta";
                break;
            case 5:
                nombreDecenas = "cincuenta";
                break;
            case 6:
                nombreDecenas = "sesenta";
                break;
            case 7:
                nombreDecenas = "setenta";
                break;
            case 8:
                nombreDecenas = "ochenta";
                break;
            case 9:
                nombreDecenas = "noventa";
                break;
            default:
                nombreDecenas = "decenas no válidas";
        }

        switch (unidades) {
            case 1:
                nombreUnidades = "uno";
                break;
            case 2:
                nombreUnidades = "dos";
                break;
            case 3:
                nombreUnidades = "tres";
                break;
            case 4:
                nombreUnidades = "cuatro";
                break;
            case 5:
                nombreUnidades = "cinco";
                break;
            case 6:
                nombreUnidades = "seis";
                break;
            case 7:
                nombreUnidades = "siete";
                break;
            case 8:
                nombreUnidades = "ocho";
                break;
            case 9:
                nombreUnidades = "nueve";
                break;
            default:
                nombreUnidades = "unidades no válidas";
        }

        System.out.println("El número es " + nombreDecenas + " y " + nombreUnidades);
    }
}
