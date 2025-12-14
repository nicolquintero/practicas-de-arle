
import java.util.Scanner;

public class edad {
    public static void main(String[] args) {
        Scanner cine = new Scanner(System.in);
        System.out.print("edad");
        int edad= cine.nextInt();
        if (edad >=13) {
            System.out.println("puedes entrar a la pelicula para mayores de 13");
        } else{
            System.out.println("No puedes entrar elije una apta para tu edad");

        }
        cine.close();   
    }
    
}




