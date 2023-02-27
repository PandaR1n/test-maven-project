package HomeWork5;
/**
 * - Создать ArrayList и заполнить его текстовыми значениями
 * - Вывести в консоль все значения из него
 * - Отсортировать массив текстовых значений
 * - Вывести в консоль отсортированный список
 * - Отсортировать в обратном порядке
 * - Вывести в консоль отсортированный список
 * - Очистить список
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zadanie2 {
    public static void main(String[] text) {
        ArrayList<String> collor = new ArrayList<String>();
        collor.add("Red");
        collor.add("Green");
        collor.add("Blue");
        collor.add("Red");
        collor.add("Yellow");
        System.out.println(collor + " Вывести в консоль все значения из него");
        Collections.sort(collor);
        System.out.println(collor + " Отсортировать массив числовых значений");
        Collections.reverse(collor);
        System.out.println(collor + " Отсортировать в обратном порядке");
        collor.clear();
        System.out.println(collor + " Очистить список ");


    }
}
