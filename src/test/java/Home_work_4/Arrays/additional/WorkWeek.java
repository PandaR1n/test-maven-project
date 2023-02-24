package Home_work_4.Arrays.additional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Рабочая неделя
 * Создать массив интов (массив из элементов типа int), в ячейках которого будет храниться сколько человек работал за день Заполнить его значениями
 * Создать массив интов (массив из элементов типа int), в ячейках которого будет храниться, сколько человек работал за неделю.
 * Просуммировать ячейки из первого массива и записать во второй.
 * Допустим в первом массиве
 * 1, 1, 1, 2, 3, 5, 0, 2, 2, 2, 1 ,5, 5, 0
 * Тогда во втором должно быть 13, 17
 * Когда делаете задание, можете предполагаться, что число элементов в массиве обязательно должно быть кратно семи
 Решение:
 1. Создаем массив чисел 1, 1, 1, 2, 3, 5, 0, 2, 2, 2, 1 ,5, 5, 0
 2. Делим этот массив на две части.
 3. Суммируем кажду часть.
 4. Заносим результаты в 2  массив.
 */
public class WorkWeek {
    public static void main(String[] args) {
        int vsegoChasovPervoiNedeli = 0;
        int vsegoChasovVtoroiNedeli = 0;
        List<Integer> rabochihChasov = new ArrayList<>(List.of(1, 1, 1, 2, 3, 5, 0, 2, 2, 2, 1, 5, 5, 0));


        List<Integer> pervayaNedelya = rabochihChasov.subList(0, 7);
        for (int i = 0; i < pervayaNedelya.size(); i++) {
            vsegoChasovPervoiNedeli += pervayaNedelya.get(i);
        }


        List<Integer> vtorayaNedelya = rabochihChasov.subList(7,14);
        for (int i = 0; i < vtorayaNedelya.size(); i++) {
            vsegoChasovVtoroiNedeli += vtorayaNedelya.get(i);
        }

        int[] chasovZaNedely = new int[2];
        chasovZaNedely [0] = vsegoChasovPervoiNedeli;
        chasovZaNedely [1] = vsegoChasovVtoroiNedeli;

        System.out.println(Arrays.toString(chasovZaNedely));
    }




}
