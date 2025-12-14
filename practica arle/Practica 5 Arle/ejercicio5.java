import java.util.Scanner;

public class ejercicio5 {
    public static long calcularFactorial(int numero) {
        if (numero < 0) {
            return -1;
        }

        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = p.nextInt();

        long resultado = calcularFactorial(num);

        if (resultado == -1) {
            System.out.println("No se puede calcular factorial de números negativos");
        } else {
            System.out.println("El factorial es: " + resultado);
        }

        p.close();
    }
}
