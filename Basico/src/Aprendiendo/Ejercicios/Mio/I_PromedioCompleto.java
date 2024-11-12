package Aprendiendo.Ejercicios.Mio;

import java.util.Random;
import java.util.Scanner;

public class I_PromedioCompleto {
    public static void main(String[] args) {
        Scanner datos1 = new Scanner(System.in);
        Scanner datosS2 = new Scanner(System.in);
        Random num = new Random();
        String[] meses = { "", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
                "Octubre", "Noviembre", "Diciembre" };
        int[] vector = new int[10];
        String[] nombres = new String[4];
        int op, suma = 0, n = 0, aleatorio;
        float promedio = 0;

        boolean vf = true;
        while (vf) {
            System.out.println("\n1. Generar 10 números aleatorios entre (0 y 12)");
            System.out.println("2. Calular la suma de los elementos del vector ");
            System.out.println("3. Mostrar elemento menor, elemento mayor, y promedio del vector");
            System.out
                    .println("4. Solicitar un valor 'J' entre 0 y 9 mostrar el valor del vector y qué mes corresponde");
            System.out.println("5. Ingrese 4 nombres de personas");
            System.out.println("6. Generar un numero aletorio entre 0 y 3 y mostrar el nombre en esa posición");
            System.out.println("7. Salir del programa");
            System.out.print(">> ");
            op = datos1.nextInt();

            switch (op) {
                case 1:
                    for (int i = 0; i < 10; i++) {
                        vector[i] = num.nextInt(12 - 1 + 1) + 1;
                        // vector[i] = (int) (Math.random()*(12-1+1)+1);
                    }

                    System.out.print("[");
                    for (int i = 0; i < 10; i++) {
                        System.out.print(vector[i]);
                        if (i < (10 - 1)) {
                            System.out.print(", ");
                        }
                    }
                    System.out.print("]");
                    break;
                case 2:
                    for (int i = 0; i < 10; i++) {
                        suma += vector[i];
                    }
                    System.out.print("Resultado de la suma: " + suma);
                    break;
                case 3:
                    int minimo = vector[0];
                    int maximo = vector[0];
                    for (int i : vector) {
                        if (i < minimo) {
                            minimo = i;
                        }
                        if (i > maximo) {
                            maximo = i;
                        }
                    }
                    promedio = (float) (suma / 12);
                    System.out.println("Número menor: " + minimo);
                    System.out.println("Número mayor: " + maximo);
                    System.out.println("Promedio: " + promedio);
                    break;
                case 4:
                    System.out.print("Ingrese un número entre 0 y 9: ");
                    n = datos1.nextInt();

                    System.out.println("Valor del vector en la posición " + n + ": " + vector[n]);
                    System.out.println("Corresponde al mes: " + meses[vector[n]]);

                    break;
                case 5:
                    for (int i = 0; i < 4; i++) {
                        System.out.print("Ingrese un nombre: ");
                        nombres[i] = datosS2.nextLine();
                    }
                    break;
                case 6:
                    aleatorio = num.nextInt(3);
                    System.out.println("Numero aleatorio generado: " + aleatorio);
                    System.out.println(nombres[aleatorio] + " Usted ha ganado");
                    break;
                case 7:
                    vf = false;
                    break;
                default:
                    System.out.println("Selecciona un número del menu");
            }
        }
    }
}
