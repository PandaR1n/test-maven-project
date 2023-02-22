package Home_work_4.Arrays;

//Распечатать значения элементов массива с их номерами
public class Print_array_element_values_with_their_numbers {
    public static void main(String[] args) {
        int[] array = {1, 4, 2, 7, 9, 1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " - " + array[i]);
        }

    }

}
