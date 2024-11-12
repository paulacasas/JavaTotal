package Aprendiendo.Ejercicios.Mio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C_Pizzeria {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int menuTotal, op;
        List<String> bebida = new ArrayList<String>();
        List<String> comida = new ArrayList<String>();
        int beber = 0, comer = 0;

        System.out.println("Bienvenido a la pizzería Bella Napoli");
        System.out.print("1. Iniciar: ");
        int inicio = datos.nextInt();
        System.out.println("¿Qué desea ordenar?");
        while (inicio == 1) {
            System.out.print("1. Pizzas \n2. Bebidas \n> ");
            menuTotal = datos.nextInt();

            if (menuTotal == 1) {
                System.out.print("1. Pizzas vegetarianas \n2. Pizzas no vegetarianas \n> ");
                op = datos.nextInt();
                if (op == 1) {
                    System.out.println("Ingredientes de pizza vegetariana");
                    System.out.print("1. Pimiento \n2. Tofu \n> ");
                    comer = datos.nextInt();
                    switch (comer) {
                        case 1:
                            comida.add("Pizza vegetariana: Pimiento");
                            break;
                        case 2:
                            comida.add("Pizza vegetariana: Tofu");
                            break;
                    }
                } else if (op == 2) {
                    System.out.println("Ingredientes de pizza no vegetariana");
                    System.out.print("1. Peperoni \n2. Jamón \n3. Salmón  \n> ");
                    comer = datos.nextInt();
                    switch (comer) {
                        default:
                            comida.add("");
                        case 1:
                            comida.add("Pizza no vegetariana: Peperoni");
                            break;
                        case 2:
                            comida.add("Pizza no vegetariana: Jamón");
                            break;
                        case 3:
                            comida.add("Pizza no vegetariana: Salmón");
                            break;

                    }
                }
            } else if (menuTotal == 2) {
                System.out.print("1. Gaseosas \n2. Limonadas \n> ");
                op = datos.nextInt();
                if (op == 1) {
                    System.out.println("Bebidas gaseosas");
                    System.out.print("1. Coca-Cola \n2. Colombiana \n> ");
                    beber = datos.nextInt();
                    switch (beber) {
                        case 1:
                            bebida.add("Gaseosas: Coca-Cola");
                            break;
                        case 2:
                            bebida.add("Gaseosas: Colombiana");
                            break;
                    }
                } else if (op == 2) {
                    System.out.println("Bebidas limonadas");
                    System.out.print("1. Limonada de coco \n2. Limonada de jamaica \n> ");
                    beber = datos.nextInt();
                    switch (beber) {
                        case 1:
                            bebida.add("Limonada: Limonada de coco");
                            break;
                        case 2:
                            bebida.add("Limonada: Limonada de jamaica");
                            break;
                    }
                }
            }
            System.out.print("1. Continuar compra \n2. Finalizar \n> ");
            inicio = datos.nextInt();
            if (inicio == 1) {
                continue;
            } else if (inicio == 2) {
                break;
            }
        }
        System.out.println("Resumen de tu compra: ");
        System.out.println("Bebida: " + bebida);
        System.out.println("Comida: " + comida);
    }
}
