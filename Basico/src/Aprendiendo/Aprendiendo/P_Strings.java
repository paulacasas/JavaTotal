package Aprendiendo.Aprendiendo;

public class P_Strings {
    public static void main(String[] args) {
        // Longitud del string
        String name = "Paula Casas";
        System.out.println("Longitud: " + name.length()); // Contar caracteres

        // Almacenar el valor en una variable
        int longitud = name.length();
        System.out.println("Longitud: " + longitud);

        // Posición de un carácter
        int pos = name.indexOf("po");
        System.out.println("Posición: " + pos); // Si el valor no esta en la cadena da resultado -1

        pos = name.indexOf('a');
        System.out.println("Primera ocurrencia de la \"a\": " + pos);
        // Segunda ocuurencia de a
        int posi = name.indexOf('a', pos + 1);
        System.out.println("Segunda ocurrencia de la \"a\": " + posi); // Se cuenta desde 0

        // Crear una sub cadena (desde determinada posición)
        String subName = name.substring(6);
        System.out.println("SubCadena: " + subName);

        String SubName2 = name.substring(3, 8); // Cuenta desde 0 y luego llega hasta n-1
        System.out.println("SubCadena: " + SubName2);

        // Convertir un número entero a una cadena
        int valor = 10;
        System.out.println("Entero: " + valor);
        String str = String.valueOf(valor);
        System.out.println("Entero convertido a cadena: " + str);

        // Convertir cadena a entero
        str = "  12 ";
        String str1 = str.trim();
        System.out.println("Convertir str a int: " + str1);
        str = "  12 ";
        int numero = Integer.parseInt(str.trim());
        System.out.println("Cadena con espacios a entero: " + numero);

        // Ver si una cadena comienza por cierto caracter
        String txt = "El primer programa";
        System.out.println("\n" + txt);
        System.out.println("comienza por \"La\": " + txt.startsWith("La"));

        // Ver si una cadena finaliza por cierto caracter
        System.out.println("termina por \"programa\": " + txt.endsWith("programa"));

        // Comparación (alfabeticamente)
        String apellido = "Casas";
        System.out.println("Orden alfabético " + apellido.compareTo("Sanchez"));// Número negativo si el string es menor
                                                                                // que el string dado
        System.out.println("Orden alfabético " + apellido.compareTo("Casas")); // Cero si son iguales
        System.out.println("Orden alfabético " + apellido.compareTo("Avila")); // Mayor que cero si el string es mayor
                                                                               // que el string dado
    }
}
