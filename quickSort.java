public class QuickSort<T extends Comparable<T>> implements iSort<T>{

    public T[] sort(T[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    }

    public void quickSort(T[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);

            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    public int partition(T[] arr, int low, int high) {
        T pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                i++;

                // Intercambia arr[i] y arr[j]
                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Intercambia arr[i+1] y el pivote
        T temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
        

    

