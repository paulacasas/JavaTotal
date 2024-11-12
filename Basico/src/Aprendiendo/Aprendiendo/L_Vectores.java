package Aprendiendo.Aprendiendo;

import javax.swing.JOptionPane;

public class L_Vectores {
    public static void main(String[] args) {
        // Basico

        int[] numeros = new int[3]; // Tipo [] nombre = new Tipo [Tamaño vector]

        // Asignar los valores
        numeros[0] = 1;
        numeros[1] = 5;
        numeros[2] = 8;

        for (int i = 0; i < 3; i++) {
            System.out.println(numeros[i]); // Mostramos
        }

        int[] num = { 3, 4, 9 }; // Crear vector con valores ya asignados

        for (int i = 0; i < 3; i++) {
            System.out.println(num[i]);
        }

        // Intermedio
        int elementos;
        elementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del array: "));

        char[] letras = new char[elementos]; // Creamos el vector con el tamaño que el usuario indique

        for (int i = 0; i < elementos; i++) {
            letras[i] = JOptionPane.showInputDialog("Array N°" + i + "\nIngresa una letra: ").charAt(0); // del vector
        }
        for (int i = 0; i < elementos; i++) {
            JOptionPane.showMessageDialog(null, letras[i]); // Mostramos todos los elementos
        }

        // Avanzado
        String[] nombres = { "Paula", "Adrian", "Julian", "Daniel", "Luisa" };

        // Tipo de dato Iterador : Nombre de arreglo
        for (String i : nombres) { // Bucle for each (for mejorado)
            System.out.println(i);
        }

        int[] edades = { 12, 43, 53, 21, 19 };
        for (int i : edades) {
            System.out.println(i);
        }
    }
}
