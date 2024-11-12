package Aprendiendo.Ejercicios.Matrices;

import java.util.Scanner;

public class A_DatosUsuario {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        // Tipo de dato [] [] Variable = new Tipo de dato [Fila] [Columna];
        String[][] usuario = new String[3][2];
        String condicion;
        int contador = 1;
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 2; c++) {
                condicion = contador % 2 != 0 ? "nombre" : "apellido";
                System.out.println("Ingrese su " + condicion + ": ");
                usuario[f][c] = datos.next();
                contador++;
            }
        }
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 1; c++) {
                System.out.println("Nombre: " + usuario[f][0] + " Apellido: " + usuario[f][1]);
            }
        }
    }
}
