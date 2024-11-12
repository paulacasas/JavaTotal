package Aprendiendo.Ejercicios.Condicionales;

import java.util.Scanner;

public class A_AlmacenZapatos {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        float descuento, total_zap;
        System.out.println("¿Qué tipo de zapatos desea compar?");
        // Un Almacén de zapatos ofrece 3 tipos
        System.out.print("1. Tenis \n2. De cuero \n3. Zandalias \n>> ");
        int menu = datos.nextInt();

        System.out.print("¿Cuantos pares desea llevar? \n>> ");
        int pares = datos.nextInt();

        System.out.println("Ingrese el valor de los zapatos: ");
        float valor = datos.nextFloat();

        float valor_fn = valor * pares;

        if (1 == menu) { // Tenis
            if (pares == 1) { // Si compra un par el 15% de descuento
                descuento = (float) (valor_fn * 0.15);
                total_zap = (float) (valor_fn - descuento);
                System.out.println("El valor de " + pares + " tenis es de $" + total_zap);
            } else if (pares == 2) { // Si compra dos pares el 25% de descuento
                descuento = (float) (valor_fn * 0.25);
                total_zap = (float) (valor_fn - descuento);
                System.out.println("El valor de " + pares + " tenis es de $" + total_zap);
            } else if (pares == 3) { // Si compra tres pares el 28% de descuento
                descuento = (float) (valor_fn * 0.28);
                total_zap = (float) (valor_fn - descuento);
                System.out.println("El valor de " + pares + " tenis es de $" + total_zap);
            } else if (pares > 3) { // Si compra mas de tres el 35% de descuento
                descuento = (float) (valor_fn * 0.35);
                total_zap = (float) (valor_fn - descuento);
                System.out.println("El valor de " + pares + " tenis es de $" + total_zap);
            }
        } else if (2 == menu) { // De cuero
            if (pares == 1) { // Si compra un par obsequian un juego de betun
                descuento = 0;
                total_zap = (float) (valor_fn - descuento);
                System.out
                        .println("Por la compra de " + pares + " par de zapatos de cuero se obserquia un juego betun");
                System.out.println("El valor de " + pares + " zapatos de cuero es de $" + total_zap);
            } else if (pares == 2) { // Si compra dos pares el 23% descuento
                descuento = (float) (valor_fn * 0.23);
                total_zap = (float) (valor_fn - descuento);
                System.out.println("El valor de " + pares + " zapatos de cuero es de $" + total_zap);
            } else if (pares == 3) { // Si compra tres pares el el 31% descuento
                descuento = (float) (valor_fn * 0.31);
                total_zap = (float) (valor_fn - descuento);
                System.out.println("El valor de " + pares + " zapatos de cuero es de $" + total_zap);
            } else if (pares == 4) { // si compra cuatro pares el 40% descuento
                descuento = (float) (valor_fn * 0.40);
                total_zap = (float) (valor_fn - descuento);
                System.out.println("El valor de " + pares + " zapatos de cuero es de $" + total_zap);
            } else if (pares > 4) { // Más de cuatro el 47% descuento
                descuento = (float) (valor_fn * 0.47);
                total_zap = (float) (valor_fn - descuento);
                System.out.println("El valor de " + pares + " zapatos de cuero es de $" + total_zap);
            }
        } else if (3 == menu) { // Zandalias
            if (pares == 1) { // Un par obsequian un par de medias
                descuento = 0;
                total_zap = (float) (valor_fn - descuento);
                System.out.println("Por la compra de " + pares + " par de zandalias se obsequia unas medias");
                System.out.println("El valor de " + pares + " zandalias es de $" + total_zap);
            } else if (pares >= 2 || pares <= 4) { // Entre dos pares y cuatro pares el 25% descuento
                descuento = (float) (valor_fn * 0.25);
                total_zap = (float) (valor_fn - descuento);
                System.out.println("El valor de " + pares + " zandalias es de $" + total_zap);
            } else if (pares > 4) { // Más de cuatro el 30% descuento
                descuento = (float) (valor_fn * 0.30);
                total_zap = (float) (valor_fn - descuento);
                System.out.println("El valor de " + pares + " zandalias es de $" + total_zap);
            }
        }
    }
}
