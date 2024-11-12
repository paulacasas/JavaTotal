package Aprendiendo.Ejercicios.Mio;

import java.util.Scanner;

public class D_MediaMedianaModa {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese el valor del array: ");
        int items = datos.nextInt();
        int[] valor = new int[items];

        float sum = 0, contador = 0, media, mediana, moda;
        float mitad;

        for (int i = 0; i < items; i++) {
            System.out.print("Ingrese un número: ");
            valor[i] = datos.nextInt();
            contador++;
            sum += valor[i];
        }
        // Organizar de onden ascendente
        int p, aux;
        for (int i = 0; i < items; i++) {
            p = i; // Variable con el valor de i en cada iteración
            aux = valor[i]; // Variable que almacena el valor almacenado en el vector
            System.out.println(aux);

            while ((p > 0) && (valor[p - 1] > aux)) {
                valor[p] = valor[p - 1];
                p--;
            }
            valor[p] = aux;
        }

        System.out.println("Orden ascendente: ");
        for (int i = 0; i < items; i++) {
            System.out.print(valor[i] + " ");
        }

        mitad = (items / 2);
        System.out.println(mitad);
        mediana = (valor[(int) mitad] + valor[(int) mitad + 1]) / 2;
        System.out.println("\nLa mediana es: " + mediana);

        media = (sum / contador);
        System.out.println("La media es: " + media);

    }
}
