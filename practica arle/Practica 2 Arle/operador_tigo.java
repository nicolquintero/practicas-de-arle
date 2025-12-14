import java.util.Scanner;

public class operador_tigo {
    public static void main(String[] args) {

        Scanner op = new Scanner(System.in);

        System.out.println("Bienvenidos a Tigo");

        System.out.print("Digite su cédula: ");
        String ce = op.nextLine();  

        System.out.println("Seleccione al área a la que se quiere comunicar");
        System.out.println("1. Celular");
        System.out.println("2. Hogar");
        System.out.println("3. Quejas");
        System.out.println("4. Facturación");

        System.out.print("Ingrese una opción: ");

        int opcion = op.nextInt(); 

        switch (opcion) {
            case 1:
                System.out.println("Datos móviles");
                System.out.println("Verificación de consumo.");
                break;

            case 2:
                System.out.println("Internet hogar");
                System.out.println("Pruebas de conexión.");
                break;

            case 3:
                System.out.println("Registrar petición, queja o reclamo.");
                break;

            case 4:
                System.out.println("Facturación");
                System.out.println("Pagos.");
                break;

            default:
                System.out.println("Opción no válida.");
        }

        System.out.println("Gracias por comunicarse con Tigo.");
        op.close();
    }
}
