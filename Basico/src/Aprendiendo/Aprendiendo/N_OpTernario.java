package Aprendiendo.Aprendiendo;

import java.util.Scanner;

public class N_OpTernario {
    public static void main(String[] args) {
        double promendio;
        String condicionF;

        Scanner datos = new Scanner(System.in);

        System.out.print("Ingrese el promedio del alumno: ");
        promendio = datos.nextDouble();

        // Variable = Condición ? "CondiciónVerdadera" : "CondiciónFalsa";
        condicionF = promendio >= 6 ? "Aprobado" : "Reprobado";
        System.out.println("La condición final del alunmo es: " + condicionF);
        datos.close();
    }
}
