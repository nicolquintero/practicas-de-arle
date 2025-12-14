import java.util.Scanner;

public class regitroEvnto {
    public static void main(String[] args) {
        Scanner re = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = re.nextInt();

        System.out.print("Ingrese los cupos disponibles: ");
        int cupos = re.nextInt();

        if (edad >= 18 && cupos > 0) {
            System.out.println("Registro exitoso");
        } else if (edad < 18) {
            System.out.println("Debe ser mayor de edad");
        } else {
            System.out.println("No hay cupos disponibles");
        }

        re.close();
    }
}
