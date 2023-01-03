package Home_work_2;

public class Travel_time {
    private static final float  speed = 39.6F;
    private static final float coefficient = 1.34F;
    private static final int distance = 54;

    public static void main(String[] args) {
        float time = distance / speed;
        float travelEvening = time * coefficient;
        System.out.println("Расстояние в километрах от дома до офиса " +distance + " Средняя скорость " + speed + " Коэффициент замедления траснпорта вечером " + coefficient );
        System.out.println("Время в пути " + time);
        System.out.println("Время в пути вечером " + travelEvening);
    }



}
