package Aprendiendo.Ejercicios.Vectores;

import java.util.Random;
import java.util.Scanner;

public class N_CalculadoraVectorial {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);

        // System.out.print("Ingrese la dimencion del vector: ");
        // int element = datos.nextInt();
        int element = 10;
        boolean divisor = false;
        Random num = new Random();

        int[] vectorN1 = new int[element];
        int[] vectorN2 = new int[element];
        int[] vectorR = new int[element];

        for (int i = 0; i < element; i++) { // Almacenando los valores aleatorios en los dos vectores
            vectorN1[i] = num.nextInt(9);
            vectorN2[i] = num.nextInt(9);
        }
        System.out.println("CALCULADORA VECTORIAL");
        int n = 0;

        while (n != 5) {
            System.out.print("\n1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir \n5. Salir \n>>> ");
            n = datos.nextInt();
            switch (n) {
                case 1:
                    for (int i = 0; i < element; i++) {
                        vectorR[i] = vectorN1[i] + vectorN2[i];
                    }
                    System.out.print("\nVector 1: ");
                    for (int i = 0; i < element; i++) {
                        System.out.print(vectorN1[i] + " ");
                    }
                    System.out.print("\nVector 2: ");
                    for (int i = 0; i < element; i++) {
                        System.out.print(vectorN2[i] + " ");
                    }
                    System.out.print("\nVector 3: ");
                    for (int i = 0; i < element; i++) {
                        System.out.print(vectorR[i] + " ");
                    }
                    break;
                case 2:
                    for (int i = 0; i < element; i++) {
                        vectorR[i] = vectorN1[i] - vectorN2[i];
                    }
                    System.out.print("\nVector 1: ");
                    for (int i = 0; i < element; i++) {
                        System.out.print(vectorN1[i] + " ");
                    }
                    System.out.print("\nVector 2: ");
                    for (int i = 0; i < element; i++) {
                        System.out.print(vectorN2[i] + " ");
                    }
                    System.out.print("\nVector 3: ");
                    for (int i = 0; i < element; i++) {
                        System.out.print(vectorR[i] + " ");
                    }
                    break;
                case 3:
                    for (int i = 0; i < element; i++) {
                        vectorR[i] = vectorN1[i] * vectorN2[i];
                    }
                    System.out.print("\nVector 1: ");
                    for (int i = 0; i < element; i++) {
                        System.out.print(vectorN1[i] + " ");
                    }
                    System.out.print("\nVector 2: ");
                    for (int i = 0; i < element; i++) {
                        System.out.print(vectorN2[i] + " ");
                    }
                    System.out.print("\nVector 3: ");
                    for (int i = 0; i < element; i++) {
                        System.out.print(vectorR[i] + " ");
                    }
                    break;
                case 4:
                    for (int i = 0; i < element; i++) {
                        if (vectorN2[i] != 0) { // Realizar división si el valor del divisor es diferente de 0
                            vectorR[i] = vectorN1[i] / vectorN2[i];
                        } else {
                            vectorR[i] = 0; //
                            divisor = true;
                        }
                    }
                    if (divisor == true) {
                        System.out.print("Error, no puedes hacer una división por 0");
                    }
                    System.out.print("\nVector 1: ");
                    for (int i = 0; i < element; i++) {
                        System.out.print(vectorN1[i] + " ");
                    }
                    System.out.print("\nVector 2: ");
                    for (int i = 0; i < element; i++) {
                        System.out.print(vectorN2[i] + " ");
                    }
                    System.out.print("\nVector 3: ");
                    for (int i = 0; i < element; i++) {
                        System.out.print(vectorR[i] + " ");
                    }
                    break;
                case 5:
                    System.out.println("Programa finalizado...");
                    break;
                default:
                    System.out.println("Número invalido");
                    break;
            }
        }
    }
}
