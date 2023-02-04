package PEjercicio2;

/**
 * Realiza un programa que lea el fichero creado en el
 * ejercicio anterior y que muestre los números por pantalla.
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        Leer archivoLeido = new Leer();
        archivoLeido.leyendo();
        /*
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
        }*/
    }
}
