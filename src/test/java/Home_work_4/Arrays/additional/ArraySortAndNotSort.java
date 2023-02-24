package Home_work_4.Arrays.additional;


/**
 * Отсортированный и неотсортированный массив
 * Создать массив интов (массив из элементов типа int) из 10 элементов и задать значения вручную
 * Если элементы массива отсортированы (либо по возрастанию, либо по убыванию), то писать, что элементы массива отсортированы
 * Если элементы массива не отсортированы, то писать, что элементы массива не отсортированы
 * Задача со звёздочкой - сделать задачу так, чтобы в программе был всего один цикл
 */
public class ArraySortAndNotSort {
    public static void main(String[] args) {


        int[] arr = {9,9,7,6,5,4,3,2,1};
        int i = 0;
        int a = arr.length - 1;

        while ((i < arr.length - 1) && (a > 1)) {
            i++;
            a--;

            if ((arr[i] > arr[i + 1]) && (arr[a] > arr[a - 1])) {
                System.out.println(" ne verno");
                break;

            } else if ((i == (arr.length - 2)) && !(a == 2)) {
                System.out.println(" verno");

            }
        }
    }
}

