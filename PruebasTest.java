import static org.junit.Assert.*;
import org.junit.Test;

public class PruebasTest {

    //Test Gnome Sort
    @Test
    public void testGnomeSort() {
        Integer[] array = {4, 2, 7, 1, 9};
        GnomeSort<Integer> gnomeSort = new GnomeSort<>();
        Integer[] sortedArray = gnomeSort.sort(array);
        Integer[] expectedArray = {1, 2, 4, 7, 9};
        assertArrayEquals(expectedArray, sortedArray);
    }

    //Test Quick Sort
    @Test
    public void testQuickSort() {
        Integer[] array = {4, 2, 7, 1, 9};
        QuickSort<Integer> quickSort = new QuickSort<>();
        Integer[] sortedArray = quickSort.sort(array);
        Integer[] expectedArray = {1, 2, 4, 7, 9};
        assertArrayEquals(expectedArray, sortedArray);
    }

    //Test Radix Sort
    @Test
    public void testRadixSort() {
        Integer[] array = {4, 2, 7, 1, 9};
        RadixSort<Integer> radixSort = new RadixSort<>();
        Integer[] sortedArray = radixSort.sort(array);
        Integer[] expectedArray = {1, 2, 4, 7, 9};
        assertArrayEquals(expectedArray, sortedArray);
    }

    //Test Shell Sort
    @Test
    public void testShellSort() {
        Integer[] array = {4, 2, 7, 1, 9};
        ShellSort<Integer> shellSort = new ShellSort<>();
        Integer[] sortedArray = shellSort.sort(array);
        Integer[] expectedArray = {1, 2, 4, 7, 9};
        assertArrayEquals(expectedArray, sortedArray);
    }

    //Test Merge Sort
    @Test
    public void testMergeSort() {
        Integer[] array = {4, 2, 7, 1, 9};
        MergeSort<Integer> mergeSort = new MergeSort<>();
        Integer[] sortedArray = mergeSort.sort(array);
        Integer[] expectedArray = {1, 2, 4, 7, 9};
        assertArrayEquals(expectedArray, sortedArray);
    }
}

