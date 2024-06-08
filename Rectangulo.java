import java.util.Scanner;
public class Rectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa la altura del rectángulo:");
        int altura = scanner.nextInt();

        System.out.println("Por favor, ingresa el ancho del rectángulo:");
        int ancho = scanner.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
