package Aprendiendo.Aprendiendo;

import javax.swing.JOptionPane;

public class C_FuncionJOptionPane {
    public static void main(String[] args) {
        // Declaramos las variables
        String cadena;
        int entero;
        char letra;
        double decimal;
        float puntoDecimal;

        // Utilizar la función para un String
        cadena = JOptionPane.showInputDialog("Ingrese una cadena: ");
        // Mostrando el mensaje
        JOptionPane.showMessageDialog(null, "La cadena es : " + cadena);

        // Utilizar la función para un Int
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        // Mostrar el mensaje
        JOptionPane.showMessageDialog(null, "El número es: " + entero);

        // Utilizar la función para un Char
        letra = JOptionPane.showInputDialog("Ingrese una letra").charAt(0);
        // Mostrar el mensaje
        JOptionPane.showMessageDialog(null, "La letra es: " + letra);

        // Utilizar la función para un Double
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un decimal: "));
        // Mostrar el mensaje
        JOptionPane.showMessageDialog(null, "El número decimal es: " + decimal);

        // Utilizar la función para un Float
        puntoDecimal = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un número punto decimal "));
        // Mostrar el mensaje
        JOptionPane.showMessageDialog(null, "El número con punto decimal es: " + puntoDecimal);
    }
}
