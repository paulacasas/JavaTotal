package Aprendiendo.Ejercicios.Vectores.Mezclar;

import java.util.Scanner;

public class A_MezclarArreglo {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese el elemento N°" + (i + 1) + " del arreglo A: ");
            a[i] = datos.nextInt();
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            System.out.print("Ingrese el elemento N°" + (i + 1) + " del arreglo B: ");
            b[i] = datos.nextInt();
        }
        // Entender esto
        int[] ab = new int[20]; // Creo un nuevo arreglo donde tendra todos los valores
        int ii = 0; // Nueva variable iteradora
        for (int i = 0; i < 10; i++) {
            ab[ii] = a[i];
            ii++;
            ab[ii] = b[i];
            ii++;
        }
        for (int i = 0; i < ab.length; i++) {
            System.out.print(ab[i] + " ");
        }
    }
}
