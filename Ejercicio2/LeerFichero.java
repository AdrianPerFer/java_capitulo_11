package Ejercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {
    public void leer(){
        String linea = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("primos.dat"));
            linea = br.readLine();
            while (linea !=null) {
                System.out.print(linea + " ");
                linea = br.readLine();
            }
            System.out.println();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
