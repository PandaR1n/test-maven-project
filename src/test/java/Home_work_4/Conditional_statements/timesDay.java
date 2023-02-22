package Home_work_4.Conditional_statements;


import java.util.Scanner;

public class timesDay {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите время: ");
        double hours = sc.nextInt();


        if (hours >= 6 && hours < 12) {
            System.out.println("Утро");
        }
        if (hours >= 12 && hours < 16) {
            System.out.println("День");
        }
        if (hours >= 16 && hours < 24) {
            System.out.println("Вечер");
        }
        if (hours > 0 && hours < 6) {
            System.out.println("Ночь");
        }
    }

}
