/*Universidad del Valle de Guatemala 
 *Genser Andree - 23401
 *Diego Rosales - 23258
*/

//Ordenamiento de listas Merge Sort 

import java.util.Arrays; 

public class MergeSort<T extends Comparable<T>> implements iSort<T> {

    public T[] sort(T[] array) {
        if (array.length <= 1) {
            return array; 
        }

        int medio = array.length / 2;

        // Dividir el array en dos partes
        T[] mitadIzquierda = Arrays.copyOfRange(array, 0, medio);
        T[] mitadDerecha = Arrays.copyOfRange(array, medio, array.length);

        mitadIzquierda = sort(mitadIzquierda);
        mitadDerecha = sort(mitadDerecha);

        // Juntar las dos partes separadas en una 
        merge(array, mitadIzquierda, mitadDerecha);

        return array;
    }

    /**Metodo para ordenar las 2 listas del array
     * @param array
     * @param mitadIzquierda
     * @param mitadDerecha
     */
    private void merge(T[] array, T[] mitadIzquierda, T[] mitadDerecha) {
        int i = 0, j = 0, k = 0;

        while (i < mitadIzquierda.length && j < mitadDerecha.length) {
            if (mitadIzquierda[i].compareTo(mitadDerecha[j]) <= 0) {
                array[k++] = mitadIzquierda[i++];
            } else {
                array[k++] = mitadDerecha[j++];
            }
        }
    }
}


