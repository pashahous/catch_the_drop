package gb.sem1.Level2.les1;

import mysolution.GenForClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        GenForClass g = new GenForClass();

        int numBarier = 2;
        int numOfUnits = 10;
        List<Barrier> barriers = new ArrayList<>(20);
        List<WalkJump> units = new ArrayList<>(20);
        List<WalkJump> tempUnits = new ArrayList<>(20); // добовляем сюда юнитов которые прошли все;
//        for (int i = 0; i < numBarier; i++) {
//            Barrier wlkjmp;
//            wlkjmp = (random.nextBoolean())? (Barrier) new Wall(g.getRandomNumFromAToB(1,5)) : (Barrier) new Track(g.getRandomNumFromAToB(10,50));
//            barriers.add(wlkjmp);
//        }
        barriers.add(new Wall(g.getRandomNumFromAToB(2,4)));
        barriers.add(new Track(g.getRandomNumFromAToB(10,45)));
// создаем случайных юнитов для преодоления препятствий
        for (int i = 0; i < numOfUnits; i++) {
            int rndomIndex = random.nextInt(3);
            switch (rndomIndex){
                case 0: units.add(new Cat(g.getRandomNumFromAToB(4,5),g.getRandomNumFromAToB(35,40), g.getFIO("123")));
                break;
                case 1: units.add(new Human(g.getRandomNumFromAToB(5,6),g.getRandomNumFromAToB(40,50), g.getFIO("123")));
                break;
                case 2: units.add(new Robot(g.getRandomNumFromAToB(2,5),g.getRandomNumFromAToB(45,50), g.getFIO("123")));
                break;
            }

        }
        //проходим все препятствия всеми участниками
        for (Barrier barrier: barriers){
            for (WalkJump unit: units) {
                if (barrier.useBarrier(unit)) {
                    tempUnits.add(unit);
                }
            }
            units.clear();
            units.addAll(tempUnits);
            tempUnits.clear();
        }

        for (WalkJump unit: units) {
            System.out.println(" Участники прошедшие все препятствия  " + unit.getName() + " относится к классу " + unit.getClassName());

        }
    }
}
