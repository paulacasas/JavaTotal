package Aprendiendo.Metodos;

public class A_Aleatorio {
    public static void main(String[] args) {
        int aleatorio;
        // Math.random() -> Genera un número aleatorio entre 0 y 1
        aleatorio = (int) (Math.random() * 20); // Multiplicar por el número maximo del rango
        System.out.println(aleatorio);

        // Mostrar un número aleatorio entre un rango de (25 a 50)
        int aleatorio2;
        aleatorio2 = (int) (Math.random() * (50 - 25 + 1) + 25); // N mayor - N menor + 1 + N menor
        System.out.println(aleatorio2);
    }
}
