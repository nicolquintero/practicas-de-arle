import java.util.Scanner;
public class cuenta {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        System.out.print("Ingrese los intentos fallidos: ");
        int intentos = c.nextInt();

        if (intentos >= 3) {
            System.out.println("Cuenta bloqueada");
        } else {
            System.out.println("Puede intentar nuevamente");
        }

        c.close();
    }
}

