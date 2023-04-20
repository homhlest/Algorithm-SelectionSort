
import java.util.Arrays;

/**
 * This program is a realization of selection sort algorithm.
 * This algorithm has an O(n2) time complexity, which makes it inefficient
 * on large lists, and generally performs worse than the similar insertion sort.
 * Selection sort is noted for its simplicity and has performance advantages
 * over more complicated algorithms in certain situations,
 * particularly where auxiliary memory is limited.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{64, 25, -2, 22, 11, 0};

        System.out.println("Initial array: \n" + Arrays.toString(arr));
        int indexOfMinElement = 0;

        for (int i = 0; i < arr.length; i++) {
            int sortedPartBorder = i;
            int min = arr[sortedPartBorder];

            while ((sortedPartBorder) < arr.length) { // searching the minimal element in the array
                if (arr[sortedPartBorder] <= min) {
                    min = arr[sortedPartBorder];
                    indexOfMinElement = sortedPartBorder;
                }
                sortedPartBorder++;
            }
            int temp = arr[i];
            arr[i] = min;
            arr[indexOfMinElement] = temp;
        }
        System.out.println("Selection sort algorithm result: \n" + Arrays.toString(arr));
    }
}


