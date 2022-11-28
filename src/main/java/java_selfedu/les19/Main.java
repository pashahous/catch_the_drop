package java_selfedu.les19;

import gb.sem1.les6.GenForClass;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Object> arrStatinery = new ArrayList<>();
//        Pen p1 = new Pen();
//        Pen p2 = new Pen(123,true,"falos",5,"yellow");
//        Pen p3 = new Pen(444,true,"steel",4,"red");
//        Pen p4 = new Pen(5555,true,"first",7,"green");
//        Pen p5 = new Pen(555,true,"klassik",9,"red");
//
//        Pensil e1 = new Pensil(666,true,"prostoi",4,"red");
//        Pensil e2 = new Pensil(777,false,"myagkii",5,"black");
//        Pensil e3 = new Pensil(999,true,"jeltui",8,"white");
//        Pensil e4 = new Pensil(102,true,"krugkui",1,"pink");
        Stationery obj = null;
        for (int i = 0; i < 20; i++) {
            switch (random.nextInt(4)) {
                case 0:
                    obj = new Pen();
                    break;
                case 1:
                    obj = new Pen(random.nextInt(1000), random.nextBoolean(), GenForClass.getPencikType(),
                            random.nextInt(20), GenForClass.getColor());
                    break;
                case 2:
                    obj = new Pensil();
                    break;
                case 3:
                    obj = new Pensil(random.nextInt(1000), random.nextBoolean(), GenForClass.getPencikType(),
                            random.nextInt(20), GenForClass.getColor());
                    break;
            }
            arrStatinery.add(obj);
        }
        System.out.println("заполнение массива объектами Stationary завершено");

        for (Object stat : arrStatinery) {
            if (stat instanceof Pen) ((Pen) stat).displayPen();
            else if (stat instanceof Pensil) {
                ((Pensil) stat).displayPencil();
            }

        }
    }

}
