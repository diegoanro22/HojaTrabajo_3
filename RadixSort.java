import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadixSort<T extends Comparable<T>> implements iSort<T> {

    public T[] sort(T[] array) {
        if (array == null || array.length == 0) {
            return array;
        }

        // Encuentra el elemento con el valor máximo para determinar el número de dígitos
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }

        // Realiza el Radix Sort para cada posición del dígito
        for (int exp = 1; getMaxValue(max) / exp > 0; exp *= 10) {
            array = countingSort(array, exp);
        }

        return array;
    }

    /**
     * @param max
     * @return
     */
    private int getMaxValue(T max) {
        return (Integer) max;
    }


    /**
     * @param array
     * @param exp
     * @return
     */
    private T[] countingSort(T[] array, int exp) {
        int n = array.length;

        // Utiliza un ArrayList temporal para almacenar el resultado
        List<T> output = new ArrayList<>(Arrays.asList(array));

        int[] count = new int[10];

        // Inicializa el arreglo de conteo
        for (int i = 0; i < 10; i++) {
            count[i] = 0;
        }

        // Almacena la cuenta de ocurrencias en count[]
        for (int i = 0; i < n; i++) {
            count[(getMaxValue(array[i]) / exp) % 10]++;
        }

        // Modifica count[i] para contener la posición real de este dígito en output[]
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Construye el arreglo de salida
        for (int i = n - 1; i >= 0; i--) {
            output.set(count[(getMaxValue(array[i]) / exp) % 10] - 1, array[i]);
            count[(getMaxValue(array[i]) / exp) % 10]--;
        }

        // Convierte el ArrayList a un arreglo y lo devuelve
        return output.toArray(Arrays.copyOf(array, n));
    }
}
