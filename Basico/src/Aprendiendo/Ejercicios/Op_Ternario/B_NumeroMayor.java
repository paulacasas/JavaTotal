package Aprendiendo.Ejercicios.Op_Ternario;

import javax.swing.JOptionPane;

public class B_NumeroMayor {
    public static void main(String[] args) {
        int n1, n2;
        String condicion;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

        // Variable = Condición ? "Verdadero" : "Falso";
        condicion = n1 > n2 ? "El numero " + n1 + " es mayor que " + n2 : "El numero " + n2 + " es mayor que " + n2;

        JOptionPane.showMessageDialog(null, condicion);
    }
}
