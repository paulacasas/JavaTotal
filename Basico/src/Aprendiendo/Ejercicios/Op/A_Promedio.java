package Aprendiendo.Ejercicios.Op;

import java.util.Scanner;

public class A_Promedio {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        String nombre;
        float t1, t2, t3;
        float def_mat, def_fis, def_hum, def_tot;

        System.out.print("Ingrese el nombre del estudiante: ");
        nombre = datos.nextLine();

        // Matemáticas
        System.out.print(nombre + " ingresa la nota del examen de matemáticas: ");
        float exam_m = datos.nextFloat();
        System.out.print(nombre + " ingresa la nota de las 3 tareas de matemáticas: ");
        t1 = datos.nextFloat();
        t2 = datos.nextFloat();
        t3 = datos.nextFloat();
        def_mat = ((float) ((exam_m * 0.9) + ((t1 + t2 + t3) / 3) * 0.1)); // Examen: 90% - 3 Tareas: 10%

        // Fisíca
        System.out.print(nombre + " ingresa la nota del examen de física: ");
        float exam_f = datos.nextFloat();
        System.out.print(nombre + " ingresa la nota de las 3 tareas de física: ");
        t1 = datos.nextFloat();
        t2 = datos.nextFloat();
        t3 = datos.nextFloat();
        def_fis = (float) ((exam_f * 0.8) + ((t1 + t2 + t3) / 3) * 0.2); // Examen: 80% - 3 Tareas: 20%

        // Humanidades
        System.out.print(nombre + " ingresa la nota del examen de humanidades: ");
        float exam_h = datos.nextFloat();
        System.out.print(nombre + " ingresa la nota de las 2 tareas de humanidades: ");
        t1 = datos.nextFloat();
        t2 = datos.nextFloat();
        def_hum = (float) ((exam_h * 0.85) + ((t1 + t2) / 2) * 0.15); // Examen: 85% - 2 Tareas: 15%

        def_tot = (def_mat + def_fis + def_hum) / 3;
        System.out.println("Definitiva en matemáticas: " + def_mat);
        System.out.println("Definitiva en física: " + def_fis);
        System.out.println("Definitiva en humanidades: " + def_hum);
        System.out.println("Promendio del estudiante " + nombre + " " + def_tot); // Promedio general en las 3 materias
    }
}