package mysolution.threads;

import java.util.Random;

/*Условие задачи. Пользователь вводит с клавиатуры значение в массив. После чего запускаются два потока. Первый поток
 находит максимум в массиве, второй — минимум. Результаты вычислений возвращаются в метод main().

Решение. Данная задача решается с объявлением одного класса, в котором реализованы одновременно поиск минимального и
максимального элемента массива. По желанию, можно реализовать два отдельных класса, которые будут определять
соответствующие потоки.*/
class ThreadsArrays implements Runnable {
    private int[] array;
    private Thread tr;
    private int min;
    private int max;

    public ThreadsArrays(int[] _array) {
        this.array = _array;
        this.tr = new Thread(this);
        this.tr.start();

    }

    public int getMin() {
        return min;
    }

    public Thread getThr(){
        return this.tr;
    }

    public int getMax() {
        return this.max;
    }

    @Override
    public void run() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(this.tr.getName() + "  " + i + "   " + System.nanoTime());
            if (min > array[i]) min = array[i];
            if (max < array[i] ) max = array[i];
        }
        System.out.println("End  " + this.tr.getName() + "  " + System.nanoTime());

    }

}

class TestThread {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] testArray = new int[100];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = rnd.nextInt(100) -200;
        }
        ThreadsArrays t1 = new ThreadsArrays(testArray);
        ThreadsArrays t2 = new ThreadsArrays(testArray);

        try {
            t1.getThr().join();
            t2.getThr().join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("max " + t1.getMax()+ " " + t1.getThr().getName());
        System.out.println("min "+ t2.getMin()+" "+ t2.getThr().getName());
    }

}
