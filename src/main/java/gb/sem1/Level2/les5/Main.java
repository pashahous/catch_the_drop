package gb.sem1.Level2.les5;

import java.util.Scanner;

public class Main {
    static final int SIZE = 10_000_000;
    static final int h = SIZE / 2;


    public static void main(String[] args) {
        float[] arr = new float[SIZE];
        metod1(arr);
        metod2(arr);
        metod3(arr);

    }

    public static void metod1(float[] inpArr) {
        System.out.println("metod1");
        for (int i = 0; i < inpArr.length; i++) {
            inpArr[i] = 1;
        }
        long a1 = System.nanoTime();
        for (int i = 0; i < inpArr.length; i++) {
            inpArr[i] = (float) (inpArr[i] * Math.sin(0.2f + i / 5.0) * Math.cos(0.2f + i / 5.0) * Math.cos(0.4f + i / 2.0));
        }
        System.out.println(System.nanoTime() - a1);
    }

    public static void metod2(float[] inpArr) {
        System.out.println("metod2");
        for (int i = 0; i < inpArr.length; i++) {
            inpArr[i] = 1;
        }
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];
        long a1Start = System.nanoTime();
        System.arraycopy(inpArr, 0, arr1, 0, h);
        System.arraycopy(inpArr, h, arr2, 0, h);
        long a1End = System.nanoTime() - a1Start;

        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < h; i++) {
                arr1[i] = (float) (arr1[i] * Math.sin(0.2f + i / 5.0) * Math.cos(0.2f + i / 5.0) * Math.cos(0.4f + i / 2.0));
            }
        });
        Thread t2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < h; i++) {
                arr2[i] = (float) (arr1[i] * Math.sin(0.2f + i / 5.0) * Math.cos(0.2f + i / 5.0) * Math.cos(0.4f + i / 2.0));
            }
        });

        long a2Start = System.nanoTime();
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long a2End = System.nanoTime() - a2Start;

        long a3Start = System.nanoTime();
        System.arraycopy(arr1, 0, inpArr, 0, h);
        System.arraycopy(arr2, 0, inpArr, h, h);
        long a3End = System.nanoTime() - a3Start;
        System.out.printf("Time to split array = %d \nTime to calculate = %d\n Time to merge =  %d\n", a1End, a2End, a3End);
    }

    public static void metod3(float[] inpArr) {
        //реализация Димы
        System.out.println("metod3");
        for (int i = 0; i < inpArr.length; i++) {
            inpArr[i] = 1;
        }

        float[] arr1 = new float[h];
        float[] arr2 = new float[h];
        long a1Start = System.nanoTime();
        System.arraycopy(inpArr, 0, arr1, 0, h);
        System.arraycopy(inpArr, h, arr2, 0, h);

        synchronized (arr1) {
            System.out.println(Thread.currentThread().getName());
            calculateIndx(arr1);

        }
        synchronized (arr2) {
            System.out.println(Thread.currentThread().getName());
            calculateIndx(arr2);

        }
        System.arraycopy(arr1, 0, inpArr, 0, h);
        System.arraycopy(arr2, 0, inpArr, h, h);
        System.out.println("TIme to calculate =" + (System.nanoTime() - a1Start));
    }

    public static void calculateIndx(float[] arr) {
        // metod for calculate value of index
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5.0) * Math.cos(0.2f + i / 5.0) * Math.cos(0.4f + i / 2.0));
        }
    }
}
