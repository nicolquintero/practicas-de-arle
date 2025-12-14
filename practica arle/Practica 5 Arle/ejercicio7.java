import java.util.Scanner;

public class ejercicio7 {
    static double celsiusAFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    static double fahrenheitACelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);

        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        int opcion = v.nextInt();

        System.out.print("Ingrese la temperatura: ");
        double temp = v.nextDouble();

        if (opcion == 1) {
            System.out.println(celsiusAFahrenheit(temp));
        } else if (opcion == 2) {
            System.out.println(fahrenheitACelsius(temp));
        } else {
            System.out.println("Opción inválida");
        }

        v.close();
    }
}


