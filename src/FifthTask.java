import java.util.Arrays;

import static java.util.Arrays.setAll;

/**
 * 5. Создайте массив и заполниет массив.
 * Выведите массив на экран в строку.
 * Замените каждый элемент с нечётным индексом на ноль.
 * Снова выведете массив на экран на отдельной строке.
 */
public class FifthTask extends TaskHelper{

    public static void main(String[] args) {
        int[] randomlyGeneratedArray = generateAndFillAnArray(10, 20);
        System.out.println("Randomly generated array has been initialised: " + Arrays.toString(randomlyGeneratedArray));

        for (int i = 0; i < randomlyGeneratedArray.length; i++) {
            if (i % 2 != 0) randomlyGeneratedArray[i] = 0;
        }
        System.out.println("Odd index numbers has been replaced to 0: " + Arrays.toString(randomlyGeneratedArray));
    }

}