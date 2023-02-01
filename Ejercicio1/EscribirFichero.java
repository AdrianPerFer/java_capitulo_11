package Ejercicio1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {
    public static boolean esPrimo (int x) {
        for (int i = 2; i < x; i++) {
            if ((x % i) == 0) {
                return false;
            }
        }
        return true;
    }
    
    public void escribir() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));
            for (int i = 1; i <= 500; i++) {
                if (esPrimo(i)) {
                    bw.write(String.valueOf(i) + "\n");
                }
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("El fichero tiene problemas o no existe");
        }
    }
} 