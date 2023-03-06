package HomeWork5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * - Сыграем в лотерею, реализовать механизм который будет перемешивать "Шарики с цифрами"
 * - Заполнить массив 100 числовыми значениями
 * - Перемешать массив
 * - Вывести в консоль первые 10 значений
 */
public class Zadaniue7 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        for (int i = 1; i <= 100; i++)
            list.add(i+1);
        Collections.shuffle(list);
        for (int i = 0; i < 10; i++)
            System.out.println(list.get(i));

    }
}
