package Aprendiendo.Aprendiendo;

import java.util.Scanner;

public class H_BucleFor {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números que quiere mostrar: ");
        int valor = datos.nextInt();
        // (Iniciador de la variable; condición ; aumento de la variable inicializador)
        for (int i = 2; i <= valor; i += 2) { // i aumento + i y el valor que quiera
            System.out.println(i);
        }
        datos.close();
    }
}
