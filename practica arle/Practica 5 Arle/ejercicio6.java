import java.util.Scanner;

public class ejercicio6 {

    public static void calcularPromedio() {
        Scanner l = new Scanner(System.in);
        double suma = 0;
        int contador = 0;
        int invalidas = 0;
        double nota;

        do {
            System.out.print("Ingrese una nota (0-10) o -1 para salir: ");
            nota = l.nextDouble();

            if (nota != -1) {
                if (nota >= 0 && nota <= 10) {
                    suma += nota;
                    contador++;
                } else {
                    invalidas++;
                    System.out.println("Nota inválida");
                }
            }
        } while (nota != -1);

        if (contador > 0) {
            System.out.println("Promedio: " + (suma / contador));
            System.out.println("Notas inválidas: " + invalidas);
        } else {
            System.out.println("No hay notas válidas");
        }
        l.close();
    }

    public static void main(String[] args) {
        calcularPromedio();
    }
}

