package HomeWork5;


/**
 * - Создать массив и заполнить его числовыми значениями
 * - Найти минимальное и максимальное число
 */


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Zadanie4 {

    public static void main(String[] args) {


        Integer [] array = new Integer[] {1,2,3,4,57,5,2,-1};
        List <Integer> list = Arrays.asList(array);
        int min = Collections.min(list);
        int max = Collections.max(list);
        System.out.println( min + " " +  max );
    }


}