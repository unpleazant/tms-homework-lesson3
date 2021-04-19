import java.util.Random;
import java.util.Scanner;

import static java.util.Arrays.setAll;

public class TaskHelper {

    static Scanner input = new Scanner(System.in);

    static int[] generateAndFillAnArray(int arrayLength, int elementsValuesBounds) {
        int[] array = new int[arrayLength];
        setAll(array, i -> new Random().nextInt(elementsValuesBounds));
        return array;
    }

}