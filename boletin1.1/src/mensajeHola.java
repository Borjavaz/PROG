public class mensajeHola {
    public static void main(String[] args) {
        recursiva("Hola");

        System.out.println("Acabé");
    }

    static public void recursiva(String msg) {
        msg = msg + ".";
        System.out.println(msg);

        if (msg.length() < 10) {
            recursiva(msg);
        }
    }
}