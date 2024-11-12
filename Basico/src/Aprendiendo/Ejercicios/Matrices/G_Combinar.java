package Aprendiendo.Ejercicios.Matrices;

import java.util.Scanner;

public class G_Combinar {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        Scanner datosS = new Scanner(System.in);

        int[][] matriz = new int[0][0];
        boolean condition = true;
        String menu;
        int op;

        while (condition) {
            System.out.print(
                    "\n1. Suma de filas y columnas \n2. Suma en x \n3. Suma del marco \n4. Matriz inversa \n5. Salir \n>> ");
            menu = datosS.nextLine();

            try {
                op = Integer.parseInt(menu.trim());
            } catch (NumberFormatException e) {
                System.out.println("Error, Ingresa un valor valido");
                continue;
            }
            switch (op) {
                case 1:
                    System.out.println("Ingrese la dimensión de la matriz");
                    System.out.print("Fila: ");
                    int f = datos.nextInt();
                    System.out.print("Columnas: ");
                    int c = datos.nextInt();

                    matriz = new int[f][c];
                    int[] sf = new int[f];
                    int[] sc = new int[c];

                    for (int i = 0; i < f; i++) {
                        for (int ii = 0; ii < c; ii++) {
                            matriz[i][ii] = (int) (Math.random() * 9);
                        }
                    }

                    for (int i = 0; i < f; i++) {
                        System.out.print("[");
                        for (int ii = 0; ii < c; ii++) {
                            String espacio = String.format("%2s", matriz[i][ii]);
                            System.out.print(espacio);
                            // System.out.print(matriz[i][ii]);
                            sf[i] += matriz[i][ii];
                            if (ii < (c - 1)) {
                                System.out.print(" ");
                            }
                        }
                        System.out.println("] = " + sf[i]);
                    }

                    for (int ii = 0; ii < f; ii++) {
                        for (int i = 0; i < c; i++) {
                            sc[i] += matriz[ii][i];
                        }
                    }

                    System.out.print("[");
                    for (int i = 0; i < c; i++) {
                        String n = String.format("%2s", sc[i]);
                        System.out.print(n);
                        if (i < (c - 1)) {
                            System.out.print(" ");
                        }
                        // System.out.println(sc[i]);
                    }
                    System.out.print("]");
                    break;
                case 2:
                    System.out.println("Ingrese la dimensión de la matriz");
                    System.out.print("Matriz cuadrada:  ");
                    int n = datos.nextInt();
                    matriz = new int[n][n];
                    int sum = 0;
                    int sum1 = 0;
                    int sum2 = 0;

                    for (int i = 0; i < n; i++) {
                        for (int ii = 0; ii < n; ii++) {
                            matriz[i][ii] = (int) (Math.random() * 9);
                        }
                    }
                    // Mostrar
                    for (int i = 0; i < n; i++) {
                        System.out.print("[");
                        for (int ii = 0; ii < n; ii++) {
                            System.out.print(matriz[i][ii]);
                            if (ii < (n - 1)) {
                                System.out.print(" ");
                            }
                        }
                        System.out.println("]");
                    }
                    for (int i = 0; i < n; i++) {
                        sum1 += matriz[i][i];
                        sum2 += matriz[i][(n - 1) - i];
                    }

                    sum = sum1 + sum2;
                    System.out.println("Suma 1: " + sum1);
                    System.out.println("Suma 2: " + sum2);
                    System.out.println("Suma en x: " + sum);
                    break;
                case 3:
                    System.out.println("Ingrese la dimensión de la matriz");
                    System.out.print("Matriz cuadrada:  ");
                    n = datos.nextInt();
                    matriz = new int[n][n];
                    int sm = 0;

                    for (int i = 0; i < n; i++) {
                        for (int ii = 0; ii < n; ii++) {
                            matriz[i][ii] = (int) (Math.random() * 9);
                        }
                    }

                    for (int i = 0; i < n; i++) {
                        for (int ii = 0; ii < n; ii++) {
                            if (i == 0 || i == (n - 1)) {
                                sm += matriz[i][ii];
                            } else if (ii == 0 || ii == (n - 1)) {
                                sm += matriz[i][ii];
                            }
                        }
                    }

                    for (int i = 0; i < n; i++) {
                        System.out.print("[");
                        for (int ii = 0; ii < n; ii++) {
                            System.out.print(matriz[i][ii]);
                            if (ii < (n - 1)) {
                                System.out.print(" ");
                            }
                        }
                        System.out.println("]");
                    }

                    System.out.print("Suma del marco: " + sm);

                    break;
                case 4:
                    System.out.println("Ingrese la dimensión de la matriz");
                    System.out.print("Matriz cuadrada:  ");
                    n = datos.nextInt();
                    matriz = new int[n][n];

                    for (int i = 0; i < n; i++) {
                        for (int ii = 0; ii < n; ii++) {
                            matriz[i][ii] = (int) (Math.random() * 9);
                        }
                    }
                    // Matriz invertida
                    int[][] matrizI = new int[n][n];
                    for (int i = 0; i < n; i++) {
                        for (int ii = 0; ii < n; ii++) {
                            matrizI[i][ii] = matriz[i][(n - 1) - ii];
                        }
                    }

                    System.out.println("Matriz original");
                    for (int i = 0; i < n; i++) {
                        System.out.print("[");
                        for (int ii = 0; ii < n; ii++) {
                            System.out.print(matriz[i][ii]);
                            if (ii < (n - 1)) {
                                System.out.print(" ");
                            }
                        }
                        System.out.println("]");
                    }

                    System.out.println("Matriz invertida");
                    for (int i = 0; i < n; i++) {
                        System.out.print("[");
                        for (int ii = 0; ii < n; ii++) {
                            System.out.print(matrizI[i][ii]);
                            if (ii < (n - 1)) {
                                System.out.print(" ");
                            }
                        }
                        System.out.println("]");
                    }
                    break;
                case 5:
                    condition = false;
            } // Fn switch
            if (!condition) {
                break;
            }
        }
    }
}
