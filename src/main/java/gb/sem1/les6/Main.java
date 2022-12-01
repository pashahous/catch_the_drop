package gb.sem1.les6;

import mysolution.GenForClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        GenForClass g = new GenForClass();
        Random random = new Random();
        ArrayList<Object> arrObject;
        Animal[] animalsArray = new Animal[15];
        for (int i = 0; i < animalsArray.length; i++) {
            animalsArray[i] = ((random.nextBoolean())?
                    new Dog(g.getAnimalName()+ i,random.nextInt(20),
                    true,random.nextInt(300),random.nextInt(300)):
                    new Cat(g.getAnimalName()+i,random.nextInt(20),
                            random.nextBoolean(),random.nextInt(300),random.nextInt(300)));
        }
        for (Animal animal:animalsArray) {
            int distWalk = random.nextInt(400);
            int distSwim = random.nextInt(20);
            animal.swim(distSwim);
            animal.walk(distWalk);

            System.out.println("-----------");

        }
        System.out.println("===============");
        Animal.getCountAllAnnimal();
        animalsArray[0].getCount();
        animalsArray[2].getCount();

    }
}
