import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
 * contenidas en un fichero de texto. El nombre del fichero que contiene las
 * palabras se debe pasar como argumento en la línea de comandos. El nombre
 * del fichero resultado debe ser el mismo que el original añadiendo la coletilla
 * sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una
 * línea.
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Introduce un argumento");
            return;
        }
        String nombreArchivo = args[0];
        ArrayList<String> palabras = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea = br.readLine();
            while (linea != null) {
                palabras.add(linea);
                linea = br.readLine();
            }
            if (br != null) {
                br.close();
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            return;
        }

        Collections.sort(palabras);
        int longitud = args[0].length();
        String principio = args[0].substring(0, longitud - 4);
        String fin = args[0].substring(longitud - 4, longitud);
        String nombreArchivoSalida =  principio + "_sort" + fin;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivoSalida))) {
            for (String palabra : palabras) {
                bw.write(palabra + "\n");
            }
            if (bw != null) {
                bw.close();
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
            return;
        }
    
        System.out.println("El archivo se ordenó correctamente y se guardó como " + nombreArchivoSalida);
    }
}
    