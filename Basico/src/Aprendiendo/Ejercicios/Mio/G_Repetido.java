package Aprendiendo.Ejercicios.Mio;

import java.util.Scanner;

public class G_Repetido {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int element = 100;
        int contador = 0, contE = 0;
        boolean menu = true;

        int[] vector = new int[element];

        System.out.println("Ingresa el número 0 para finalizar");

        while (menu) {
            for (int i = 0; i < element; i++) {
                System.out.print("Ingrese un número: ");
                vector[i] = datos.nextInt();
                if (vector[i] > 0) {
                    vector[i] = vector[i];
                }
                if (vector[i] == 8) {
                    contador++;
                }
                contE++;

                if (vector[i] == 0) {
                    menu = false;
                    i--;
                    break;

                }
            }

            if (!menu) {
                break;
            }
        }
        System.out.print("Cantidad de 8 en el vector: " + contador);
        System.out.print("\nVector -> ");
        for (int i = 0; i < (contE - 1); i++) {
            System.out.print(vector[i] + " ");
        }
    }
}
