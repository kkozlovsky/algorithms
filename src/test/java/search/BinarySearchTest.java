package search;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void iterativeBinarySearchTest() {
        int[] sortedArray = { -22, -15, 1, 7, 20, 35, 55 };
        assertEquals(BinarySearch.iterativeBinarySearch(sortedArray, -22), 0);
        assertEquals(BinarySearch.iterativeBinarySearch(sortedArray, 20), 4);
        assertEquals(BinarySearch.iterativeBinarySearch(sortedArray, 100), -1);

    }

    @Test
    public void recursiveBinarySearchTest() {
        int[] sortedArray = { -22, -15, 1, 7, 20, 35, 55 };
        assertEquals(BinarySearch.recursiveBinarySearch(sortedArray, -22), 0);
        assertEquals(BinarySearch.recursiveBinarySearch(sortedArray, 20), 4);
        assertEquals(BinarySearch.recursiveBinarySearch(sortedArray, 100), -1);
    }
}