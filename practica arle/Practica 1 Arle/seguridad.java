import java.util.Scanner;
public class seguridad {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("¿Es de noche? (true/false): ");
        boolean noche = s.nextBoolean();

        System.out.print("¿La puerta está abierta? (true/false): ");
        boolean puertaAbierta = s.nextBoolean();

        if (noche && puertaAbierta) {
            System.out.println("Asegure la puerta");
        } else {
            System.out.println("Todo se encuentra bein");
        }

        s.close();
    }
}

