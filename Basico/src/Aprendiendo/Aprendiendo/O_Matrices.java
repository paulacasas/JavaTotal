package Aprendiendo.Aprendiendo;

import java.util.Scanner;

public class O_Matrices {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        // Indicar sus elementos
        int[][] dato = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; // Matriz de 3x3

        for (int i = 0; i < 3; i++) { // Para las filas
            System.out.print("F " + i + " = [");
            for (int ii = 0; ii < 3; ii++) { // Para las columnas
                System.out.print(dato[i][ii]);
                if (ii < 2) {
                    System.out.print(" ");
                }
                if (ii == 2) {
                    System.out.println("] ");
                }
            }
        }

        // Pedir elementos por pantalla
        int filas, columnas;
        System.out.print("Ingrese el número de filas: ");
        filas = datos.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        columnas = datos.nextInt();
        int[][] edades = new int[filas][columnas];

        for (int i = 0; i < filas; i++) { // Filas

            for (int ii = 0; ii < columnas; ii++) { // Columna
                System.out.print("Matriz [" + i + "] [" + ii + "] " + ": ");
                edades[i][ii] = datos.nextInt();
            }
        }

        for (int i = 0; i < filas; i++) { // Para las filas
            System.out.print("F " + i + " = [");
            for (int ii = 0; ii < columnas; ii++) { // Para las columnas
                System.out.print(edades[i][ii]);
                if (ii < (columnas - 1)) {
                    System.out.print(" ");
                }
                if (ii == (columnas - 1)) {
                    System.out.println("] ");
                }
            }
        }

        /*
         * // Basico
         * // Las matrices son bidimencionales
         * // Filas = Horizontales Columanas = Verticales
         * int [][] matriz = new int [3][3];
         * 
         * matriz[0][0] = 5;
         * matriz[0][1] = 12;
         * matriz[0][2] = 15;
         * matriz[1][0] = 9;
         * matriz[1][1] = 508;
         * matriz[1][2] = 3;
         * matriz[2][0] = 276;
         * matriz[2][1] = 76;
         * matriz[2][2] = 24;
         * 
         * // Recorrer matrices
         * for (int f = 0; f < 3; f++) { // Filas
         * for (int c = 0; c < 3; c++) { // Columnas
         * System.out.println("Posición F:"+ f + " c:" + c + " = " + matriz[f][c]);
         * }
         * }
         * 
         * // Avanzado
         * int [][] newValue = new int[3][3];
         * 
         * // Asignar valores
         * for (int f = 0; f < 3; f++) {
         * for (int c = 0; c < 3; c++) {
         * System.out.print("Fila: " + f + " Columna: " + c + " = " );
         * newValue[f][c] = datos.nextInt();
         * 
         * System.out.println("Valor" + newValue[f][c]);
         * }
         * }
         * 
         */
    }
}
