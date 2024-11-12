package Aprendiendo.Ejercicios.Mio.AmacenarDatos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class B_AlmacenarAvanzado {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        Scanner datosS = new Scanner(System.in);

        String[][] matriz = new String[100][3];
        int contador = 0, contadorD = 0;
        String nombreDocumento;
        boolean condition = true;

        while (condition) {
            System.out.print("1. Rellenar y crear matriz \n2. Mostrar archivo \n3. Salir \n>>> ");
            int op = datos.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Rellenando la matriz...");
                    for (int i = contador; contador < 100; i++) {
                        for (int ii = 0; ii < 3; ii++) {
                            if (ii == 0) {
                                System.out.print("Nombre: ");
                            }
                            if (ii == 1) {
                                System.out.print("Edad: ");
                            }
                            if (ii == 2) {
                                System.out.print("Documento: ");
                            }
                            matriz[i][ii] = datosS.nextLine();
                        }
                        contador++;
                        System.out.println("¿Desea seguir agregando datos?");
                        System.out.print("1. Si \n2. No \n>> ");
                        int continuar = datos.nextInt();
                        contadorD++;

                        if (continuar == 2) {
                            break;
                        }
                    }

                    System.out.print("Ingresa el nombre del archivo: ");
                    nombreDocumento = datosS.nextLine();

                    CrearArchivo(nombreDocumento, matriz, contadorD);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del archivo a mostrar: ");
                    String nBuscar = datosS.nextLine();
                    MostrarArchivo(nBuscar);
                    break;
                case 3:
                    condition = false;
                    break;
            }
            if (!condition) {
                break;
            }
        }
    }

    public static void MostrarArchivo(String nombreArchivo) {
        try {
            Files.lines(Paths.get(nombreArchivo)).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Ocurrió un error al abrir el archivo: " + e.getMessage());
        }
    }

    public static void CrearArchivo(String nombreArchivo, String[][] matriz, int contadorD) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo, true))) { // true: agregar datos
            for (int i = 0; i < contadorD; i++) {
                for (int ii = 0; ii < 2; ii++) {
                    bw.write(matriz[i][ii]);
                    if (ii < 1) {
                        bw.write(", ");
                    }
                }
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
        }
    }
}
