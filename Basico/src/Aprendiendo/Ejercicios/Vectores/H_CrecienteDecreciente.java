package Aprendiendo.Ejercicios.Vectores;

import java.util.Scanner;

public class H_CrecienteDecreciente {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        boolean creciente = false, decreciente = false;
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            System.out.print("Ingrese un número: ");
            num[i] = datos.nextInt();
        }
        for (int i = 0; i < 9; i++) {
            if (num[i] < num[i + 1]) { // Creciente
                creciente = true;
            }
            if (num[i] > num[i + 1]) { // Decreciente
                decreciente = true;
            }
        }
        if (creciente == true && decreciente == false) {
            System.out.println("Los números estan de forma creciente");
        } else if (creciente == false && decreciente == true) {
            System.out.println("Los números estan de forma decreciente");
        } else if (creciente == true && decreciente == true) {
            System.out.println("Los números estan desordenados");
        } else {
            System.out.println("Todos los números son iguales");
        }
    }
}
