package ArtemVorov;

/*
1) Создать класс Woman с параметрами: name, age, husband. Подумай, какого типа должна быть каждая переменная.
2) Создать класс Man с параметрами: name, age, wife. Подумай, какого типа должна быть каждая переменная.
3) В выполняющем методе создать по одному экземпляру каждого класса и сделать так, чтобы объекты стали мужем и женой.
*/

import ArtemVorov.les13.ArraysMy;
import ArtemVorov.les14.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        Robot r1 = new Robot("Jarvis",20,17);
//        Robot r2 = new Robot("Petya",20,16);
//        System.out.println(r1.fight(r2));
//        testPets();
//        ArraysMy.testArrays1();
//        ArraysMy.testArrays2();
//        ArraysMy.testArrays3();
//        ArraysMy.arrStr1();
//        ArraysMy.minElement();

//        ArraysMy.squearEight();
//        Human.myFamely();
        Array10.initialArray();
//        Array10.printArray();
    }

    public static void testPets(){
        Woman w1 = new Woman("Mariya",25);
        Woman w2 = new Woman("Koza",25);
        Fish f1 = new Fish("Korgi",1);
        Fish f2 = new Fish("Korgi",1);
        Dog d1 = new Dog("Sinistr",2);
        Cat c1 = new Cat("May",3);
        System.out.println(w1.getPetList());
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(c1);
        f1.setOwner(w1);
        d1.setOwner(w1);
        f2.setOwner(w2);

        for (Object pet:w1.getPetList()) {
            System.out.println(w1.getName() +"Имеет:");
            System.out.println(pet);
        }
        for (Object pet:w2.getPetList()) {
            System.out.println(w2.getName() +"Имеет:");
            System.out.println(pet);
        }



    }


}
