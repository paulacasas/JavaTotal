package Aprendiendo.Ejercicios.Vectores;

import javax.swing.JOptionPane;

public class F_MediaPositivosNegativos {
    public static void main(String[] args) {
        double contadorP = 0, sumP = 0, mediaP = 0, contadorN = 0, sumN = 0, mediaN = 0, ceros = 0;
        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

            if (num[i] == 0) {
                ceros++;
            } else if (num[i] < 0) {
                contadorN++;
                sumN += num[i];
                mediaN = sumN / contadorN;
            } else {
                contadorP++;
                sumP += num[i];
                mediaP = sumP / contadorP;
            }
        }
        JOptionPane.showMessageDialog(null, "Media de positivos: " + mediaP);
        JOptionPane.showMessageDialog(null, "Media de negativos: " + mediaN);
        JOptionPane.showMessageDialog(null, "Cantidad de ceros: " + ceros);
    }
}
