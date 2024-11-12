package Aprendiendo.Ejercicios.Vectores.Desplazar;

import java.util.Scanner;

public class A_DesplazarPosicion {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int vector[] = new int[10];
        int ultimo;
        for (int i = 0; i < vector.length; i++) {
            System.out.print((i + 1) + ". Ingrese numero: ");
            vector[i] = datos.nextInt();
        }
        ultimo = vector[9];
        for (int i = 8; i >= 0; i--) {
            vector[i + 1] = vector[i];
        }
        for (int i = 0; i < 10; i++) {
            vector[0] = ultimo;
            System.out.println(vector[i]);
        }
    }
}
