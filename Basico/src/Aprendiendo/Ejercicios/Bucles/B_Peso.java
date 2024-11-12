package Aprendiendo.Ejercicios.Bucles;

import javax.swing.JOptionPane;

public class B_Peso {
    public static void main(String[] args) {
        float pesoAnterior, pesoActual, cantidad;
        int personas = Integer
                .parseInt(JOptionPane.showInputDialog("Digite la cantidad de personas que va a evaluar: "));
        for (int i = 1; i <= personas; i++) {
            pesoAnterior = Float
                    .parseFloat(JOptionPane.showInputDialog("Usuario N°" + i + "\nDigite su peso anterior: "));
            pesoActual = Float.parseFloat(JOptionPane.showInputDialog("Usuario N°" + i + "\nDigite su peso actual: "));
            cantidad = pesoActual - pesoAnterior;
            if (cantidad > 0) {
                JOptionPane.showMessageDialog(null, "Usuario N°" + i + "\nHas subido " + cantidad + " kg");
            } else if (cantidad < 0) {
                JOptionPane.showMessageDialog(null, "Usuario N°" + i + "\nHas bajado " + cantidad + " kg");
            } else {
                JOptionPane.showMessageDialog(null, "Usuario N°" + i + "\nHas permanecido en el mismo peso");
            }
        }
    }
}
