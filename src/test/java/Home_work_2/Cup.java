package Home_work_2;

public class Cup {
    private static final int glassVolume = 150;
    public static final int percent = 100 ;


    public static void main(String[] args) {
        float procent = 50.5F;
        float voterAll = glassVolume * procent / percent;
        System.out.println("Объем стакана " + glassVolume +"мл");
        System.out.println("Милилитров воды в стакане " + voterAll);

    }


}
