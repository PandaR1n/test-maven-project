package Home_work_4.Arrays.additional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
  Незаконченная рабочая неделя
 * Взять задачу про рабочую неделю и сделать с учётом, что число элементов в первом массиве не обязательно кратно семи
 * В этом случае мы считаем, что последняя неделя просто заполнена данными не до конца
 */
public class NeZakonchinayaRabNedelya {
    public static void main(String[] args) {
        int vsegoChasovPervoiNedeli = 0;
        int vsegoChasovVtoroiNedeli = 0;
        List<Integer> rabochihChasov = List.of(1, 1, 1, 2, 3, 5, 0, 2, 2, 2, 1);


        List<Integer> pervayaNedelya = rabochihChasov.subList(0, 7 );
        for (int i = 0; i < pervayaNedelya.size(); i++) {
            vsegoChasovPervoiNedeli += pervayaNedelya.get(i);
        }


        List<Integer> vtorayaNedelya = rabochihChasov.subList(7, rabochihChasov.size());
        for (int i = 0; i < vtorayaNedelya.size(); i++) {
            vsegoChasovVtoroiNedeli += vtorayaNedelya.get(i);
        }

        int[] chasovZaNedely = new int[2];
        chasovZaNedely[0] = vsegoChasovPervoiNedeli;
        chasovZaNedely[1] = vsegoChasovVtoroiNedeli;

        System.out.println(Arrays.toString(chasovZaNedely));
    }
}
