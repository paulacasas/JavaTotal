package Aprendiendo.Ejercicios.Mio;

import java.util.Scanner;

public class K_MetodosString {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        Scanner datosS = new Scanner(System.in); // Scanner para el String
        boolean condicion = true;
        int op, n, pos, cantidad, subcantidad;
        String cadena = null, subCad = null, menu;
        char arroba = '@';

        while (condicion) {
            System.out.print("1. Leer una cadena \n2. Buscar Subcadena \n3. Verificar el @ \n4. Salir "
                    + " \n5. Cantidad de caracteres \n6. Cantidad de subcaracteres \n>> ");
            menu = datos.nextLine();
            try { // Intentar que se convierta la cadena en valor entero
                op = Integer.parseInt(menu.trim());
                // catch (se ingresa el error)
            } catch (NumberFormatException e) { // Caso que no funcione
                System.out.println("Error, Ingresa un valor valido");
                continue; // Volver a intentar
            }
            switch (op) {
                case 1:
                    System.out.print("Ingrese una cadena: ");
                    cadena = datosS.nextLine();
                    break;
                case 2:
                    if (!cadena.isEmpty()) {
                        System.out.print("Ingrese la posición inicial de la subcadena: ");
                        try {
                            n = Integer.parseInt(datos.nextLine());
                            subCad = cadena.substring(n);
                            System.out.println("Subcadena: " + subCad);
                        } catch (StringIndexOutOfBoundsException e) {
                            System.out.println("La posición inicial es inválida");
                        } catch (NumberFormatException e) {
                            System.out.println("Por favor, ingresa un número válido");
                        }
                    } else {
                        System.out.println("No se ha ingresado ninguna cadena");
                    }
                    break;
                case 3:
                    if (!cadena.isEmpty()) { // Verificar que la cadena no este vacia
                        pos = cadena.indexOf(arroba);
                        if (pos != -1) {
                            System.out.println("El '" + arroba + "' si se encuentra en la cadena");
                        } else {
                            System.out.println("El '" + arroba + "' no se encuentra en la cadena");
                        }
                    } else {
                        System.out.println("No se ha ingresado ninguna cadena");
                    }
                    break;
                case 4:
                    condicion = false;
                    break;
                case 5:
                    cantidad = cadena.length();
                    System.out.println("Cantidad de caracteres: " + cantidad);
                    break;
                case 6:
                    subcantidad = subCad.length();
                    System.out.println("Cantidad de subcaracteres: " + subcantidad);
                default:
                    System.out.println("Error, Ingresa un valor valido");
            }
            if (!condicion) {
                break;
            }
        }
    }

}