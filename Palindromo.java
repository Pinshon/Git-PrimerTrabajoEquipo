import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa un número:");
        int numero = scanner.nextInt();

        if (esPalindromo(numero)) {
            System.out.println("El número ingresado es un palíndromo.");
        } else {
            System.out.println("El número ingresado no es un palíndromo.");
        }
    }

    public static boolean esPalindromo(int numero) {
        int reverso = 0;
        int copiaNumero = numero;

        while (copiaNumero != 0) {
            int digito = copiaNumero % 10;
            reverso = reverso * 10 + digito;
            copiaNumero /= 10;
        }

        return numero == reverso;
    }
}

