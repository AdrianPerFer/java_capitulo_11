package PEjercicio1;

/**
 * Escribe un programa que guarde en un fichero con nombre
 * primos.dat los números primos que hay entre 1 y 500
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        Primos fichero = new Primos();
        fichero.Escribir();
        /*Boolean esPrimo;
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("./PEjercicio1/primos.dat"));
            for (int i = 2; i <= 500; i++) {
                esPrimo = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) {
                    // String.valueOF(i) convierte el número a una cadena, permitiendo
                    // su escritura en un archivo o en la consola.
                    bw.write(String.valueOf(i) + "\n");
                }
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
