import java.util.Scanner;

public class licencia {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = l.nextInt();

        System.out.print("¿Aprobó el examen? (true/false): ");
        boolean aprobo = l.nextBoolean();

        if (edad >= 18 && aprobo) {
            System.out.println("Licencia habilitada.");
        } else {
            System.out.println("No cumple los requisitos.");
        }

        l.close();
    }
}


