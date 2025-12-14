import java.util.Scanner;

public class alquiler {
    public static void main(String[] args) {
        Scanner al = new Scanner(System.in);

        System.out.println("Alquiler de lavadoras");
        System.out.println("1 Lavadora estándar");
        System.out.println("2 Lavadora grande");
        System.out.println("3 Lavadora industrial");

        System.out.print("Seleccione el tipo de lavadora (1-3): ");
        int tipo = al.nextInt();

        System.out.print("Ingrese número de horas de alquiler: ");
        int horas = al.nextInt();

        if (horas <= 0) {
            System.out.println("Las horas deben ser mayores a 0.");
            
        }

        int precioHora = 0;

        switch (tipo) {
            case 1: 
                if (horas <= 3) {
                    precioHora = 5000;
                } else {
                    precioHora = 4000;
                }
                break;

            case 2: 
                if (horas <= 3) {
                    precioHora = 7000;
                } else {
                    precioHora = 6000;
                }
                break;

            case 3: 
                if (horas <= 3) {
                    precioHora = 10000;
                } else {
                    precioHora = 8000;
                }
                break;

            default:
                System.out.println("Tipo de lavadora inválido.");
                
        }

        int total = precioHora * horas;

        System.out.println("Precio por hora: $" + precioHora);
        System.out.println("Total a pagar: $" + total);

        al.close();
    }
}