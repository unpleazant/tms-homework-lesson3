import java.util.Arrays;
import java.util.InputMismatchException;

/**
 * 4. Если пользователь ввёл неподходящее число, то программа должна просить пользователя повторить ввод.
 * Создайте массив из n случайных целых чисел и выведите его на экран.
 * Размер массива пусть задается с консоли и размер массива может быть больше 5 и меньше или равно 10.
 * Если n не удовлетворяет условию - выведите сообщение об этом.
 * Создайте второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
 */
public class FourthTask extends TaskHelper {

    public static void main(String[] args) throws Exception {

        int[] randomGeneratedArray = generateAndFillAnArray(arrayLength(), 20);
        System.out.println("Randomly generated array has been initialised: " + Arrays.toString(randomGeneratedArray));

        int secondArrayLength = 0;
        for (int element : randomGeneratedArray) if (numberIsEven(element)) secondArrayLength++;
        if (secondArrayLength == 0) throw new Exception("The array does not contain even values");
        int[] arrayOfEvenNumbers = new int[secondArrayLength];

        int secondArrayIndex = 0;
        for (int element : randomGeneratedArray) {
            if (numberIsEven(element)) {
                arrayOfEvenNumbers[secondArrayIndex] = element;
                secondArrayIndex++;
            }
        }
        System.out.println("The array with even numbers: " + Arrays.toString(arrayOfEvenNumbers));
    }

    private static int arrayLength() {
        int attempts = 5;
        int length = 0;
        while (attempts != 0) {
            System.out.println("Please set an array size: ");
            length = input.nextInt();
            if (length < 6 || length > 10) {
                System.out.println("The array length cannot be greater then 10 and smaller then 6. Try again");
                attempts--;
            }
            else break;
        }
        if (attempts == 0) throw new InputMismatchException("Wrong entered value");
        else return length;
    }

    private static boolean numberIsEven(int value) {
        return value % 2 == 0;
    }

}