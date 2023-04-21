
import java.util.Arrays;

/**
 * This algorithm has an O(n2) time complexity, which makes it inefficient
 * on large lists, and generally performs worse than the similar insertion sort.
 * Selection sort is noted for its simplicity and has performance advantages
 * over more complicated algorithms in certain situations, particularly where
 * auxiliary memory is limited.
 */
public class SelectionSortAlgorithm {

    public static void sort(int[] arr) {
        int indexOfMinElement = 0;

        for (int i = 0; i < arr.length; i++) {
            int pointer = i; // the border between sorted and unsorted part.
            int edgeElementInSortedPart = arr[pointer];
            // searching the minimal element starting from the pointer.
            while (pointer < arr.length) {
                if (arr[pointer] <= edgeElementInSortedPart) {
                    edgeElementInSortedPart = arr[pointer];
                    indexOfMinElement = pointer;
                }
                pointer++;
            }
            // swaps the elements of the array.
            int temp = arr[i];
            arr[i] = edgeElementInSortedPart;
            arr[indexOfMinElement] = temp;
        }
        System.out.println("Algorithm result: \n" + Arrays.toString(arr));
    }
}

