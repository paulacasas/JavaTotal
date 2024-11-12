package Aprendiendo.Ejercicios.Mio;

import java.util.Scanner;

public class E_IndiceMasaCorporal {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        float peso, estatura, imc;

        System.out.print("Ingrese su peso (kg): ");
        peso = datos.nextFloat();

        System.out.print("Ingrese su estatura (cm): ");
        estatura = datos.nextFloat();

        imc = (float) (peso / Math.pow(estatura, 2));
        System.out.println("Su indice de masa corporar es de: " + Math.round(imc));
    }
}
