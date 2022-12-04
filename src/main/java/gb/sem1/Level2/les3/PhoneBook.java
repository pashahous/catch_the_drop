package gb.sem1.Level2.les3;

import java.util.*;

public class PhoneBook {
    private Map<String,Set<Integer>> phoneBook; // телефонная книга на базе Мар

    public PhoneBook() {
        phoneBook = new HashMap<String, Set<Integer>>();
    }

    public void add(String fio , Integer number){
        HashSet<Integer> temp;
        if (!phoneBook.containsKey(fio)){ // if key not found
            temp  = new HashSet<>(); // create new HashSet ant put, in variable "temp"
            temp.add(number); // add to temp new number
            phoneBook.put(fio,temp); //add to phoneBook key value

        } else {  // если ключ есть, то добавляем в СЭТ данного ключа номер телефона
            temp = (HashSet<Integer>) phoneBook.get(fio);
            temp.add(number);
        }
    }

    public void get(String fio){
        boolean b = phoneBook.containsKey(fio);
        if(!b){
            System.out.println("В книге нет такой фамилии");
        } else {
            Object[] arrOut = phoneBook.get(fio).toArray();
            System.out.println("FIO = " + fio + "\n");
            for (Object str : arrOut) {
                System.out.println(str);
            }
            System.out.println("===========");
        }
    }
}
