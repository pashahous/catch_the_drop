package main.java.mysolution.habrtasks;

import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {
//        task1();
        task2();
    }

    static void task1() {
        int[] arrValue = {1, 2, 3, 4, 6};
        int[] arrWeight = {1, 2, 10, 10, 100000};
        GenElementWithWeight gen1 = new GenElementWithWeight(arrValue, arrWeight);
        System.out.println(gen1.getElement());

        GenElementWithWeightTwoSolution gen2 = new GenElementWithWeightTwoSolution(arrValue, arrWeight);
        System.out.println(gen2.getRandomNum());
        int count = 100000;
        Map<Integer, Float> test1 = new HashMap<>();
        Map<Integer, Float> test2 = new HashMap<>();

        for (int i = 0; i < count; i++) {
            int num = gen1.getElement();
            if (!test1.containsKey(num)) {
                test1.put(num, 0f);
            } else {
                test1.put(num, test1.get(num) + 1);
            }
        }
        for (int i = 0; i < count; i++) {
            int num = gen2.getRandomNum();
            if (!test1.containsKey(num)) {
                test2.put(num, 0f);
            } else {
                test2.put(num, test1.get(num) + 1);
            }
        }
        System.out.println("test1");
        for (Map.Entry entry : test1.entrySet()) {
            System.out.println(entry.getKey() + " = " + (float) entry.getValue());
        }
        System.out.println("test2");
        for (Map.Entry entry : test2.entrySet()) {

            System.out.println(entry.getKey() + " = " + (float) entry.getValue());
        }
    }

    static void task2() {
        LinkedList lnk = new LinkedList();
        lnk.add(new Node(1));
        lnk.add(new Node(2));
        lnk.add(new Node(3));
        lnk.add(new Node(5));
        lnk.add(new Node(5));
        System.out.println("Size linked list " + lnk.getSize());
        System.out.println("Index of value = " + lnk.findIndexOfValue(5));
        System.out.println("Index of value = " + lnk.findIndexOfValue(5,2));

        lnk.printAllNodes();

    }

}
