package PEjercicio1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Primos{
    public static boolean esPrimo(int x) {
        Boolean esPrimo = true;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                esPrimo = false;
            }
        }
        return esPrimo;
    }

    public boolean estaFichero(File file) {
        if (!file.exists()) {
            System.out.println("El archivo no existe");
            return false;
        }
        return true;
    }

    public void Escribir(){
        BufferedWriter bw = null;
        File file = new File("./PEjercicio1/primos.dat");
        if (!estaFichero(file)){
            try {
                bw = new BufferedWriter(new FileWriter(file));
                for (int i = 2; i <= 500; i++) {
                    if (esPrimo(i)) {
                        // String.valueOF(i) convierte el número a una cadena, permitiendo
                        // su escritura en un archivo o en la consola.
                        bw.write(String.valueOf(i) + "\n");
                    }
                }
                if(bw!=null) {
                    bw.close(); 
                }
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo: " + e.getMessage());
            }
        } else {
            return;
        }

    }
}
