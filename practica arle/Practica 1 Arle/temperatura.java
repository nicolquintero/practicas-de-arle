import java.util.Scanner;
public class temperatura {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.print("Ingrese la temperatura: ");
        int temp = t.nextInt();

        if (temp < 10) {
            System.out.println("Frío");
        } else if (temp <= 25) {
            System.out.println("Templado");
        } else {
            System.out.println("Caliente");
        }

        t.close();
    }
}

