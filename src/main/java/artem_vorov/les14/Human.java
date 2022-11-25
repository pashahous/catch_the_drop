package artem_vorov.les14;

/*
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, двое детей. Вывести объекты на экран.
Примечание: Если написать свой метод StringtoString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Катя, пол: женский, возраст: 55
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import java.util.ArrayList;

public class Human {
    String name;
    boolean sex; // 1 - male 0 -female
    int age;
    Human father = null;
    Human mother = null;

    public Human(String name, boolean sex, int age, Human father, Human mother) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }


    @Override
    public String toString() {
        String male = (this.sex) ? "мужской" : "женский";
        String mother = (this.mother != null)? this.mother.name:"Нет мамы";
        String father = (this.father !=null)? this.father.name : "Нет папы";
//        if (this.father == null) return "Имя: " + this.name + " Возраст "+this.age+" пол: " + male +  ", мать: " + this.mother.name;
//        if (this.mother == null) return "Имя: " + this.name +  " Возраст "+this.age+ " пол: " + male + ", отец: " + this.father.name;
        return "Имя: " + this.name + " пол: " + male +  " Возраст "+this.age+ ", мать: " + mother + ", отец: " + father;
    }

    public static void myFamely() {
        ArrayList<Human> famyli = new ArrayList<>();
        Human father = new Human("Федя", true, 29);
        Human mother = new Human("Katya", false, 25);
        Human do4a = new Human("Катя", false, 5, father, mother);
        Human son = new Human("Pasha", true, 12, father, mother);
        famyli.add(father);
        famyli.add(mother);
        famyli.add(do4a);
        famyli.add(son);

        for (Human h:famyli) {
            System.out.println(h);

        }


    }
}
