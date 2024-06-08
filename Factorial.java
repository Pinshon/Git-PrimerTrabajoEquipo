import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa un número:");
        int numero = scanner.nextInt();

        long factorial = calcularFactorial(numero);

        System.out.println("El factorial de " + numero + " es " + factorial + ".");
    }

    public static long calcularFactorial(int numero) {
        long resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
