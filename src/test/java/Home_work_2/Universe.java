package Home_work_2;

public class Universe {
    public static final long universe = 13000000000L;
    public static final int  personsAge = 100000;

    public static void main(String[] args) {
        long difference = universe / personsAge;
        System.out.println("Вселенная старше людей в " + difference + " тысяч лет.");
    }
}
