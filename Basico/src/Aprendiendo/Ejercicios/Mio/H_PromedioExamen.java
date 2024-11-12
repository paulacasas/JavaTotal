package Aprendiendo.Ejercicios.Mio;

/* Leer en un vector las notas de un examen de un curso de N estudiantes.
 Imprima el promedio de notas del curso.
 Imprima las posiciones del vector en donde hubo notas que no excedan del 70% del promedio.*/

import java.util.Scanner;

public class H_PromedioExamen {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int estudiantes = 5;

        float[] notas = new float[estudiantes];
        float promedio = 0, total = 0;

        for (int i = 0; i < estudiantes; i++) {
            System.out.print("Alumno N" + (i + 1) + " Ingrese su nota: ");
            notas[i] = datos.nextFloat();
            if (notas[i] < 0 || notas[i] > 5) {
                System.out.println("No puedes ingresar una nota inferior a 0 ni superior a 5");
                i--;
            } else {
                total += notas[i];
            }
        }
        promedio = total / estudiantes;
        System.out.println("Promedio de notas del curso: " + promedio);
        System.out.println("Posiciones del vector que no excedieron del 70% del promedio");
        for (int i = 0; i < estudiantes; i++) {
            if (notas[i] <= promedio * 0.7) {
                System.out.print((i + 1) + " ");
            }
        }
    }
}
