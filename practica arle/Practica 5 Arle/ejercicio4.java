import java.util.Scanner;

public class ejercicio4 {
    public static String clasificarEdad(int edad) {
        if (edad >= 0 && edad <= 12) {
            return "Niño";
        } else if (edad <= 17) {
            return "Adolescente";
        } else if (edad <= 59) {
            return "Adulto";
        } else if (edad >= 60) {
            return "Adulto Mayor";
        } else {
            return "Edad inválida";
        }
    }

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        System.out.print("Ingrese la edad: ");
        int edad = c.nextInt();

        System.out.println("La persona es: " + clasificarEdad(edad));

        c.close();
    }
}


