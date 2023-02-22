package Home_work_4.Conditional_statements;


import java.util.ArrayList;
import java.util.Scanner;


public class Greetings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите время: ");
        double hoursSC = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите день недели: ");
        int weekdaysSC = sc2.nextInt();


        ArrayList<Integer> weekdays = new ArrayList<>();
        weekdays.add(1);
        weekdays.add(2);
        weekdays.add(3);
        weekdays.add(4);
        weekdays.add(5);


        if (weekdays.contains(weekdaysSC)) {
            if (hoursSC >= 6 && hoursSC < 8) {
                System.out.println("Доброе утро ");
            }

            if (hoursSC >= 8 && hoursSC < 11) {

                System.out.println("Всё пропало ты проспал!");
            }
            if (hoursSC >= 11 && hoursSC < 17) {
                System.out.println("Включай почту, составляй письмо, что сегодня берёшь отгул");
            }

        } else {


            if (hoursSC >= 6 && hoursSC < 12) {
                System.out.println("Доброе утро!");
            }

            if (hoursSC >= 12 && hoursSC < 16) {
                System.out.println("Лучше поспать ещё");
            }
            if (hoursSC >= 16 && hoursSC < 18) {
                System.out.println("Вставай, тебя ждёт недоигранный Ведьмак!");
            }
            if (hoursSC >= 18 && hoursSC < 20) {
                System.out.println("Дааа, с режимом надо что-то делать");
            }
        }

    }
}





