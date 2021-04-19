import java.util.Arrays;

/**
 * 1. Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
 * Пусть число задается с консоли (класс Scanner).
 * Если такого числа нет - выведите сообщения об этом.
 * В результате должен быть новый массив без указанного числа.
 */
public class RemoveValuesFromAnArray extends TaskHelper {

    public static void main(String[] args) throws Exception {
        int[] randomGeneratedArray = generateAndFillAnArray(10, 20);
        System.out.println("An array has been initialised: "  + Arrays.toString(randomGeneratedArray));

        System.out.println("Enter the value of element(s) to be removed from the array:");
        int inputNumber = input.nextInt();

        int newArrayLength = 0;
        for (int element : randomGeneratedArray) if (element != inputNumber) newArrayLength++;
        if (newArrayLength == randomGeneratedArray.length) throw new Exception("The array does not contain requested values");
        int[] newArray = new int[newArrayLength];

        for (int i = 0, k = 0; i < randomGeneratedArray.length; i++) {
            if (randomGeneratedArray[i] != inputNumber) {
                newArray[k] = randomGeneratedArray[i];
                k++;
            }
        }
        System.out.println("After deletion: " + Arrays.toString(newArray));
    }
}