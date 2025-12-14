import java.util.ArrayList;
import java.util.Collections;

public class ejercicio1 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(12);
        numeros.add(45);
        numeros.add(60);
        numeros.add(7);
        numeros.add(90);
        numeros.add(22);
        numeros.add(51);
        numeros.add(33);
        numeros.add(10);
        numeros.add(75);
        System.out.println("Números pares:");
        for (int n : numeros) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }

        int suma = 0;
        for (int n : numeros) {
            suma += n;
        }
        System.out.println("Suma total: " + suma);

        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("Lista ordenada descendente:");
        System.out.println(numeros);

        int contador = 0;
        for (int n : numeros) {
            if (n > 50) {
                contador++;
            }
        }
        System.out.println("Cantidad de números mayores que 50: " + contador);
    }
}