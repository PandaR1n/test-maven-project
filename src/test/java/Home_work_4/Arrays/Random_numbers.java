package Home_work_4.Arrays;

import java.util.concurrent.ThreadLocalRandom;

public class Random_numbers {
    public static void main(String[] args) {

        int [] arr = new int[99];
        for (int i = 1; i <arr.length ; i++) {
            int number = ThreadLocalRandom.current().nextInt(101);
            System.out.println(number);


        }
    }
}
