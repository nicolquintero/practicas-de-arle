import java.util.Scanner;
public class suscripcion {
    
    public static void main(String[] args) {
        Scanner su = new Scanner(System.in);

        System.out.println(" Suscripcion de gimnasio");
        System.out.println("1. Plan Básico");
        System.out.println("2. Plan Intermedio");
        System.out.println("3. Plan Premium");

        System.out.print("Seleccione el plan (1-3): ");
        int plan = su.nextInt();

        System.out.print("Ingrese cantidad de meses: ");
        int meses = su.nextInt();

        if (meses <= 0) {
            System.out.println("Meses inválidos.");
            
        }

        int total = 0;

        switch (plan) {
            case 1: 
                if (meses == 1) {
                    total = 30000;
                } else if (meses == 3) {
                    total = 80000;
                } else if (meses >= 6) {
                    total = 150000;
                } else {
                    System.out.println("No hay precio definido para esa cantidad de meses.");
                    
                }
                break;

            case 2: 
                if (meses == 1) {
                    total = 40000;
                } else if (meses == 3) {
                    total = 110000;
                } else if (meses >= 6) {
                    total = 200000;
                } else {
                    System.out.println("No hay precio definido para esa cantidad de meses.");
                    
                }
                break;

            case 3: 
                if (meses == 1) {
                    total = 60000;
                } else if (meses == 3) {
                    total = 160000;
                } else if (meses >= 6) {
                    total = 280000;
                } else {
                    System.out.println("No hay precio definido para esa cantidad de meses.");
                    
                }
                break;

            default:
                System.out.println("Plan inválido.");
                
        }

        System.out.println("Total a pagar: $" + total);

        su.close();
    }
}
