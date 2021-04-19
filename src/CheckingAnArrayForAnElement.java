import java.util.Arrays;

/**
 * 0. Создайте массив целых чисел.
 * Напишете программу, которая выводит сообщение о том, входит ли заданное число в массив или нет.
 * Пусть число для поиска задается с консоли (класс Scanner).
 */
public class CheckingAnArrayForAnElement extends TaskHelper {

    public static void main(String[] args) {
        int[] randomArray = generateAndFillAnArray(10, 20);
        System.out.println("An array has been initialised");

        System.out.println("Enter value to console: ");
        int inputNumber = input.nextInt();

        boolean isThereEnteredValue = false;
        for (int arrayElement : randomArray) {
            if (arrayElement == inputNumber) {
                isThereEnteredValue = true;
                break;
            }
        }
        System.out.println((isThereEnteredValue) ? "There is your entered value " + inputNumber + " in the array" : "The array does not contain the entered number");
        System.out.println(Arrays.toString(randomArray));
    }

}