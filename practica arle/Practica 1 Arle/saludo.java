
import java.util.Scanner;
public class saludo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("ingrse la hora");
        int numero= s.nextInt();
        
        if (numero >=6 && numero <=12 ) {
            System.out.println("buenos dias");
        }if (numero >=12 && numero <=18 ) {
            System.out.println("buenas tardes");
        }if  (numero >=18 && numero <=23 ) {    
            System.out.println("buenas noches");
            }
            s.close();
    }
} 




