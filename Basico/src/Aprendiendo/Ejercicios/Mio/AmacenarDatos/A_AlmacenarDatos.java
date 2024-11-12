package Aprendiendo.Ejercicios.Mio.AmacenarDatos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class A_AlmacenarDatos {
    public static void main(String[] args) {
        Scanner datosS = new Scanner(System.in);

        String[][] matriz = new String[3][2];

        boolean condition = true;
        String menu, nombreDocumento = null;
        int op;

        while (condition) {
            System.out.println("\n1.Rellenar la matriz \n2. Crear Documento \n3. Mostrar Documento \n4. Salir");
            System.out.print(">> ");
            menu = datosS.nextLine();

            try {
                op = Integer.parseInt(menu.trim());
            } catch (NumberFormatException e) {
                System.out.println("Error, Ingresa un valor valido");
                continue;
            }

            switch (op) {
                case 1:
                    // Rellenar la matriz
                    for (int i = 0; i < 3; i++) {
                        System.out.println("persona N " + i);
                        for (int ii = 0; ii < 2; ii++) {
                            if (ii == 0) {
                                System.out.print("Nombre: ");
                            }
                            if (ii == 1) {
                                System.out.print("Edad: ");
                            }
                            matriz[i][ii] = datosS.nextLine();
                        }
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el nombre de la carpeta: ");
                    nombreDocumento = datosS.nextLine();

                    CrearArchivo(nombreDocumento, matriz);
                    break;
                /*
                 * try(BufferedWriter bw = new BufferedWriter(new FileWriter(nombreDocumento)))
                 * {
                 * for (String[] fila : matriz) {
                 * bw.write(fila[0] + ", " + fila[1]);
                 * bw.newLine();
                 * }
                 * System.out.println("Carpeta creada exitosamente");
                 * }catch (IOException e) {
                 * e.printStackTrace();
                 * }
                 * break;
                 */
                case 3:
                    MostrarArchivo(nombreDocumento);
                    /*
                     * try {
                     * Files.lines(Paths.get(nombreDocumento)).forEach(System.out::println);
                     * } catch (IOException e) {
                     * e.printStackTrace();
                     * }
                     * break;
                     */
                    break;
                case 4:
                    condition = false;
                    break;
                default:
                    System.out.println("Ingresa un número valido");
            } // Fn switch
            if (!condition) {
                break;
            }
        } // While
    }

    public static void CrearArchivo(String nombreDocumento, String[][] datos) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreDocumento))) {
            for (String[] fila : datos) {
                bw.write(fila[0] + ", " + fila[1]);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void MostrarArchivo(String nombreArchivo) {
        try {
            Files.lines(Paths.get(nombreArchivo)).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
