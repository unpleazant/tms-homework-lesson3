import java.util.Arrays;

import static java.util.Arrays.stream;

/**
 * 2. Создайте и заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
 * Для генерации случайного числа используйте метод Math.random().
 * Пусть будет возможность создавать массив произвольного размера.
 * Пусть размер массива вводится с консоли.
 */
public class MinAverageMaxValue extends TaskHelper{

    public static void main(String[] args) {
        System.out.println("Enter the array length please");
        int arrayLength = input.nextInt();

        int[] arrayWithNumbers = generateAndFillAnArray(arrayLength, 20);
        System.out.println("An array has been initialised: " + Arrays.toString(arrayWithNumbers));

        System.out.println("Min value in the array" + stream(arrayWithNumbers).min());
        System.out.println("Average value in the array" + stream(arrayWithNumbers).average());
        System.out.println("Max value in the array" + stream(arrayWithNumbers).max());
    }

}