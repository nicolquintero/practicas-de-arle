import java.util.Scanner;

public class ejercicio8 {

    public static void encontrarMayorMenor() {
        Scanner t = new Scanner(System.in);
        boolean primero = true;
        int mayor = 0, menor = 0, numero;

        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = t.nextInt();

            if (numero != 0) {
                if (primero) {
                    mayor = menor = numero;
                    primero = false;
                } else {
                    if (numero > mayor) mayor = numero;
                    if (numero < menor) menor = numero;
                }
            }
        } while (numero != 0);

        if (!primero) {
            System.out.println("Mayor: " + mayor);
            System.out.println("Menor: " + menor);
        } else {
            System.out.println("No se ingresaron números");
        }
        t.close();
    }

    public static void main(String[] args) {
        encontrarMayorMenor();
    }
}

