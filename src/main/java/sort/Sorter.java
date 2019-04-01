package sort;

public abstract class Sorter {

    static int[] UNSORTED_ARRAY = {12, 1, 1989, -30, 0, 23, 17, -8, 7};
    static int[] SORTED_ARRAY = {-30, -8, 0, 1, 7, 12, 17, 23, 1989};

    public abstract int[] sort(int[] intArray);

    static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
