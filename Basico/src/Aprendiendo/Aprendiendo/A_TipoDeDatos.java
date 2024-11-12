package Aprendiendo.Aprendiendo;

public class A_TipoDeDatos {
    public static void main(String[] args) {
        // Creación de una variable
        // Tipo de dato Nombre Variable
        // Tipo de dato Nombre Variable = Valor a asignar;
        // Variable: tipo entero
        byte entero; // Este tipo de dato ocupa 8 bits de memoria
        entero = 12;
        short entera = 12456; // Ocupa 16 bits de memoria
        int num = 18; // Ocupa 32 bits de memoria
        long largo; // Ocupa 64 bits de memoria
        largo = 243454;

        // Mostrar datos
        System.out.println("Numero entero: " + entero);
        System.out.println("Numero entero: " + entera);
        System.out.println("Numero entero: " + num);
        System.out.println("Numero entero: " + largo);

        // Variables: tipo decimal
        double decimal; // Ocupa 64 bits de memoria
        decimal = 3.4245;
        float numero = 1.8f;// Para definir el valor que sea un float se debe colocar "f" al final

        System.out.println("Numero decimal: " + decimal);
        System.out.println("Numero decimal: " + numero);

        // Variable: tipo carácter
        char caracter = 'a'; // Todo lo que encuentres en el teclado es un carácter

        System.out.println("Carácter: " + caracter);

        // Variables: Tipo booleano
        boolean decision = true; // Verdadero
        boolean falso = false; // Falso
        System.out.println("La decisión es: " + decision);
        System.out.println("La decisión es: " + falso);

        // Los datos no primitivos tienen métodos
        Integer number = null;
        String palabra = "Hola que tal?"; // Cadena de texto

        System.out.println("El numero es: " + number);
        System.out.println(palabra);
    }
}
