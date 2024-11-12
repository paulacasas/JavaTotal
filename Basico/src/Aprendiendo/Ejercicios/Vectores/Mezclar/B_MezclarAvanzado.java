package Aprendiendo.Ejercicios.Vectores.Mezclar;

import java.util.Scanner;

public class B_MezclarAvanzado {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int[] b = { 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24 };
        int[] ab = new int[24];
        int ii = 0;

        for (int i = 0; i < 12; i += 3) {
            ab[ii] = a[i];
            ii++;
            ab[ii] = a[i + 1];
            ii++;
            ab[ii] = a[i + 2];
            ii++;
            ab[ii] = b[i];
            ii++;
            ab[ii] = b[i + 1];
            ii++;
            ab[ii] = b[i + 2];
            ii++;
        }
        for (int iii : ab) {
            System.out.println(iii + " ");
        }
    }
}
