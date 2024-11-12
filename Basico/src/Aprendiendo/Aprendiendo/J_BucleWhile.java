package Aprendiendo.Aprendiendo;

import java.util.Scanner;

public class J_BucleWhile {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int i = 1; // Variable iteradora que aumentara su valor

        System.out.print("Digite cuantos números quiere en pantalla: ");
        int contador = datos.nextInt();

        // El bucle while sirve para repetir una instrucción simpre y cuando sea
        // verdadera
        while (i <= contador) { // Mientras que la variable iteradora sea menor que contador
            System.out.println(i);
            i++; // Aumentando el valor de la variable iteradora
        }
        datos.close();
    }
}
