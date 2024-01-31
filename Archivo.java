/*Universidad del Valle de Guatemala 
 *Genser Andree - 23401
 *Diego Rosales - 23258
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


//Clase para leer el archivo
public class Archivo {
    private File archivo;

    public Archivo(){
        archivo = new File("Archivo.txt");
    }

    public Integer[] leerArchivo() throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        FileReader fileReader = new FileReader(archivo);
        BufferedReader lector = new BufferedReader(fileReader);

        String linea;
        while ((linea = lector.readLine()) != null) {
            String[] elementos = linea.split("\\s+");
            for (String elemento : elementos) {
                if (elemento.matches("[0-9]+")) { // Verifica que el elemento es un número
                    int numero = Integer.parseInt(elemento);
                    list.add(numero);
                }
            }
        }
        lector.close();
        Integer[] array = list.toArray(new Integer[0]);
        return array;
    
    }



}
