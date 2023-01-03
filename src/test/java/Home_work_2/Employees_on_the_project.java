package Home_work_2;

public class Employees_on_the_project {
    private static final int programmers = 3;
    private static final int testers = 14;
    private static final int support = 5;

    public static void main(String[] args) {

        int getTesters = programmers * testers;
        int getSupport = programmers * support;
        int totalSpecialist = getSupport + getTesters + programmers;
        System.out.println("Прогаммистов всего " + programmers);
        System.out.println("Тестеровшиков на одного прогаммиста " + testers);
        System.out.println("Специалистов поддержки на одного программиста " + support);
        System.out.println("Тестировщиков, требуемое на проекте " + getTesters + ", а специалистов поддержки, требуемое на проекте равно "
                + getSupport + ". \n Итого общее количество технических специалистов на проекте " + totalSpecialist + " человек.");
    }


}
