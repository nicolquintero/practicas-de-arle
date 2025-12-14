import java.util.Scanner;

public class envio {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        System.out.print("¿Es miembro premium? (true/false): ");
        boolean miembro = e.nextBoolean();

        System.out.print("Ingrese el monto de la compra: ");
        double monto = e.nextDouble();

        if (miembro || monto >= 50000) {
            System.out.println("Envío gratis.");
        } else {
            System.out.println("Debe pagar envío.");
        }

        e.close();
    }
}
