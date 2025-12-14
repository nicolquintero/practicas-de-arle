import java.util.Scanner;
public class licencia2 {
    


    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        System.out.print("Edad: ");
        int edad = l.nextInt();

        System.out.print("¿Aprobó el examen? (true/false): ");
        boolean aprobo = l.nextBoolean();

        System.out.print("¿Tiene multas pendientes? (true/false): ");
        boolean multas = l.nextBoolean();

        if (edad >= 18 && aprobo && !multas) {
            System.out.println("Licencia concedida.");
        } else {
            System.out.println("Licencia denegada.");
        }

        l.close();
    }
}

