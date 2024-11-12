package Aprendiendo.Ejercicios.Matrices.Trasponer;

import java.util.Scanner;

public class A_Trasponer {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Ingrese los valores en la matriz");
        for (int i = 0; i < 3; i++) {
            for (int ii = 0; ii < 3; ii++) {
                System.out.print("Posición [" + i + "][" + ii + "]: ");
                matriz[i][ii] = datos.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.print("[");
            for (int ii = 0; ii < 3; ii++) {

                System.out.print(matriz[i][ii]);
                if (ii < (3 - 1)) {
                    System.out.print(" ");
                }
            }
            System.out.println("]");
        }
        int aux;
        // Trasponiendo la matriz
        for (int i = 0; i < 3; i++) {
            for (int ii = 0; ii < i; ii++) {
                aux = matriz[i][ii]; // Matriz normal
                matriz[i][ii] = matriz[ii][i]; // Cambiamos los valores
                matriz[ii][i] = aux;
            }
        }
        System.out.println("Matriz traspuesta");
        for (int i = 0; i < 3; i++) {
            System.out.print("[");
            for (int ii = 0; ii < 3; ii++) {

                System.out.print(matriz[i][ii]);
                if (ii < (3 - 1)) {
                    System.out.print(" ");
                }
            }
            System.out.println("]");
        }
    }
}
