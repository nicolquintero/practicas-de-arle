import java.util.Scanner;

public class descuento {
    public static void main(String[] args) {
    Scanner d = new Scanner(System.in);
    System.out.println("¿Eres cliente VIP? (true/false");
       boolean V = d.nextBoolean();     // bolean es un tipo de dato que solo puede ser verdadero o falso 
    System.out.print("¿Tienes cupón de descuento? (true/false): ");
    boolean tieneCupon = d.nextBoolean();
       if (V || tieneCupon) {    //el signo ||se lee O o se dice O  para decidir si es vip o tiene cupon de descuento 
            System.out.println("Se aplica descuento");
    } else {
            System.out.println("Precio regular");
        }

        d.close();
    }
}

