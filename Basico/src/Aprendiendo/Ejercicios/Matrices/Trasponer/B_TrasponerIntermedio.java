package Aprendiendo.Ejercicios.Matrices.Trasponer;

public class B_TrasponerIntermedio {
    public static void main(String[] args) {
        int[][] original = new int[5][9];
        int[][] transpuesta = new int[9][5];

        for (int i = 0; i < 5; i++) {
            for (int ii = 0; ii < 9; ii++) {
                original[i][ii] = (int) (Math.random() * 10);
            }
        }
        System.out.println("Matriz original: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("[");
            for (int ii = 0; ii < 9; ii++) {
                System.out.print(original[i][ii]);
                if (ii < (9 - 1)) {
                    System.out.print(" ");
                }
            }
            System.out.println("]");
        }

        // Matriz transpuesta
        for (int i = 0; i < 5; i++) {
            for (int ii = 0; ii < 9; ii++) {
                transpuesta[ii][i] = original[i][ii]; // Cambiamos los valores
            }
        }

        System.out.println("Matriz traspuesta: ");
        for (int i = 0; i < 9; i++) {
            System.out.print("[");
            for (int ii = 0; ii < 5; ii++) {
                System.out.print(transpuesta[i][ii]);
                if (ii < (5 - 1)) {
                    System.out.print(" ");
                }
            }
            System.out.println("]");
        }
    }
}
