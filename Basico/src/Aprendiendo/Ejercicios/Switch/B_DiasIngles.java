package Aprendiendo.Ejercicios.Switch;

import java.util.Scanner;

public class B_DiasIngles {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);

        System.out.print("Ingrese un día de la semana: ");
        String dia = datos.next();
        dia = dia.toLowerCase();
        switch (dia) {
            case "lunes":
                System.out.println("Monday");
                break;
            case "martes":
                System.out.println("Tuesday");
                break;
            case "miercoles":
                System.out.println("Wednesday");
                break;
            case "jueves":
                System.out.println("Thursday");
                break;
            case "viernes":
                System.out.println("Friday");
                break;
            case "sabado":
                System.out.println("Saturday");
                break;
            case "domingo":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Dia de la semana incorrecto");
                break;
        }
    }
}
