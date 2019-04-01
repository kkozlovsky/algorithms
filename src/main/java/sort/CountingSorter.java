package sort;

public class CountingSorter {

    public static int[] countingSort(int[] arr, int min, int max) {
        int[] countArray = new int[(max - min) + 1];
        for (int i = 0; i < arr.length; i++) {
            countArray[arr[i] - min]++;
        }
        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                arr[j++] = i;
                countArray[i - min]--;
            }
        }
        return arr;
    }
}
