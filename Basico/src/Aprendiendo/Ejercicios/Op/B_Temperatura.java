package Aprendiendo.Ejercicios.Op;

import java.util.Scanner;

public class B_Temperatura {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        double farenheit, celsius, kelvin, rankine;
        System.out.print("Ingrese la temperatura en Fahrenheit: "); // Temperatura en grados Fahrenheit
        farenheit = datos.nextDouble();

        celsius = (farenheit - 32) * (5 / 9D); // Convertir a Celsius la temperatura Fahrenheit se le resta 32 y se
                                               // multiplica por 5/9
        kelvin = celsius + 273; // Convertir a Kelvin, se le suma 273 a los grados Celsius
        rankine = farenheit + 460; // Convertir a Rankine a los grados Fahrenheit se le suma 460

        System.out.println("Temperatura en Fahrenheit: " + farenheit);
        System.out.println("Temperatura en Celsius: " + celsius);
        System.out.println("Temperatura en Kelvin: " + kelvin);
        System.out.println("Temperatura en Rankine: " + rankine);
    }
}
