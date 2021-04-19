import java.util.Arrays;

import static java.util.Arrays.*;

/**
 * 6. Создайте массив строк. Заполните его произвольными именами людей.
 * Отсортируйте массив.
 * Результат выведите на консоль.
 */
public class SixTask extends TaskHelper {

    public static void main(String[] args) {
        String[] names = {"Ksenia", "Andrew", "Taavi", "Margus", "Siim", "Kristjan", "Oliver"};
        System.out.println("Before sort(): " + Arrays.toString(names));
        sort(names);
        System.out.println("After: " + Arrays.toString(names));
    }

}