package PEjercicio2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Leer {
    public void leyendo(){
        String linea = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("./PEjercicio1/primos.dat"));
            linea = br.readLine();
            do {
                System.out.println(linea);
                linea = br.readLine();
            } while (linea != null);
            if (br != null) {
                br.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Fallo en el buffer: " + e.getMessage());
        }
    }
}
