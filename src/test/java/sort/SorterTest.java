package sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
import static sort.Sorter.SORTED_ARRAY;
import static sort.Sorter.UNSORTED_ARRAY;

public class SorterTest {

    @Test
    public void bubbleSort() {
        Sorter bubbleSorter = new BubbleSorter();
        assertEquals(Arrays.toString(SORTED_ARRAY), Arrays.toString(bubbleSorter.sort(UNSORTED_ARRAY)));
    }

    @Test
    public void insertionSort() {
        Sorter insertionSorter = new InsertionSorter();
        assertEquals(Arrays.toString(SORTED_ARRAY), Arrays.toString(insertionSorter.sort(UNSORTED_ARRAY)));
    }

    @Test
    public void mergeSort() {
        Sorter mergeSorter = new MergeSorter();
        assertEquals(Arrays.toString(SORTED_ARRAY), Arrays.toString(mergeSorter.sort(UNSORTED_ARRAY)));
    }

    @Test
    public void quickSort() {
        Sorter quickSorter = new QuickSorter();
        assertEquals(Arrays.toString(SORTED_ARRAY), Arrays.toString(quickSorter.sort(UNSORTED_ARRAY)));
    }

    @Test
    public void countingSort() {
        int[] unsortedArr = { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3 };
        int[] sortedArr = { 2, 2, 3, 4, 5, 7, 8, 8, 9, 10 };

        assertEquals(Arrays.toString(sortedArr), Arrays.toString(CountingSorter.countingSort(unsortedArr, 1, 10)));
    }
}