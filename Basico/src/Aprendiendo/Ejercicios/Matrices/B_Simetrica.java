package Aprendiendo.Ejercicios.Matrices;

import java.util.Scanner;

public class B_Simetrica {
    public static void main(String[] args) {
        // Comprobar si es cuadrada n filas = n columnas
        // Que las filas se puedan pasar a columnas
        Scanner datos = new Scanner(System.in);
        boolean simetrica = true;

        System.out.print("Ingrese la cantidad de filas: ");
        int filas = datos.nextInt();
        System.out.print("Ingrese la cantidad de columnas: ");
        int columnas = datos.nextInt();

        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int ii = 0; ii < columnas; ii++) {
                System.out.print("Ingrese el elemento [" + i + "][" + ii + "]: ");
                matriz[i][ii] = datos.nextInt();
            }
        }

        if (filas == columnas) { // Es cuadrada
            int i = 0;
            while (i < filas && (simetrica == true)) {
                int ii = 0;
                while (ii < i && (simetrica == true)) {
                    if (matriz[i][ii] != matriz[ii][i]) {
                        simetrica = false;
                    }
                    ii++;
                }
                i++;
            } // Fin while
            if (simetrica == true) {
                System.out.println("La matriz es simetrica");
            } else {
                System.out.println("La matriz no es simetrica ");
            }
        } else {
            System.out.println("La natriz no es cuadrada");
        }
        if (simetrica == true) {
            for (int i = 0; i < filas; i++) {
                System.out.print("[");
                for (int ii = 0; ii < filas; ii++) {
                    System.out.print(matriz[i][ii]);
                    if (ii < (filas - 1)) {
                        System.out.print(" ");
                    }
                }
                System.out.println("]");
            }
        }
    }
}
