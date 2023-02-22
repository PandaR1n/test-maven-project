package Home_work_4.Arrays;


public class Fill_array_with_values_automatically {
    public static void main(String[] args) {

        int[] array = new int[100];
        for (int a = 0; a < array.length; a++) {
            array[a] -= a ;
            System.out.println(array[a]);
        }
    }
}