package HomeWork5;

import java.util.ArrayList;

/**
 * \
 * - Создать ArrayList, который будет репрезентирвоать нашу солнечную систему
 * - Заполнить его значениями {mercury, venus, earth, mars,
 * jupiter, saturn, neptune, uranus}
 * - Найти кто из участников солнечной системы находится не на своем месте и переместить его на нужную позицию
 */
public class Zadanie6 {
    public static void main(String[] args) {
        ArrayList<String> solarSystem = new ArrayList<>();
        solarSystem.add("Меркурий");
        solarSystem.add("Венера");
        solarSystem.add("Земля");
        solarSystem.add("Марс");
        solarSystem.add("Юпитер");
        solarSystem.add("Сатурн");
        solarSystem.add("Нептун");
        solarSystem.add("Уран");
        solarSystem.remove("Нептун");
        solarSystem.add("Нептун");
        System.out.println(solarSystem);

    }
}




