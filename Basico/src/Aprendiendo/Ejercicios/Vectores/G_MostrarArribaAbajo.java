package Aprendiendo.Ejercicios.Vectores;

import java.util.Scanner;

public class G_MostrarArribaAbajo {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números a evaluar: ");
        int num = datos.nextInt();
        int[] numeros = new int[num];
        int numDiv = numeros.length / 2;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = datos.nextInt();
        }

        int primero = 0; // Primero
        int ultimo = numeros.length - 1; // Ultimo

        for (int i = 0; i < numDiv; i++) {
            System.out.println(numeros[primero]);
            System.out.println(numeros[ultimo]);
            primero += 1; // Suma la siguiente posición respecto del primero
            ultimo -= 1; // Resta una posición respecto del último
        }
    }
}
