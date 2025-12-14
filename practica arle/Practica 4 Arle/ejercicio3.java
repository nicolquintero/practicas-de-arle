import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner ej = new Scanner(System.in);

        System.out.print("Ingrese el total de estudiantes: ");
        int totalEstudiantes = ej.nextInt();

        int contador = 1;

        while (contador <= totalEstudiantes) {
            System.out.println("Estudiante número " + contador);
            contador = contador + 1;
        }

        ej.close();
    }
}

