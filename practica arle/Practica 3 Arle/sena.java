import java.util.Scanner;
public class sena {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);

        System.out.println("rogramas del sena");
        System.out.println("1 ADSO");
        System.out.println("2 Gestión Empresarial");
        System.out.println("3 Mantenimiento de Equipos");

        System.out.print("Seleccione un programa: ");
        int programa = se.nextInt();

        System.out.print("Seleccione modalidad (1=Presencial, 2=Virtual): ");
        int modalidad = se.nextInt();

        String nombre = "";
        String modo = "";
        String duracion = "";
        String jornada = "";

        switch (programa) {
            case 1:
                nombre = "ADSO";
                duracion = "24 meses";
                break;
            case 2:
                nombre = "Gestión Empresarial";
                duracion = "18 meses";
                break;
            case 3:
                nombre = "Mantenimiento de Equipos";
                duracion = "12 meses";
                break;
            default:
                System.out.println("Programa inválido.");
                
        }

        if (modalidad == 1) {
            modo = "Presencial";
            jornada = "Mañana";
        } else if (modalidad == 2) {
            modo = "Virtual";
            jornada = "Libre / a tu ritmo";
        } else {
            System.out.println("Modalidad inválida.");
            
        }

        System.out.println("Programa: " + nombre);
        System.out.println("Modalidad: " + modo);
        System.out.println("Duración: " + duracion);
        System.out.println("Jornada: " + jornada);

        se.close();
    }
}
