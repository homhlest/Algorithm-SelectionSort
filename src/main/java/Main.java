
import java.util.Arrays;

/**
 * This program is a realization of the selection sort algorithm.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{64, 25, -2, 22, 11, 0};
        System.out.println("Initial array: \n" + Arrays.toString(arr));
        SelectionSortAlgorithm.sort(arr);
    }
}


