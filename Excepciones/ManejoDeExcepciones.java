package Excepciones;

import java.util.concurrent.ExecutionException;

public class ManejoDeExcepciones {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0; // Una operación que no se puede realizar
            // Se generaría una excepción de ArithmeticException
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error, División por cero no permitida");

        } finally {
            System.out.println("Fin de la ejecución");
        }
        System.out.println("\nNueva Excepción");

        try {
            int div = 4 / 2;
            System.out.println("El resultado: " + div);
        } catch (ArithmeticException e) { // La excepción no se cumple, no se ejecuta
            System.out.println("Error: No se puede dividir por cero.");
        }

        System.out.println("\nNueva Excepción");
        try {
            int num = 3 / 0;
            System.out.println("El resultado: " + num);
        } catch (Exception e) { // Excepción universal
            System.out.println("No se puede realizar una división por 0 \n" + e.getMessage());
        }
    }
}
