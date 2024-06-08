Andrea Piña

Este es un programa en Java que dibuja un rectángulo en la consola utilizando asteriscos (*).

import java.util.Scanner;: Esta línea importa la clase Scanner del paquete java.util, que se utiliza para obtener la entrada del usuario.

public class Rectangulo { ... }: Define una clase pública llamada Rectangulo.

public static void main(String[] args) { ... }: Este es el método principal que se ejecuta cuando se inicia el programa.
Scanner scanner = new Scanner(System.in);: Crea un objeto scanner de la clase Scanner para leer la entrada del usuario.
System.out.println("Por favor, ingresa la altura del rectángulo:");: Imprime un mensaje pidiendo al usuario que ingrese la altura del rectángulo.
int altura = scanner.nextInt();: Lee la entrada del usuario y la almacena en la variable altura.
System.out.println("Por favor, ingresa el ancho del rectángulo:");: Imprime un mensaje pidiendo al usuario que ingrese el ancho del rectángulo.
int ancho = scanner.nextInt();: Lee la entrada del usuario y la almacena en la variable ancho.
for (int i = 0; i < altura; i++) { ... }: Este es un bucle for que se ejecuta altura veces. Cada iteración del bucle representa una fila del rectángulo.
for (int j = 0; j < ancho; j++) { ... }: Este es un bucle for anidado dentro del bucle anterior que se ejecuta ancho veces. Cada iteración del bucle representa una columna del rectángulo.
System.out.print("*");: Imprime un asterisco sin una nueva línea. Esto se hace ancho veces para formar una fila del rectángulo.
System.out.println();: Imprime una nueva línea después de imprimir todos los asteriscos de una fila. Esto se hace altura veces para formar el rectángulo completo.

Este es un programa en Java que verifica si un número ingresado por el usuario es un palíndromo. 

import java.util.Scanner;: Esta línea importa la clase Scanner del paquete java.util, que se utiliza para obtener la entrada del usuario.
public class Palindromo { ... }: Define una clase pública llamada Palindromo.
public static void main(String[] args) { ... }: Este es el método principal que se ejecuta cuando se inicia el programa.

Scanner scanner = new Scanner(System.in);: Crea un objeto scanner de la clase Scanner para leer la entrada del usuario.

System.out.println("Por favor, ingresa un número:");: Imprime un mensaje pidiendo al usuario que ingrese un número.

int numero = scanner.nextInt();: Lee la entrada del usuario y la almacena en la variable numero.

if (esPalindromo(numero)) { ... } else { ... }: Esta es una declaración if-else que verifica si el número ingresado es un palíndromo utilizando el método esPalindromo. Si el número es un palíndromo, imprime “El número ingresado es un palíndromo.”. De lo contrario, imprime “El número ingresado no es un palíndromo.”.

public static boolean esPalindromo(int numero) { ... }: Este es un método que verifica si un número es un palíndromo. Toma un número entero como argumento y devuelve un valor booleano.

int reverso = 0; int copiaNumero = numero;: Estas líneas inicializan una variable reverso para almacenar el número invertido y una variable copiaNumero para almacenar una copia del número original.

while (copiaNumero != 0) { ... }: Este es un bucle while que se ejecuta hasta que copiaNumero se convierte en 0. En cada iteración, extrae el último dígito de copiaNumero y lo agrega a reverso.

int digito = copiaNumero % 10;: Esta línea obtiene el último dígito de copiaNumero.

reverso = reverso * 10 + digito;: Esta línea agrega el dígito extraído a reverso.

copiaNumero /= 10;: Esta línea elimina el último dígito de copiaNumero.

return numero == reverso;: Esta línea compara el número original y su reverso. Si son iguales, el número es un palíndromo, por lo que devuelve true. De lo contrario, devuelve false.

Este es un programa en Java que verifica si un número ingresado por el usuario es primo. 

import java.util.Scanner;: Esta línea importa la clase Scanner del paquete java.util, que se utiliza para obtener la entrada del usuario.

public class Natural { ... }: Define una clase pública llamada Natural.

public static void main(String[] args) { ... }: Este es el método principal que se ejecuta cuando se inicia el programa.

Scanner scanner = new Scanner(System.in);: Crea un objeto scanner de la clase Scanner para leer la entrada del usuario.

System.out.println("Por favor, ingresa un número natural:");: Imprime un mensaje pidiendo al usuario que ingrese un número natural.

int numero = scanner.nextInt();: Lee la entrada del usuario y la almacena en la variable numero.

if (esPrimo(numero)) { ... } else { ... }: Esta es una declaración if-else que verifica si el número ingresado es primo utilizando el método esPrimo. Si el número es primo, imprime “El número ingresado es primo.”. De lo contrario, imprime “El número ingresado es compuesto.”.

public static boolean esPrimo(int numero) { ... }: Este es un método que verifica si un número es primo. Toma un número entero como argumento y devuelve un valor booleano.

if (numero <= 1) { ... }: Esta es una declaración if que verifica si el número es menor o igual a 1. Si es así, el método devuelve false, ya que los números menores o iguales a 1 no son primos.

for (int i = 2; i < numero; i++) { ... }: Este es un bucle for que comienza en 2 y termina en numero - 1. Verifica si numero es divisible por cualquier número en este rango.

if (numero % i == 0) { ... }: Esta es una declaración if que verifica si numero es divisible por i. Si es así, el método devuelve false, ya que los números primos solo tienen dos divisores: 1 y ellos mismos.

return true;: Si el número no es divisible por ningún número en el rango de 2 a numero - 1, entonces es primo, por lo que el método devuelve true.

Este es un programa en Java que calcula el factorial de un número ingresado por el usuario. 

import java.util.Scanner;: Esta línea importa la clase Scanner del paquete java.util, que se utiliza para obtener la entrada del usuario.

public class Factorial { ... }: Define una clase pública llamada Factorial.

public static void main(String[] args) { ... }: Este es el método principal que se ejecuta cuando se inicia el programa.

Scanner scanner = new Scanner(System.in);: Crea un objeto scanner de la clase Scanner para leer la entrada del usuario.

System.out.println("Por favor, ingresa un número:");: Imprime un mensaje pidiendo al usuario que ingrese un número.

int numero = scanner.nextInt();: Lee la entrada del usuario y la almacena en la variable numero.

long factorial = calcularFactorial(numero);: Llama al método calcularFactorial con numero como argumento y almacena el resultado en la variable factorial.

System.out.println("El factorial de " + numero + " es " + factorial + ".");: Imprime el factorial del número ingresado.
public static long calcularFactorial(int numero) { ... }: Este es un método que calcula el factorial de un número. Toma un número entero como argumento y devuelve un valor long.

long resultado = 1;: Esta línea inicializa una variable resultado con el valor 1. Esta variable se utilizará para almacenar el resultado del cálculo del factorial.

for (int i = 2; i <= numero; i++) { ... }: Este es un bucle for que comienza en 2 y termina en numero. Multiplica resultado por cada número en este rango para calcular el factorial.

resultado *= i;: Esta línea multiplica resultado por i y almacena el resultado en resultado.

return resultado;: Esta línea devuelve el resultado del cálculo del factorial.