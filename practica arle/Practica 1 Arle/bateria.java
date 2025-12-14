import java.util.Scanner;
public class bateria {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);

        System.out.print("Ingrese el porcentaje de batería: ");
        int bateria = b.nextInt();

        if (bateria < 20) {
            System.out.println("Batería baja conecte el cargador");
        } else if (bateria <= 80) {
            System.out.println("Batería suficiente");
        } else {
            System.out.println("Batería alta");
        }

        b.close();
    }
}

