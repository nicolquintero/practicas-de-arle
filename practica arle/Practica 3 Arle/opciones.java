import java.util.Scanner;
public class opciones {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);

        System.out.println("Rifa de boleta");
        System.out.println("1 Boleta Plata");
        System.out.println("2 Boleta Oro");
        System.out.println("3 Boleta Diamante");

        System.out.print("Seleccione el tipo de boleta (1-3): ");
        int tipo = op.nextInt();

        System.out.print("Cantidad de boletas: ");
        int cant = op.nextInt();

        if (cant <= 0) {
            System.out.println("Cantidad inválida.");
            
        }

        int precio = 0;

        switch (tipo) {
            case 1: // plata
                if (cant < 5) {
                    precio = 5000;
                } else {
                    precio = 4500;
                }
                break;

            case 2: // oro
                if (cant < 3) {
                    precio = 10000;
                } else {
                    precio = 9000;
                }
                break;

            case 3: // diamante
                if (cant < 2) {
                    precio = 20000;
                } else {
                    precio = 18000;
                }
                break;

            default:
                System.out.println("Tipo de boleta inválido.");
                
        }

        int total = precio * cant;

        System.out.println("Precio unitario: $" + precio);
        System.out.println("Total a pagar: $" + total);

        op.close();
    }
}


