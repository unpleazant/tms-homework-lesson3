import java.util.Arrays;

/**
 * 7.Реализуйте алгоритм сортировки пузырьком.
 */
public class BubbleSort extends TaskHelper {

    public static void main(String[] args) {
        int[] randomlyGeneratedArray = generateAndFillAnArray(10, 20);
        System.out.println("Randomly generated array has been initialised: " + Arrays.toString(randomlyGeneratedArray));
        bubbleSort(randomlyGeneratedArray);
        System.out.println("The array after Bubble Sort: " + Arrays.toString(randomlyGeneratedArray));
    }

    static void bubbleSort(int[] array) {
        int n = array.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

}