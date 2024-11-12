package Aprendiendo.Ejercicios.Matrices;

public class E_MatrizMarco {
    public static void main(String[] args) {

        int[][] matriz = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int ii = 0; ii < 5; ii++) {
                if (i == 0 || i == 4) { // El inicio de las filas se rellena de 1 y el final
                    matriz[i][ii] = 1;
                } else if (ii == 0 || ii == 4) { // El inicio de las columnas se rellena de 1 y el final
                    matriz[i][ii] = 1;
                } // El caso contrario no es necesario ya que la matriz esta rellena de 0
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("[");
            for (int ii = 0; ii < 5; ii++) {
                System.out.print(matriz[i][ii]);
                if (ii < (5 - 1)) {
                    System.out.print(" ");
                }
            }
            System.out.println("]");
        }
        /*
         * Mostrar una matriz con la libreria arrays y quitar las comas
         * for (int i = 0; i < 5; i++) {
         * System.out.println(Arrays.toString(matriz[i]).replace(", ", " "));
         * }
         */
    }
}
