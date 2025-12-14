public class ejercicio21 {
    public static void main(String[] args) {
        int[] numeros = {2, 4, 6, 8, 10};
        int suma = 0;

        for (int valor : numeros) {
            suma += valor;
        }

        System.out.println("La suma es: " + suma);
    }
}
