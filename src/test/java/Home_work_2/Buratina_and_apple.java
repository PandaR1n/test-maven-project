package Home_work_2;

public class Buratina_and_apple {
    public static final byte appleBuratino = 5;
    public static final int karabasBarabas = 2; //todo Использую тип данных Byte, чтобы уменьшить обьем занимаемой памяти.

    public static void main(String[] args) {
        byte total = appleBuratino - karabasBarabas;
        System.out.println("Яблок у Буратины было " + appleBuratino);
        System.out.println("Карабас Барабас яблок забрал " + karabasBarabas);
        System.out.println("У Буратины осталось яблок " + total);
    }


    }
