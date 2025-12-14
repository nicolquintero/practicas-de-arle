import java.util.Scanner;
public class emisora {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        System.out.println("Emisora de un radio ");
        System.out.println("1 Emisora Pop");
        System.out.println("2 Emisora Rock");
        System.out.println("3 Emisora Vallenato");

        System.out.print("Seleccione la emisora: ");
        int emisora = e.nextInt();

        System.out.print("Ingrese la hora (0-23): ");
        int hora = e.nextInt();

        if (hora < 0 || hora > 23) {
            System.out.println("Hora fuera de rango.");
            
        }

        switch (emisora) {
            case 1:
                if (hora >= 6 && hora < 12) {
                    System.out.println("Pop de la mañana");
                } else if (hora < 18) {
                    System.out.println("Éxitos del momento");
                } else {
                    System.out.println("Noche Pop");
                }
                break;

            case 2:
                if (hora >= 6 && hora < 12) {
                    System.out.println("Rock clásico");
                } else if (hora < 18) {
                    System.out.println("Rock en español");
                } else {
                    System.out.println("Rock pesado");
                }
                break;

            case 3:
                if (hora >= 6 && hora < 12) {
                    System.out.println("Vallenato tradicional");
                } else if (hora < 18) {
                    System.out.println("Vallenato moderno");
                } else {
                    System.out.println("Parranda vallenata");
                }
                break;

            default:
                System.out.println("Emisora inválida.");
        }

        e.close();
    }
}