import java.util.Scanner;
public class par_o_impar {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("ingrse el numero entero");
        int numero= p.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Numero par");
        } else{
            System.out.println("El numero es impar");

        }
        p.close();  
    }
    
}




