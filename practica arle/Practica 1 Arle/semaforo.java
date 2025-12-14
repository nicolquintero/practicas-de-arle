import java.util.Scanner;
public class semaforo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese el color del semáforo: ");
        String color = s.next();

        if (color.equalsIgnoreCase("verde")) {
            System.out.println("puede cruzar.");
        } else if (color.equalsIgnoreCase("amarillo")) {
            System.out.println("tenga precausion.");
        } else if (color.equalsIgnoreCase("rojo")) {
            System.out.println("no puede cruzar.");
        } else {
            System.out.println("color inválido.");
        }

        s.close();
    }
}


