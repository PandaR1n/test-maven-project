package Home_work_4.Conditional_statements;

import java.util.Scanner;

public class Ideal_weight {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите рост: ");
        double height = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите свой вес: ");
        double weight = sc2.nextInt();
        double idealWeinght;
        idealWeinght = height - 100;
        idealWeinght -= idealWeinght * 10 / 100;

        if (idealWeinght >= weight - 5 && idealWeinght <= weight + 5){
        System.out.println("Ваш вес иделен");

        }else{
            System.out.println("ваш вес не идеален");

        }


    }
}


