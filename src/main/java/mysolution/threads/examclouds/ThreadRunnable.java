package mysolution.threads.examclouds;

import java.util.ArrayList;
import java.util.List;

public class ThreadRunnable implements Runnable {
    private final int numOfPrintNumbers;
    Thread tr;


    public ThreadRunnable(int numOfPrintNumbers) {
        this.numOfPrintNumbers = numOfPrintNumbers;
        tr = new Thread(this);
//        this.tr.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < this.numOfPrintNumbers; i++) {
            if( i % 10 == 0)
            System.out.println(Thread.currentThread().getName() + "  = " + i);
        }
    }

    public void startThread(){
        this.tr.start();
    }

}

class Task2{
    public static void main(String[] args) {
        List<ThreadRunnable> listThread = new ArrayList<>();
        for (int i = 0; i < 5000; i++) {
           listThread.add(new ThreadRunnable(500));
        }
        for (ThreadRunnable tr: listThread ) {
            tr.startThread();

        }


    }
}
