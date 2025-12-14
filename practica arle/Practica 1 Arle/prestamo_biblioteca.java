import java.util.Scanner;
public class prestamo_biblioteca {
    public static void main(String[] args) {
        Scanner pb = new Scanner(System.in);

        System.out.print("¿Tiene multas? (true/false): ");
        boolean multa = pb.nextBoolean();

        if (multa) {
            System.out.println("Préstamo denegado");
        } else {
            System.out.println("Préstamo aprobado por 7 días");
        }

        pb.close();
    }


}
