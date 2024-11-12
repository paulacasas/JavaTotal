package Aprendiendo.Aprendiendo;

import java.util.Scanner;

public class B_FuncionScanner {
    public static void main(String[] args) {
        // Scanner Nombre = new Scanner(System.in)
        Scanner datos = new Scanner(System.in);

        // Declarar las variables
        char letra;
        String cadena;
        int numero;
        float valor;
        double number;

        System.out.print("Digite un cadena: ");
        // next: cadena (El next guarda la cadena hasta que encuentre un espacio)
        // nextLine: cadena extensa (con espacios)
        cadena = datos.nextLine();// Guardar el valor en la variable

        System.out.print("Digite una letra: ");
        // next: cadena (El next guarda la cadena hasta que encuentre un espacio)
        // chatAt: lee el primer carácter
        letra = datos.next().charAt(0);

        System.out.print("Digite un numero: ");
        // nextInt: entero
        // Nombre de la variable Nombre de función Scanner.tipodedato()
        numero = datos.nextInt();

        System.out.print("Digite un numero flotante: ");
        // nextFloat: flotante
        valor = datos.nextFloat();

        System.out.print("Digite un numero double: ");
        // nextDouble: double
        number = datos.nextDouble();

        // Mostrar datos, el + concatena las variables
        System.out.println("La cadena es: " + cadena);
        System.out.println("La letra es: " + letra);
        System.out.println("El numero es: " + numero);
        System.out.println("El float es: " + valor);
        System.out.println("El double es: " + number);
        datos.close();
    }
}
