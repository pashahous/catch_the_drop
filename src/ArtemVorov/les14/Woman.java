package ArtemVorov.les14;

import java.util.ArrayList;

/*
1) Создать класс Woman с параметрами: name, age. Подумай, какого типа должна быть каждая переменная.
2) Создать классы Cat, Dog, Fish с параметрами: name, age, owner. Подумай, какого типа должна быть каждая переменная.
3) В выполняющем методе создать по одному экземпляру каждого класса и сделать так, чтобы владельцем каждого питомца была одна и та же женщина.
*/
public class Woman {
    private final ArrayList<Object> petsList;
    String name;
    int age;

    public Woman(String name, int age) { // конструкторы
        this.name = name;
        this.age = age;
        this.petsList = new ArrayList<>(20);
    }

    public String getName() {
        return this.name;
    }

    public void addPet(BasePet pet){ // добавляет во владение нового питомца
        this.petsList.add(pet);
    }

    public ArrayList getPetList(){ // возвращает список личных питомцев

        return this.petsList;
    }


}
