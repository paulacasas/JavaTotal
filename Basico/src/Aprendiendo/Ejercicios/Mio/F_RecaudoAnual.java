package Aprendiendo.Ejercicios.Mio;

import java.util.Scanner;

public class F_RecaudoAnual {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
                "Agosto", "Septiembre", "Octubre", "Noviembre ", "Diciembre" };
        float[] nmeses = new float[12];
        float suma = 0, porcentaje = 0, impares = 0;

        System.out.println("Dinero recaudado durante los 12 meses en el año 2010 por el Estadio Metropolitano.");
        for (int i = 0; i < 12; i++) {
            System.out.print("Ingrese la cantidad de dinero del mes de " + meses[i] + " $ ");
            nmeses[i] = datos.nextFloat();
            suma += (float) nmeses[i];
        }
        for (int i = 0; i < 12; i++) {
            if (i % 2 == 0) {
                impares += nmeses[i];
                porcentaje = (impares / suma) * 100;
            }
        }
        System.out.println("Meses en los que hubo un recaudo inferior a 5 millones de pesos");
        for (int i = 0; i < 12; i++) {
            if (nmeses[i] < 5) {
                System.out.print(meses[i]);
                if (i < 11) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println("\nDinero recaudado anual: " + suma + " millones de pesos");
        System.out.println("Porcentaje: " + Math.round(porcentaje) + "%"); // N impares
        System.out.println("N impares " + impares);
    }
}
