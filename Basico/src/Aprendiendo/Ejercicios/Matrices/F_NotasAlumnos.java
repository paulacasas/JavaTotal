package Aprendiendo.Ejercicios.Matrices;

import java.util.Scanner;

public class F_NotasAlumnos {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        double[][] matriz = new double[4][4];
        double sum;

        for (int i = 0; i < 4; i++) {
            sum = 0;
            System.out.println("Alumno N°" + i);
            for (int ii = 0; ii < 3; ii++) {
                System.out.print("Nota N°" + ii + ": ");
                matriz[i][ii] = datos.nextDouble();
                sum += matriz[i][ii];
            }
            matriz[i][3] = sum / 3;
        }

        for (int i = 0; i < 4; i++) {
            System.out.print("Alumno N°" + i);
            System.out.print(" [");
            for (int ii = 0; ii < 4; ii++) {
                System.out.print(matriz[i][ii]);
                if (ii < (4 - 1)) {
                    System.out.print(" ");
                }
            }
            System.out.println("]");
        }
    }
}
