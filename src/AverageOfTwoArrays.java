import java.util.Arrays;

import static java.util.Arrays.stream;

/**
 * 3. Создайте 2 массива из 5 чисел.
 * Выведите массивы на консоль в двух отдельных строках.
 * Посчитайте среднее арифметическое элементов каждого массива и сообщите,
 * для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)
 */
public class AverageOfTwoArrays extends TaskHelper {

    public static void main(String[] args) {
        int[] firstArray = generateAndFillAnArray(5, 20);
        System.out.println("First array: " + Arrays.toString(firstArray));
        double firstArrAverage = stream(firstArray).sum() / firstArray.length;

        int[] secondArray = generateAndFillAnArray(5, 20);
        System.out.println("Second array: " + Arrays.toString(secondArray));
        double secondArrAverage = stream(secondArray).sum() / secondArray.length;

        if (firstArrAverage == secondArrAverage) System.out.println("the arithmetic average are equal");
        else System.out.println( (firstArrAverage > secondArrAverage) ? "the first array arithmetic average is greater" : "the second array arithmetic average is greater");
    }

}