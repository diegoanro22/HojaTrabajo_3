/*Universidad del Valle de Guatemala 
 *Genser Andree - 23401
 *Diego Rosales - 23258
*/

public class GnomeSort<T extends Comparable<T>> implements iSort<T> {

    public T[] sort(T[] array) {
        int index = 0;

        //Algoritmo para ordenar la lista en orden de menor a mayor Gnome Sort
        while (index < array.length) {
            if (index == 0 || array[index - 1].compareTo(array[index]) <= 0) {
                index++;
            } else {
                T temp = array[index - 1];
                array[index - 1] = array[index];
                array[index] = temp;
                index--;
            }
        }

        return array;
    }
}
