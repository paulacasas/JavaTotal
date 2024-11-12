package Aprendiendo.Aprendiendo;

public class E_IncrementoDecremento {
    public static void main(String[] args) {
        int x = 5;

        x += 2;
        x++; // Equivale a x + 1

        // Decremento
        x--; // Equivale a x - 1

        int a = 5, b;

        // Prefijo ++variable
        // Sufijo variable++

        b = ++a; // Primero el ++ para que se aumente el valor de a y después de agrega a b
        a = --b; // Decremento, se le resta 1 para cada variable
        System.out.println(b);
        System.out.println(a);
    }
}
