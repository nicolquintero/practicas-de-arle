import java.util.Scanner;
public class lista {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        System.out.println("lista de spotify");
        System.out.println("1 Lista Estudio");
        System.out.println("2 Lista Entrenamiento");
        System.out.println("3 Lista Fiesta");

        System.out.print("Seleccione la lista (1-3): ");
        int lista = l.nextInt();

        System.out.print("Tipo de lista: 1 = corta, 2 = larga: ");
        int tipo = l.nextInt();

        String nombreLista = "";
        String tipoLista = "";
        int canciones = 0;
        String duracion = "";

        switch (lista) {
            case 1:
                nombreLista = "Estudio";
                break;
            case 2:
                nombreLista = "Entrenamiento";
                break;
            case 3:
                nombreLista = "Fiesta";
                break;
            default:
                System.out.println("Lista inválida.");
                
        }

        if (tipo == 1) {
            tipoLista = "Corta";
            canciones = 10;
            duracion = "30 minutos";
        } else if (tipo == 2) {
            tipoLista = "Larga";
            canciones = 25;
            duracion = "1 hora 15 minutos";
        } else {
            System.out.println("Tipo inválido.");
            
        }

        System.out.println("Lista: " + nombreLista);
        System.out.println("Tipo: " + tipoLista);
        System.out.println("Canciones: " + canciones);
        System.out.println("Duración: " + duracion);

        l.close();
    }
}

