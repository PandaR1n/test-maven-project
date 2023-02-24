package Home_work_4.Arrays.additional;

import java.util.Arrays;
import java.util.List;

/**
 * Переработки
 * Программист Петя работает в аутсорсе и каждый день записывает в джиру, сколько часов он отработал сегодня.
 * Но для порядку он также записывает это количество часов в массив, чтобы ничего не забыть. Часы за каждый день он записывает в новый элемент массива.
 * То есть, если Петя работал вот так
 * Понедельник - 8 часов Вторник - 10 часов Среда - 9 часов Четверг - 10 часов Пятница - 8 часов Суббота - 12 часов Воскресенье - 14 часов Понедельник - 9 часов
 * То масив будет заполнен вот так:
 * 8 10 9 10 8 12 14 9
 * Помоги Пете!
 * Напиши программу, которая посчитает сколько Петя переработал, при условии, что рабочий день должен состоять из 8 (восьми) часов.
 * Для массива из примера переработки в сумме будут 32 часа
 */
public class Pererabotka {
    public static void main(String[] args) {
        int startingDay  = 5;
        int chasovPererabotki = 0;
        int normaChasov = 8;
        int chasovPererabotkiDlyaKoncoly;



        int[] weekdays = {8, 10, 9, 10, 8, 12, 14, 9, 8, 10, 9, 10, 8, 12, 14, 9};

        for (int i = 0; i < weekdays.length ; i++) {

            if ((i % 7 == startingDay) || (i % 7 == startingDay+1)) {
                System.out.println("Переработал в выходные часов " + weekdays[i]);
                chasovPererabotki += weekdays[i];
            } else {
                chasovPererabotkiDlyaKoncoly = weekdays[i] - normaChasov;
                System.out.println("Переработал в будни часов " + chasovPererabotkiDlyaKoncoly);
                chasovPererabotki += weekdays[i] - normaChasov;
            }
        }
        System.out.println("Всего часов переработки " + chasovPererabotki);
    }
}