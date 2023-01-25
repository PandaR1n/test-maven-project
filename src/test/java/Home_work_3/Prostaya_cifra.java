package Home_work_3;

import java.io.IOException;

public class Prostaya_cifra {
    public static void main(String[] args) {

        int sum = 0;


        for (int n = 1; n <= 100; n++) {
            if ((n % 2) == 0) {
                sum = sum - n;


                System.out.println(n+ "чет");
            } else {
                sum = sum + n;

                    System.out.println(n+ "нечет");

                }
            }
        System.out.println(sum);
        }
    }


