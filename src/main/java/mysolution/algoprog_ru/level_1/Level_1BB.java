package mysolution.algoprog_ru.level_1;

import java.util.Scanner;

public class Level_1BB {
    public static void main(String[] args) {
//        System.out.println(desks(new int[]{20,21,22}));
//        System.out.println(nextEvenNumber(7));
//        System.out.println(nextEvenNumber(8));

    }

    public static int desks(int[] ints) {
        // задача про три класса учеников и сколько минимум парт надо для них
        int n1 = ints[0];
        int n2 = ints[1];
        int n3 = ints[2];


        return ++n1 / 2 + ++n2 / 2 + ++n3 / 2;
    }

    public static int nextEvenNumber(int n) {
        // следующее четное число
        return (n + 2) - n % 2;
    }


}
