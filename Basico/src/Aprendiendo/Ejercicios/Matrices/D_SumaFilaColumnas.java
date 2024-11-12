package Aprendiendo.Ejercicios.Matrices;

import java.util.Scanner;

public class D_SumaFilaColumnas {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int sumF, sumC;
        System.out.print("Ingresa el tamaño de la fila: ");
        int nF = datos.nextInt();
        System.out.print("Ingresa el tamaño de la columna: ");
        int nC = datos.nextInt();

        int[][] matriz = new int[nF][nC];

        for (int i = 0; i < nF; i++) {
            for (int ii = 0; ii < nC; ii++) {
                System.out.print("Posición [" + i + "][" + ii + "]: ");
                matriz[i][ii] = datos.nextInt();
            }
        }
        for (int i = 0; i < nF; i++) {
            System.out.print("[");
            for (int ii = 0; ii < nC; ii++) {
                System.out.print(matriz[i][ii]);
                if (ii < (nC - 1)) {
                    System.out.print(" ");
                }
            }
            System.out.println("]");
        }

        // Suma de filas
        for (int i = 0; i < nF; i++) {
            sumF = 0;
            for (int ii = 0; ii < nC; ii++) {
                sumF += matriz[i][ii];
            }
            System.out.println("Suma de la fila " + i + ": " + sumF);
        }
        // Suma de columnas
        for (int ii = 0; ii < nC; ii++) {
            sumC = 0;
            for (int i = 0; i < nF; i++) {
                sumC += matriz[i][ii];
            }
            System.out.println("Suma de la columna " + ii + ": " + sumC);
        }
    }
}
