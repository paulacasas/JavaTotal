package Aprendiendo.Ejercicios.Matrices;

public class H_Determinante {
    public static double Resultado(double[][] matriz) {
        double n1 = 0, n2 = 0, n3 = 0;

        n1 = (matriz[1][1] * matriz[2][2]) - (matriz[1][2] * matriz[2][1]);
        n2 = (matriz[1][0] * matriz[2][2]) - (matriz[1][2] * matriz[2][0]);
        n3 = (matriz[1][0] * matriz[2][1]) - (matriz[1][1] * matriz[2][0]);

        n1 = n1 * matriz[0][0];
        n2 = n2 * matriz[0][1];
        n3 = n3 * matriz[0][2];

        // Formula
        double result = n1 - n2 + n3;

        System.out.println("El resultado es : " + result);
        return result;
    }

    public static double[][] replaceColumn(double[][] matrix, double[] column, int columnIndex) {
        // Reemplaza una columna en la matriz con una nueva columna
        double[][] newMatrix = new double[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            newMatrix[i] = matrix[i].clone();
            newMatrix[i][columnIndex] = column[i];
        }
        return newMatrix;
    }

    public static void Cramer(double[][] matriz, double D) {
        double[] contant = { matriz[0][3], matriz[1][3], matriz[2][3] };
        if (D != 0) {
            double Dx = Resultado(replaceColumn(matriz, contant, 0));
            double Dy = Resultado(replaceColumn(matriz, contant, 1));
            double Dz = Resultado(replaceColumn(matriz, contant, 2));

            double x = Dx / D;
            double y = Dy / D;
            double z = Dz / D;

            System.out.println("Las soluciones son: x = " + x + ", y = " + y + ", z = " + z);
        } else {
            System.out.println("El sistema no tiene una solución única.");
        }
    }
}
