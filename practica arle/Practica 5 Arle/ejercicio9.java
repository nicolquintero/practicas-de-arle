import java.util.Scanner;

public class ejercicio9 {

    static double areaCirculo(double r) {
        return Math.PI * r * r;
    }

    static double areaRectangulo(double b, double h) {
        return b * h;
    }

    static double areaTriangulo(double b, double h) {
        return (b * h) / 2;
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.println("1. Círculo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Triángulo");
        int opcion = t.nextInt();

        if (opcion == 1) {
            System.out.print("Radio: ");
            System.out.println(areaCirculo(t.nextDouble()));
        } else if (opcion == 2) {
            System.out.print("Base: ");
            double b = t.nextDouble();
            System.out.print("Altura: ");
            double h = t.nextDouble();
            System.out.println(areaRectangulo(b, h));
        } else if (opcion == 3) {
            System.out.print("Base: ");
            double b = t.nextDouble();
            System.out.print("Altura: ");
            double h = t.nextDouble();
            System.out.println(areaTriangulo(b, h));
        } else {
            System.out.println("Opción inválida");
        }

        t.close();
    }
}
