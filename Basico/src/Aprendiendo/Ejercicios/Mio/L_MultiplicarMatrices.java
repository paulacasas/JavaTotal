package Aprendiendo.Ejercicios.Mio;

import java.util.Scanner;

public class L_MultiplicarMatrices {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        Scanner datosS = new Scanner(System.in);
        boolean condition = true;
        System.out.println("Multiplicación de matrices");
        String menu;
        int op;

        // Matrices
        int[][] matrizA;
        int[][] matrizB;
        int[][] matrizR; // Resultado

        while (condition) {
            System.out.print("\n1. Multiplicar 2 matices \n2. Multiplicar 3 matrices \n3. Salir \n>> "); // 3.
                                                                                                         // Multiplicar
                                                                                                         // 4 matrices
            menu = datosS.nextLine();

            try {
                // nombre variable Integer.parseInt(nombre de variable.trim());
                op = Integer.parseInt(menu.trim());
            } catch (NumberFormatException e) {
                System.out.println("Error, ingresaste un caracter invalido");
                continue;
            }

            switch (op) {
                case 1:
                    System.out.println("Matriz 1");
                    System.out.print("Ingrese la dimención de la fila: ");
                    int f1 = datos.nextInt();
                    System.out.print("Ingrese la dimención de la columna: ");
                    int c1 = datos.nextInt();
                    matrizA = new int[f1][c1];

                    for (int i = 0; i < f1; i++) {
                        for (int ii = 0; ii < c1; ii++) {
                            System.out.print("Posición: [" + i + "][" + ii + "]: ");
                            matrizA[i][ii] = datos.nextInt();
                            /* matrizA[i][ii] = (int) (Math.random()*9); */
                        }
                    }

                    System.out.println("Matriz 2");
                    System.out.print("Ingrese la dimención de la fila: ");
                    int f2 = datos.nextInt();
                    System.out.print("Ingrese la dimención de la columna: ");
                    int c2 = datos.nextInt();
                    matrizB = new int[f2][c2];

                    for (int i = 0; i < f2; i++) {
                        for (int ii = 0; ii < c2; ii++) {
                            System.out.print("Posición: [" + i + "][" + ii + "]: ");
                            matrizB[i][ii] = datos.nextInt();
                            /* matrizb[i][ii] = (int) (math.random()*9); */
                        }
                    }
                    if (c1 != f2) {
                        System.out.println("No puedes realizar la multiplicación");
                        break;
                    }

                    System.out.println("Matriz A");
                    for (int i = 0; i < f1; i++) {
                        System.out.print("[");
                        for (int ii = 0; ii < c1; ii++) {
                            String matrizAcopy = String.format("%2s", matrizA[i][ii]);
                            System.out.print(matrizAcopy);
                            if (ii < (c1 - 1)) {
                                System.out.print(" ");
                            }
                        }
                        System.out.println("]");
                    }

                    System.out.println("Matriz B");
                    for (int i = 0; i < f2; i++) {
                        System.out.print("[");
                        for (int ii = 0; ii < c2; ii++) {
                            String matrizBcopy = String.format("%2s", matrizB[i][ii]);
                            System.out.print(matrizBcopy);
                            if (ii < (c2 - 1)) {
                                System.out.print(" ");
                            }
                        }
                        System.out.println("]");
                    }

                    matrizR = new int[f1][c2]; // La primera fila de la primera matriz y la primera columna de la
                                               // segunda matriz

                    for (int i = 0; i < f1; i++) {
                        for (int ii = 0; ii < c2; ii++) {
                            for (int iii = 0; iii < matrizA[0].length; iii++) {
                                // ??
                                matrizR[i][ii] += matrizA[i][iii] * matrizB[iii][ii];
                            }
                        }
                    }

                    // Imprimir la matriz resultante
                    System.out.println("La multiplicación de las matrices A y B es:");
                    for (int i = 0; i < f1; i++) { // matrizR.length
                        System.out.print("[");
                        for (int ii = 0; ii < c2; ii++) { // matrizR[0].length
                            String matrizRcopy = String.format("%3s", matrizR[i][ii]);
                            System.out.print(matrizRcopy);
                            if (ii < (c2 - 1)) {
                                System.out.print(" ");
                            }

                        }
                        System.out.println("]");
                    }
                    ////
                    System.out.print("Desea evaluar la matriz de forma B*A");
                    System.out.print("\n1. Si \n2. No \n>> ");
                    int BA = datos.nextInt();
                    if (BA == 1) {
                        if (c2 != f1) { // f2 != c2
                            System.out.println("No puedes realizar la multiplicación");
                            break;
                        }
                        int[][] matrizBA = new int[f2][c1]; // La primera fila de la primera matriz y la primera columna
                                                            // de la segunda matriz
                        // pq utiliza las dimenciones d la matriz b y luego la a

                        for (int i = 0; i < f2; i++) { // matrizB.length
                            for (int ii = 0; ii < matrizA[0].length; ii++) { // N columna 1 fila
                                for (int iii = 0; iii < matrizA.length; iii++) {
                                    matrizBA[i][ii] += matrizB[i][iii] * matrizA[iii][ii];
                                }
                            }
                        }
                        /*
                         * for (int i = 0; i < f2; i++) {
                         * for (int ii = 0; ii < c1; ii++) {
                         * for (int iii = 0; iii < f1; iii++) {
                         * // ??
                         * matrizBA[i][ii] += matrizB[i][iii] * matrizA[iii][ii];
                         * }
                         * }
                         * }
                         */

                        System.out.println("Matriz B");
                        for (int i = 0; i < f2; i++) {
                            System.out.print("[");
                            for (int ii = 0; ii < c2; ii++) {
                                String matrizBcopy = String.format("%2s", matrizB[i][ii]);
                                System.out.print(matrizBcopy);
                                if (ii < (c2 - 1)) {
                                    System.out.print(" ");
                                }
                            }
                            System.out.println("]");
                        }

                        System.out.println("Matriz A");
                        for (int i = 0; i < f1; i++) {
                            System.out.print("[");
                            for (int ii = 0; ii < c1; ii++) {
                                String matrizAcopy = String.format("%2s", matrizA[i][ii]);
                                System.out.print(matrizAcopy);
                                if (ii < (c1 - 1)) {
                                    System.out.print(" ");
                                }
                            }
                            System.out.println("]");
                        }

                        // Imprimir la matriz resultante
                        System.out.println("La multiplicación de las matrices B y A es:");
                        for (int i = 0; i < f2; i++) { // matrizR.length
                            System.out.print("[");
                            for (int ii = 0; ii < c1; ii++) { // matrizR[0].length
                                String matrizBAcopy = String.format("%3s", matrizBA[i][ii]);
                                System.out.print(matrizBAcopy);
                                if (ii < (c1 - 1)) {
                                    System.out.print(" ");
                                }
                            }
                            System.out.println("]");
                        }
                    }

                    break;
                case 2:
                    System.out.println("Matriz 1");
                    System.out.print("Ingrese la dimención de la fila: ");
                    f1 = datos.nextInt();
                    System.out.print("Ingrese la dimención de la columna: ");
                    c1 = datos.nextInt();
                    matrizA = new int[f1][c1];

                    for (int i = 0; i < f1; i++) {
                        for (int ii = 0; ii < c1; ii++) {
                            /*
                             * System.out.print("Posición: ["+i+"]["+ii+"]: ");
                             * matrizA[i][ii] = datos.nextInt();
                             */
                            matrizA[i][ii] = (int) (Math.random() * 9); // datos.nextInt();

                        }
                    }

                    System.out.println("Matriz 2");
                    System.out.print("Ingrese la dimención de la fila: ");
                    f2 = datos.nextInt();
                    System.out.print("Ingrese la dimención de la columna: ");
                    c2 = datos.nextInt();
                    matrizB = new int[f2][c2];

                    for (int i = 0; i < f2; i++) {
                        for (int ii = 0; ii < c2; ii++) {
                            /*
                             * System.out.print("Posición: ["+i+"]["+ii+"]: ");
                             * matrizB[i][ii] = datos.nextInt();
                             */
                            matrizB[i][ii] = (int) (Math.random() * 9); // datos.nextInt();

                        }
                    }

                    System.out.println("Matriz 3");
                    System.out.print("Ingrese la dimención de la fila: ");
                    int f3 = datos.nextInt();
                    System.out.print("Ingrese la dimención de la columna: ");
                    int c3 = datos.nextInt();
                    int[][] matrizC = new int[f3][c3];

                    for (int i = 0; i < f3; i++) {
                        for (int ii = 0; ii < c3; ii++) {
                            /*
                             * System.out.print("Posición: ["+i+"]["+ii+"]: ");
                             * matrizC[i][ii] = datos.nextInt();
                             */
                            matrizC[i][ii] = (int) (Math.random() * 9); // datos.nextInt();
                        }
                    }
                    // Condición
                    if (c1 == f2) {
                        if (f3 == c1) {
                            System.out.println("Si puedes realizar la multiplicación");
                        }
                    } else {
                        System.out.println("No puedes realizar la multiplicación");
                        break;
                    }

                    // Mostrar matrices
                    System.out.println("Matriz A");
                    for (int i = 0; i < f1; i++) {
                        System.out.print("[");
                        for (int ii = 0; ii < c1; ii++) {
                            String matrizAcopy = String.format("%2s", matrizA[i][ii]);
                            System.out.print(matrizAcopy);
                            if (ii < (c1 - 1)) {
                                System.out.print(" ");
                            }
                        }
                        System.out.println("]");
                    }

                    System.out.println("Matriz B");
                    for (int i = 0; i < f2; i++) {
                        System.out.print("[");
                        for (int ii = 0; ii < c2; ii++) {
                            String matrizBcopy = String.format("%2s", matrizB[i][ii]);
                            System.out.print(matrizBcopy);
                            if (ii < (c2 - 1)) {
                                System.out.print(" ");
                            }
                        }
                        System.out.println("]");
                    }

                    // Resultado de A*B
                    matrizR = new int[f1][c2];

                    for (int i = 0; i < f1; i++) {
                        for (int ii = 0; ii < c2; ii++) {
                            for (int iii = 0; iii < matrizA[0].length; iii++) {
                                // ??
                                matrizR[i][ii] += matrizA[i][iii] * matrizB[iii][ii];
                            }
                        }
                    }

                    System.out.println("Matriz (A*B)");
                    for (int i = 0; i < f1; i++) {
                        System.out.print("[");
                        for (int ii = 0; ii < c2; ii++) {
                            String matrizRcopy = String.format("%2s", matrizR[i][ii]);
                            System.out.print(matrizRcopy);
                            if (ii < (c2 - 1)) {
                                System.out.print(" ");
                            }
                        }
                        System.out.println("]");
                    }

                    System.out.println("Matriz C");
                    for (int i = 0; i < f3; i++) {
                        System.out.print("[");
                        for (int ii = 0; ii < c3; ii++) {
                            String matrizCcopy = String.format("%2s", matrizC[i][ii]);
                            System.out.print(matrizCcopy);
                            if (ii < (c3 - 1)) {
                                System.out.print(" ");
                            }
                        }
                        System.out.println("]");
                    }

                    // Resultado final
                    int[][] matrizF = new int[f1][c3];
                    for (int i = 0; i < f1; i++) {
                        for (int ii = 0; ii < c3; ii++) {
                            for (int iii = 0; iii < matrizC[0].length; iii++) {
                                // ??
                                matrizF[i][ii] += matrizR[i][iii] * matrizC[iii][ii];
                            }
                        }
                    }

                    // Imprimir la matriz resultante
                    System.out.println("La multiplicación de las matrices (A*B) y C es:");
                    for (int i = 0; i < f1; i++) { // matrizR.length
                        System.out.print("[");
                        for (int ii = 0; ii < c3; ii++) { // matrizR[0].length
                            String matrizFcopy = String.format("%4s", matrizF[i][ii]);
                            System.out.print(matrizFcopy);
                            if (ii < (c2 - 1)) {
                                System.out.print(" ");
                            }
                        }
                        System.out.println("]");
                    }
                    break;
                case 3:
                    condition = false;
                    break;
            } // Switch
            if (!condition) {
                break;
            }
        } // While
    }
}
