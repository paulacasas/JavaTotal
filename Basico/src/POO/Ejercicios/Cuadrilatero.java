//package POO.Ejercicios;

import java.util.Scanner;

public class Cuadrilatero {
    private float lado1;
    private float lado2;

    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Cuadrilatero(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }

    public float getPerimetro() {
        float perimetro = 2 * (lado1 + lado2);
        return perimetro;
    }

    public float getArea() {
        float area = lado1 * lado2;
        return area;
    }

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        Cuadrilatero c1;
        float lado1;
        float lado2;

        System.out.print("Ingrese el lado 1 del cuadrilátero: ");
        lado1 = datos.nextFloat();

        System.out.print("Ingrese el lado 2 del cuadrilátero: ");
        lado2 = datos.nextFloat();

        if (lado1 == lado2) {
            c1 = new Cuadrilatero(lado1);
        } else {
            c1 = new Cuadrilatero(lado1, lado2);
        }

        System.out.println("El área del cuadrilátero es: " + c1.getArea());
        System.out.println("El perímetro del cuadrilátero es: " + c1.getPerimetro());
        datos.close();
    }

}