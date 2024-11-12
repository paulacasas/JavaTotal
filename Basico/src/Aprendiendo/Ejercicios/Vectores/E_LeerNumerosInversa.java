package Aprendiendo.Ejercicios.Vectores;

import java.util.Scanner;

public class E_LeerNumerosInversa {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = datos.nextInt();
        }
        for (int i = numeros.length; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}
