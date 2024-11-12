package Aprendiendo.Aprendiendo;

import java.util.Scanner;

public class K_BucleDoWhile {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int i = 1; // Variable iteradora

        System.out.print("Ingrese la cantidad de valores: ");
        int contador = datos.nextInt();

        do { // Primero se ejecuta y luego se realiza la condición
            System.out.println(i);
            i++;
        } while (i <= contador); // Condición
        datos.close();
    }
}
