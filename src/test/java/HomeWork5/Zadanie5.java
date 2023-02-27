package HomeWork5;
/**
 * - Создать первую HashMap, положить туда Котов в произвольном количестве в формате Имя, Возраст
 * - Создать вторую HashMap, положить туда Собачек в произвольном количестве в формате Имя, Возраст
 * - Создать третью HashMap и положить туда всех котиков и песиков из предыдущих мап
 */

import java.util.HashMap;

public class Zadanie5 {
    public static void main(String[] args) {
        HashMap<String, Integer> catsMap = new HashMap<>();
        catsMap.put("Cat1", 3);
        catsMap.put("Cat2", 5);
        catsMap.put("Cat3", 7);
        HashMap<String, Integer> dogsMap = new HashMap<>();
        dogsMap.put("Dog1", 2);
        dogsMap.put("Dog2", 4);
        dogsMap.put("Dog3", 6);
        HashMap<String, Integer> catsDogsMap = new HashMap<>();
        catsDogsMap.putAll(catsMap);
        catsDogsMap.putAll(dogsMap);
        System.out.println(catsDogsMap);
    }
}
