package Home_work_2;

public class Cup {
    private static final int glassVolume = 150, percent = 100 ;


    public static void main(String[] args) {
        float a = 50.5F;
        float b = glassVolume * a / percent;
        System.out.println("Объем стакана " + glassVolume +"мл");
        System.out.println("Милилитров воды в стакане " + b);

    }


}
