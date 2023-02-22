package Home_work_4.Arrays;

import java.util.concurrent.ThreadLocalRandom;

public class Sum_arrays {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int number = ThreadLocalRandom.current().nextInt(101);
            sum = sum + number;


            System.out.println(sum);
        }
    }
}