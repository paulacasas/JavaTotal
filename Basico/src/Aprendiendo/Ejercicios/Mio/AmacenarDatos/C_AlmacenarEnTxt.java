package Aprendiendo.Ejercicios.Mio.AmacenarDatos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class C_AlmacenarEnTxt {
    public static void main(String[] args) {

        String[][] usuarios = {
                { "Usuario1", "30" },
                { "Usuario2", "25" },
                { "Usuario3", "35" }
        };
        crearArchivo("usuarios.txt", usuarios);
        mostrarArchivo("usuarios.txt");
    }

    public static void crearArchivo(String nombreArchivo, String[][] datos) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (String[] fila : datos) {
                bw.write(fila[0] + ", " + fila[1]);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void mostrarArchivo(String nombreArchivo) {
        try {
            Files.lines(Paths.get(nombreArchivo)).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
