package Aprendiendo.Aprendiendo;

import javax.swing.JOptionPane;

public class Q_TryCatch {
    public static void main(String[] args) {
        String b = "";
        boolean condition = false;

        do {
            try { // Función intentar
                int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
                b = String.valueOf(a);
                condition = false;
            } catch (Exception e) { // Exepción en caso que no funcione
                JOptionPane.showMessageDialog(null, "Error, Ingresa un caracter valido");
                condition = true;
            }
        } while (condition == true);
        JOptionPane.showMessageDialog(null, "Numero: " + b);
    }
}
