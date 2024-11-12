package Aprendiendo.Ejercicios.Vectores;

import java.util.Scanner;

public class A_ImparPar {
    public static void main(String[] args) {
        int par = 0, impar = 0, sumP = 0, sumI = 0;
        int numeros[] = new int[5]; // Creamos el vector de 5 arrays

        for (int i = 0; i < numeros.length; i++) {
            Scanner datos = new Scanner(System.in);
            System.out.print("Ingrese un número: ");
            numeros[i] = datos.nextInt();

            if (numeros[i] % 2 == 0) { // Verificamos que sea un número par
                par += 1;
                sumP += numeros[i];
            } else {
                impar += 1;
                sumI += numeros[i];
            }
        }
        System.out.println("\nCantidad de números pares: " + par);
        System.out.println("Suma de números pares: " + sumP);
        System.out.println("\nCantidad de números impares: " + impar);
        System.out.println("Suma de números impares: " + sumI);
    }
}
