package Aprendiendo.Ejercicios.Mio;

import java.util.Random;

public class J_RellenarMatrizAleatorio {
    public static void main(String[] args) {
        Random num = new Random();

        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int ii = 0; ii < 4; ii++) {
                matriz[i][ii] = num.nextInt(15 - 5 + 1) + 5; // Crear un número aleatorio de 5 a 15
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.print("[");
            for (int ii = 0; ii < 4; ii++) {
                System.out.print(matriz[i][ii]);
                if (ii < (4 - 1)) {
                    System.out.print(" ");
                }
            }
            System.out.println("]");
        }
        // System.out.println(matriz[0][3]);
    }
}
