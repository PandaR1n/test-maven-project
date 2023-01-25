package Home_work_3;

public class Fizz_buzz {
    public static void main(String[] args) {


        for (int i = 0; i <= 100; i++)
            if (((i % 5) == 0) && ((i % 3) == 0)) {
                System.out.println(i + " fizz bizz");
            } else if ((i % 5) == 0) {
                System.out.println(i + " bizz");
            } else if ((i % 3) == 0) {
                System.out.println(i + " fizz");
            }
    }
}