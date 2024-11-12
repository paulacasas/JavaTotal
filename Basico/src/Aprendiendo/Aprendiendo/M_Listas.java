package Aprendiendo.Aprendiendo;

import java.util.ArrayList;
import java.util.List;

public class M_Listas {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(8);
        numeros.add(23);
        numeros.add(18);
        numeros.add(25);

        System.out.println(numeros);

        List<String> palabras = new ArrayList<String>();
        palabras.add("Gacela");
        palabras.add("Elefante");
        palabras.add("Jaguar");

        System.out.println(palabras);
    }
}
