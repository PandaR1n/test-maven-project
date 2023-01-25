package Home_work_3;

public class Vasya {
    public static void main(String[] args) {
        int itogo = 0;
        int ostatok;
        int zapas = 100;
        int cenaZaKg = 100;
        int estZaMesyac = 6;
        int havatit = zapas / estZaMesyac;
        System.out.println(havatit + " месяцев хватит гречки");
        int perviMesyacDenegPotratil = zapas * cenaZaKg;
        System.out.println(perviMesyacDenegPotratil + " заплатил за первый месяц ");
        for (int i = zapas; i >= 0; i = i - estZaMesyac) {
            ostatok = cenaZaKg * i;
            itogo += ostatok;
        }


        System.out.println(itogo + " руб вася заплатил за хранение гречки");


    }


}




