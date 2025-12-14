import java.util.Scanner;

public class cotraseña {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        String claveCorrecta = "2502";

        System.out.print("Ingrese su contraseña: ");
        String clave = c.next();

        if (clave.equals(claveCorrecta)) {
            System.out.println("Acceso concedido.");
        } else {
            System.out.println("Acceso denegado.");
        }

        c.close();
    }
}


