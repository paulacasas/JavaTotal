package Aprendiendo.Ejercicios.Matrices.Trasponer;

import java.util.Scanner;

public class C_TrasponerAvanzado {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese el rango de las filas: ");
        int filas = datos.nextInt();
        System.out.println("Ingrese el rango de las columnas: ");
        int columnas = datos.nextInt();

        int[][] original = new int[filas][columnas];
        int[][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int ii = 0; ii < columnas; ii++) {
                original[i][ii] = (int) (Math.random() * (50 - 10 + 1) + 10);
            }
        }
        for (int i = 0; i < filas; i++) {
            System.out.print("[");
            for (int ii = 0; ii < columnas; ii++) {
                System.out.println(original[i][ii]);
                if (ii < (columnas - 1)) {
                    System.out.print(" ");
                }
            }
            System.out.println("]");
        }

    }
}
