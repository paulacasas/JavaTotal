package Aprendiendo.Ejercicios.Vectores;

import java.util.Scanner;

public class J_SepararParesImpares {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int elementos;
        System.out.print("Ingrese la cantidad de elementos que tendra el array: ");
        elementos = datos.nextInt();

        int[] num = new int[elementos]; // Array inicial
        int Npar = 0, Nimpar = 0; // Contadores

        for (int i = 0; i < num.length; i++) {
            System.out.print("Elemento N°" + (i + 1) + "\nIngrese un número: ");
            num[i] = datos.nextInt();

            if (num[i] % 2 == 0) {
                Npar++; // Contar el total de pares
            } else {
                Nimpar++; // Contar el total de pares
            }
        }
        // Creamos los arrays necesarios con la cantidad de elementos exacta
        int[] par = new int[Npar];
        int[] impar = new int[Nimpar];

        // Los vuelvo a inicializar en 0 para correr en el bucle
        Npar = 0;
        Nimpar = 0;

        // Almacenar los valores en los arrays determinados
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                // El elemento actual del array `num` se añade al array `par` en la posición
                // `Npar`, y luego `Npar` incrementa 1
                par[Npar++] = num[i];
            } else {
                impar[Nimpar++] = num[i];
            }
        }

        System.out.println("Cantidad total de números: " + elementos);
        System.out.println("Cantidad de números pares: " + Npar);
        System.out.println("Cantidad de números impares: " + Nimpar);
        System.out.println("\nNúmeros pares: ");
        for (int i = 0; i < Npar; i++) {
            System.out.print(par[i] + " ");
        }
        System.out.println("\nNúmeros impares: ");
        for (int i = 0; i < Nimpar; i++) {
            System.out.print(impar[i] + " ");
        }
    }
}
