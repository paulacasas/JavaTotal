package Aprendiendo.Ejercicios.Vectores;

public class O_SumaVectores {
    public static void main(String[] args) {
        int[] vector1 = { 3, 4, 5, 6 };
        int[] vector2 = { 7, 8, 3, 1 };
        int[] vector3 = new int[4];

        for (int i = 0; i < 4; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }

        for (int i : vector3) {
            System.out.print(i + " ");
        }
    }
}
