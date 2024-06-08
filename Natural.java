import java.util.Scanner;

public class Natural {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa un número natural:");
        int numero = scanner.nextInt();

        if (esPrimo(numero)) {
            System.out.println("El número ingresado es primo.");
        } else {
            System.out.println("El número ingresado es compuesto.");
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}