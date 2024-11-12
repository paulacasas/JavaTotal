package Aprendiendo.Aprendiendo;

import javax.swing.JOptionPane;

public class G_FuncionSwitch {
    public static void main(String[] args) {
        int dato; // Declararamos una valiable como tipo entero
        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: ")); // Pedimos el dato por pantalla y
                                                                                     // lo almacenamos en la variable

        switch (dato) { // Creamos la condición dependiento del valor que nos den
            case 0 -> JOptionPane.showMessageDialog(null, "El número es cero");
            case 1 -> JOptionPane.showMessageDialog(null, "El número es uno");
            case 2 -> JOptionPane.showMessageDialog(null, "El número es dos");
            case 3 -> JOptionPane.showMessageDialog(null, "El número es tres");
            case 4 -> JOptionPane.showMessageDialog(null, "El número es cuatro");
            case 5 -> JOptionPane.showMessageDialog(null, "El número es cinco");
            // Colocamos una respuesta por defecto (en caso de que no se ejecute ninguna de
            // las anteriores
            default -> JOptionPane.showMessageDialog(null, "El numero es mayor a 5");
        }
        // Creamos la condición dependiendo del valor que nos den

        String color; // Declararamos una variable como tipo cadena
        color = JOptionPane.showInputDialog("Ingrese un color: "); // Pedimos el dato por pantalla y lo almacenamos en
                                                                   // la variable
        switch (color) { // Creamos la condición dependiento del valor que nos den
            case "verde":
                JOptionPane.showMessageDialog(null, "The color is green");
                break;
            case "rojo":
                JOptionPane.showMessageDialog(null, "The color is red");
                break;
            case "amarillo":
                JOptionPane.showMessageDialog(null, "The color is yellow");
                break;
            case "azul":
                JOptionPane.showMessageDialog(null, "The color is blue");
                break;
            case "blanco":
                JOptionPane.showMessageDialog(null, "The color is white");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Any colors");
                break;
        }
    }
}
