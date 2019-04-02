package sort;

public class SelectionSorter extends Sorter {
    
    @Override
    public int[] sort(int[] arr) {
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0;
             lastUnsortedIndex--) {

            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (arr[i] > arr[largest]) {
                    largest = i;
                }
            }

            swap(arr, largest, lastUnsortedIndex);

        }
        return arr;
    }
}
