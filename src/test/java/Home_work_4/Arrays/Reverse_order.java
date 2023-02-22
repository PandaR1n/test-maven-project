package Home_work_4.Arrays;

public class Reverse_order {
    public static void main(String[] args) {

        int[] array = new int[100];
        for (int a = 99; a > 0; a--) {
            array[a] -= a - 1;
            System.out.println(array[a]);

        }
    }
}





