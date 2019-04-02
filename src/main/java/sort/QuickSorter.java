package sort;

import lombok.extern.log4j.Log4j;

@Log4j
public class QuickSorter extends Sorter {

    @Override
    public int[] sort(int[] arr) {
        return quickSort(arr, 0, arr.length);
    }

    private int[] quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return input;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
//        for (int i = 0; i < input.length; i++) {
//            log.info(input[i]);
//        }
        quickSort(input, pivotIndex + 1, end);

        return input;
    }

    private int partition(int[] input, int start, int end) {
        // This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            // NOTE: empty loop body
            while (i < j && input[--j] >= pivot);
            if (i < j) {
                input[i] = input[j];
            }

            // NOTE: empty loop body
            while (i < j && input[++i] <= pivot);
            if (i < j) {
                input[j] = input[i];
            }

        }

        input[j] = pivot;
        return j;

    }


}
