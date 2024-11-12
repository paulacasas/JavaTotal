package Aprendiendo.Ejercicios.Vectores;

import java.util.Scanner;

public class C_PositivosNegativos {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int positivo = 0, negativo = 0;

        int num[] = new int[10];
        for (int i = 0; i < num.length; i++) {
            System.out.print("Numeros [" + i + "]: ");
            num[i] = datos.nextInt();
            if (num[i] > 0) {
                positivo++;
            } else {
                negativo++;
            }
        }
        System.out.println("Positivo: " + positivo);
        System.out.println("Negativo: " + negativo);
    }     
}
