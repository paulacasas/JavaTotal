package Aprendiendo.Ejercicios.Bucles;

import java.util.Scanner;

public class C_LeerNumeros {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int[] num = new int[5]; // Vector de 5 dimenciones
        for (int i = 0; i < num.length; i++) {
            System.out.print("Ingrese un número: ");
            num[i] = datos.nextInt();
        }
        for (int i : num) { // Bucle for each
            System.out.print(i + " ");
        }
    }
}
