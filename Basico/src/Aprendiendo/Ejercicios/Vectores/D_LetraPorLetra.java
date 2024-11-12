package Aprendiendo.Ejercicios.Vectores;

import java.util.Scanner;

public class D_LetraPorLetra {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        String palabra;
        int letras = 0;

        System.out.print("Escribe una palabra: ");
        palabra = datos.next();
        char caracteres[] = new char[palabra.length()]; // Separar los caracteres
        for (int i = 0; i < palabra.length(); i++) {
            letras++; // Aúmenta el contador
            caracteres[i] = palabra.charAt(i); // Almacenamos la letra en caracteres
            System.out.print(caracteres[i] + " ");
        }
        System.out.println("\nCantidad de caracteres: " + letras);

    }
}
