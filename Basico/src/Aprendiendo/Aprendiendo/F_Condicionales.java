package Aprendiendo.Aprendiendo;

public class F_Condicionales {
    public static void main(String[] args) {
        int edad = 15;

        if (edad > 15) { // Una sola condición, si no se cumple se sale
            System.out.println("Eres mayor de 15 años");
        }

        edad = 20;

        if (edad > 18) { // Una condición
            System.out.println("Eres mayor de edad");
        } else { // Caso contrario, si no se cumple la anterior se ejecuta esta
            System.out.println("Eres menor de edad");
        }

        edad = 18;
        if (edad >= 18) { // Primera condición
            System.out.println("Eres mayor de edad");
        } else if (edad >= 12) { // Segunda condición
            System.out.println("Eres adolescente");
        } else { // Caso contrario, si no se cumple ninguna de las anteriores
            System.out.println("Eres un niño");
        }
    }
}
