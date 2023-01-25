package Home_work_3;

import java.util.Scanner;

public class prostoy_chislo {
    public static void main(String args[]) {
        int num = 6;

        int i = 2 ;

        {
            if ((num % i == 0) & (num % num == 0)) {
                System.out.println(" не простое!!!");
                return;
            }
        }
        System.out.println(" простое");
    }
}



