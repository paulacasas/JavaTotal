package Aprendiendo.Ejercicios.Mio;

import java.util.Scanner;

public class A_Calculadora {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in); // Función Scanner para pedir datos
        // Variables
        int suma, resta, div, multi, op, n1, n2 = 0, inicio, sqrt;
        System.out.println("Calculadora");
        System.out.print("1. Iniciar \n>> ");
        inicio = datos.nextInt();

        while (inicio == 1) {
            System.out.println("¿Qué operación desea realizar?");
            System.out.print("1. Suma \n2. Resta \n3. División \n4. Multiplicación \n5. Opciones avanzadas \n>> ");
            op = datos.nextInt();
            while (op > 5 || op < 0) { // Repetir hasta ingresar una opción correcta
                System.out.println("Número invalido");
                System.out.print("1. Suma \n2. Resta \n3. División \n4. Multiplicación \n5. Opciones avanzadas \n>>");
                op = datos.nextInt();
            }
            if (op == 1) {
                System.out.print("Ingrese un número:");
                n1 = datos.nextInt();
                System.out.print("Ingrese otro número:");
                n2 = datos.nextInt();
                suma = n1 + n2;
                System.out.println("El resultado de la suma es: " + suma);
            } else if (op == 2) {
                System.out.print("Ingrese un número:");
                n1 = datos.nextInt();
                System.out.print("Ingrese otro número:");
                n2 = datos.nextInt();
                resta = n1 - n2;
                System.out.println("El resultado de la resta es: " + resta);
            } else if (op == 3) {
                System.out.print("Ingrese un número:");
                n1 = datos.nextInt();
                do { // Verificar que el divisor no sea 0
                    System.out.print("Ingrese otro número:");
                    n2 = datos.nextInt();
                    if (n2 == 0) {
                        System.out.println("No puedes hacer una división por 0");
                    }
                } while (n2 == 0);
                div = n1 / n2;
                float new_div = div; // Convertir
                System.out.println("El resultado de la división es: " + new_div);
            } else if (op == 4) {
                System.out.print("Ingrese un número:");
                n1 = datos.nextInt();
                System.out.print("Ingrese otro número:");
                n2 = datos.nextInt();
                multi = n1 * n2;
                System.out.println("El resultado de la multiplicación es: " + multi);

                // Otras funciones
            } else if (op == 5) {
                System.out.println("¿Qué operación desea realizar?");
                System.out.print("1. Raiz cuadrada \n2.   \n3.  \n4.  \n5.  \n>> ");
                op = datos.nextInt();

                System.out.print("Ingrese un número:");
                n1 = datos.nextInt();

                if (op == 1) {
                    sqrt = (int) Math.sqrt(n1);
                    System.out.println("La raiz cuadrada de " + n1 + " es: " + sqrt);
                } else if (op == 2) {
                    resta = n1 - n2;
                    System.out.println("El resultado de la es " + resta);
                } else if (op == 3) {
                    div = n1 / n2;
                    System.out.println("El resultado de la  es " + div);
                } else if (op == 4) {
                    multi = n1 * n2;
                    System.out.println("El resultado de la es " + multi);
                } else if (op == 5) {
                }
            }
            System.out.println("¿Desea continuar utilizando la calculadora?");
            System.out.print("1. Continuar \n2. Finalizar \n>> ");
            inicio = datos.nextInt();

            if (inicio == 2) {
                System.out.println("Gracias por usar la calculadora");
                break;
            }
        }
    }
}
