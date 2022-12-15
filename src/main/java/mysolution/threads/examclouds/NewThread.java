package mysolution.threads.examclouds;
/*
* 1. Создать класс расширяющий Thread
Создать класс NewThread расширяющий Thread.
Переопределить метод run(). В цикле for вывести на консоль символ 100 раз.
Создать экземпляр класса и запустить новый поток.
* */

public class NewThread extends Thread {
    private int numOfPrintNumbers;
    private long sleepTime; // milliseconds

    public NewThread(int numOfPrintNumbers, int sleepTime) {
        this.numOfPrintNumbers = numOfPrintNumbers;
        this.sleepTime = sleepTime;
    }

    public NewThread(int numOfPrintNumbers) {
        this.numOfPrintNumbers = numOfPrintNumbers;
        this.sleepTime = 0;
    }

    @Override
    public void run() {
        for (int i = 0; i < this.numOfPrintNumbers; i++) {
            System.out.println("Thread: " + Thread.currentThread().getId() + "  num = " + i);
            try {
                Thread.sleep(this.sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class Task1{
    public static void main(String[] args) {
        NewThread nt1 = new NewThread(10);
        NewThread nt2 = new NewThread(10);
        nt1.start();
        nt2.start();
    }
}
