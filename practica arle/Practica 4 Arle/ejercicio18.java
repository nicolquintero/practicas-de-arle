public class ejercicio18 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30};
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }

        System.out.println("Suma total: " + suma);
    }
}
