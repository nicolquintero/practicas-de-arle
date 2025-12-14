import java.util.Scanner;

public class ejercicio10 {

    static boolean esPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner g = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n = g.nextInt();

        if (esPrimo(n)) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }

        g.close();
    }
}


