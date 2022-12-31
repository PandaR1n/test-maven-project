package Home_work_2;

public class Apartment {

public static final double price = 8000000,firstPercent = 9.6;

    public static void main(String[] args) {

        double downPayment = price * firstPercent / 100;
        System.out.println("стоимость квартиры = " + price);
        System.out.println("процент первоначального взноса по ипотеке = "+ firstPercent);
        System.out.println("сумма первоначального взноса = " + downPayment  );
    }
    }