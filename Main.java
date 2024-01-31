/*Universidad del Valle de Guatemala 
 *30 enero, 2024
 *Algoritmos y estructura de datos 
 *Genser Andree - 23401
 *Diego Rosales - 23258
*/
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Archivo archivoTxt = new Archivo();
        Scanner teclado = new Scanner(System.in);
        int inicio = 1;

        Integer[] array = null;

        try {
            array = archivoTxt.leerArchivo();
        }catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }

        while (inicio == 1) {
            System.out.println("--------------------------------------");
            System.out.println("Métodos de sort");
            System.out.println("1. Gnome Sort");
            System.out.println("2. Merge Sort");
            System.out.println("3. Quick Sort");
            System.out.println("4. Radix Sort");
            System.out.println("5. Shell Sort");
            System.out.println("6. Terminar programa");
            int menuInicio = Integer.parseInt(teclado.nextLine());
            System.out.println("--------------------------------------");
            
            switch (menuInicio) {
                case 1:
                    GnomeSort<Integer> gnome = new GnomeSort<Integer>();
                    System.out.println(Arrays.toString(gnome.sort(array)));
                    break;
                case 2:
                    MergeSort<Integer> merge = new MergeSort<Integer>();
                    System.out.println(Arrays.toString(merge.sort(array)));
                    break;
                case 3:
                    QuickSort<Integer> qs = new QuickSort<Integer>();
                    System.out.println(Arrays.toString(qs.sort(array)));
                    break;
                case 4:
                    RadixSort<Integer> radixSort = new RadixSort<Integer>();
                    System.out.println(Arrays.toString(radixSort.sort(array)));
                    break;
                case 5:
                    ShellSort<Integer> shell = new ShellSort<Integer>();
                    System.out.println(Arrays.toString(shell.sort(array)));
                    break;
                case 6: 
                    // System.out.println("Gracias por utilizar este programa");
                    inicio = 2;
            
                default:
                    inicio = 2;
                    break;
            }
            
        }


    }
}
