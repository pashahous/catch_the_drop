package gb.sem1.Level2.les3;

import mysolution.GenForClass;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        GenForClass g = new GenForClass(); // класс для генерации случайных значений
        Map unw = uniqueWords(new ArrayList<>(Arrays.asList("паша", "ваша", "наша", "паша", "кукла", "мукла", "кукла", "петро",
                "ведро", "", "кукла", "мукла", "дукла", "1", "2", "3", "4", "5", "", "7", "2",
                "паша", "2", "7", "чукча", "", "ведро", "", "петро", "чикса", "7", "5", "2", "вукча", "3", "2")));
        unw.forEach((k,v)-> System.out.println(k + " " + v));
        PhoneBook phonebook = new PhoneBook();
        for (int i = 0; i < 30; i++) {
            phonebook.add(g.getFIO("3"), Integer.parseInt(g.randomPhone(8)));
        }
        phonebook.get("Ющенков");
        phonebook.get("Хребтов");
        phonebook.get("Егоров");
        phonebook.get("Петров");
    }

    public static HashMap uniqueWords(List<String> arr) {
        HashMap map = new HashMap<String, Integer>(100);
        for (String elem : arr) {
            Integer val = (Integer) map.getOrDefault(elem, 0);
            map.put(elem, val + 1);
        }
        return map;
    }

}
