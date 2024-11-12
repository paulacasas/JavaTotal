package Aprendiendo.Ejercicios.Op_Ternario;

import java.util.Scanner;

public class A_Edad {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int edad;
        String voto, nombre;
        System.out.print("Ingrese su nombre: ");
        nombre = datos.next();

        System.out.print(nombre + " ingrese su edad: ");
        edad = datos.nextInt();
        // Variable = Condición ? "Verdadero" : "Falso";
        voto = edad >= 18 ? "apto para votar" : "no eres apto para votar";

        System.out.println(nombre + " usted es " + voto);
    }
}
