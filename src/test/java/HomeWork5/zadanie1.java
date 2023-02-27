package HomeWork5;
/**
 * - Создать ArrayList и заполнить его числовыми значениями
 * - Вывести в консоль все значения из него
 * - Отсортировать массив числовых значений
 * - Вывести в консоль отсортированный список
 * - Отсортировать в обратном порядке
 * - Вывести в консоль отсортированный список
 * - Очистить список
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class zadanie1 {
    public static void main(String[] args) {


        List<Integer> num = new ArrayList<>(10);
        num.add(1);
        num.add(-11);
        num.add(12);
        num.add(54);
        num.add(1235);
        System.out.println(num + " Вывести в консоль все значения из него");
        Collections.sort(num);
        System.out.println(num + " Отсортировать массив числовых значений");
        Collections.reverse(num);
        System.out.println(num + " Отсортировать в обратном порядке");
        num.clear();
        System.out.println(num + " Очистить список ");
    }
}

