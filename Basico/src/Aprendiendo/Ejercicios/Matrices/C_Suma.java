package Aprendiendo.Ejercicios.Matrices;

import java.util.Scanner;

public class C_Suma {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);

        int n = 2;

        int[][] matriz1 = new int[n][n];
        int[][] matriz2 = new int[n][n];

        int[][] matriz3 = new int[n][n];

        System.out.println("Matriz 1");
        for (int i = 0; i < n; i++) {
            for (int ii = 0; ii < n; ii++) {
                System.out.print("[" + i + "][" + ii + "]: ");
                matriz1[i][ii] = datos.nextInt();
            }
        }

        System.out.println("Matriz 2");
        for (int i = 0; i < n; i++) {
            for (int ii = 0; ii < n; ii++) {
                System.out.print("[" + i + "][" + ii + "]: ");
                matriz2[i][ii] = datos.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int ii = 0; ii < n; ii++) {
                matriz3[i][ii] = matriz1[i][ii] + matriz2[i][ii];
            }
        }

        System.out.println("Matriz 3");
        for (int i = 0; i < n; i++) {
            System.out.print("[");
            for (int ii = 0; ii < n; ii++) {
                System.out.print(matriz3[i][ii]);
                if (ii < (n - 1)) {
                    System.out.print(" ");
                }
            }
            System.out.println("]");
        }
    }
}
