package HomeWork5;

import java.util.*;


public class House {
    public static void main(String[] args) {


        HashMap<String, Integer> map = new HashMap<>();
        map.put("Шмырёв Максим Наумович", 25);
        map.put("Конников Адам Акимович", 22);
        map.put("Машарина Марьяна Макаровна", 30);
        map.put("Лукашенко Аполлинария Ивановна", 17);

        ArrayList<String> list = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 18) {
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
}