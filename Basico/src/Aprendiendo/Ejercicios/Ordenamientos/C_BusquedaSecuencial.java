package Aprendiendo.Ejercicios.Ordenamientos;

import java.util.Scanner;

public class C_BusquedaSecuencial {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int[] arreglo = { 5, 1, 4, 3, 2 };
        boolean band = false;
        System.out.println("Digite el dato que desea buscar: ");
        int dato = datos.nextInt();

        int i = 0;
        while (i < 5 && band == false) {
            if (arreglo[i] == dato) {
                band = true;
            }
            i++;
        }
        if (band == false) {
            System.out.println("No se ha encontrado el número que estabas buscando");
        } else {
            System.out.println("Hemos encontrado el valor que estabas buscando, en la posición: " + (i - 1));
        }
    }
}
