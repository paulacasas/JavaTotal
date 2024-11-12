package Aprendiendo.Ejercicios.Mio;

import java.util.Scanner;

public class B_NumeroAleatorio {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int n, aleatorio, contador = 0; // Declarar variables
        aleatorio = (int) (Math.random() * 100); // Generar un número aleatorio entre 0-100

        do {
            System.out.print("Ingrese un número: ");
            n = datos.nextInt();
            if (aleatorio > n) {
                System.out.println("Es mayor");
            } else if (aleatorio < n) {
                System.out.println("Es menor");
            }
            contador++; // Número de intentos
        } while (n != aleatorio);

        System.out.println("Acertaste");
        System.out.println("Número de intentos: " + contador);
    }
}
