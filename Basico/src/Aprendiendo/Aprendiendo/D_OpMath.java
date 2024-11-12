package Aprendiendo.Aprendiendo;

public class D_OpMath {
    public static void main(String[] args) {
        // Math.sqrt -> raiz cuadrada
        double raiz = Math.sqrt(9); // sqrt funciona con double
        int raizInt = (int) Math.sqrt(9); // convertirlo en un valor entero (para raices exactas)

        System.out.println(raiz);
        System.out.println(raizInt);

        // Elevar un número a una potencia
        double base = 4, exponente = 3;
        // Math.pow -> (base , potencia)
        double resultado = Math.pow(base, exponente);
        int r = (int) Math.pow(base, exponente); // Convertir a un valor entero si es un valor exacto
        System.out.println(resultado);
        System.out.println(r);

        // Redondear un valor
        // Si es mayor que 5 el valor queda aproximado hacia arriba
        // Si es menor a 5 el valor se redondea hacia abajo
        double num = 4.25322; // Para redondear un double
        long resultad = Math.round(num); // Lo convertimos en un long
        System.out.println(resultad);

        float numero = 4.56f; // Para redondear un float
        int result = Math.round(numero); // Lo convetimos en int
        System.out.println(result);

        // Obtener un número aleatorio
        double number = Math.random();
        System.out.println(number);
        // Número aleatorio entre 0 y 100
        int randomNum = (int) (Math.random() * 101);
        System.out.println(randomNum);

        // Encontrar el valor mas grande
        int a = 6, b = 7;
        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, b)); // Encontrar el valor mas pequeño

        // Mostrar el valor absoluto
        float negativo = -6.3f;
        System.out.println(Math.abs(negativo));
    }
}
