import java.util.Scanner;

public class ejercicio3 {
    public static void generarTabla(int numero, int limite) {
        for (int i = 1; i <= limite; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese el número: ");
        int num = s.nextInt();

        System.out.print("Ingrese el límite: ");
        int limite = s.nextInt();

        generarTabla(num, limite);

        s.close();
    }
}