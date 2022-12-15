package gb.sem1.Level2.les5;

public class ThreadTest {
//Реализовать поочередное обращение к складу, для производителя и покупателя

    public static void main(String[] args) {

        Store store = new Store(0);
        Producer prod = new Producer(store);
        Customer customer = new Customer(store);
        System.out.println("============ запуск потоков");
        Thread t1 = new Thread(prod);
        Thread t2 = new Thread(customer);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("============  завершились потоки");
    }
}

class Store { // склад для товаров
    private int product;
    private int maxProduct = 4;
    private final Object monitor = new Object();

    public Store(int product) {
        this.product = product;

    }

    public void get() {
        synchronized (monitor) {
            while (product <= 0) {
                try {
                    monitor.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            product--;
            System.out.println("Покупатель купил 1 товар");
            System.out.println("Осталось " + product + " товаров");
            monitor.notify(); // освобождаем монитор
        }

    }

    public void put() {
        synchronized (monitor) {
            while (product >= maxProduct) {
                try {
                    monitor.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            product++;
            System.out.println("Производитель положил на склад 1 товар");
            System.out.println("На складе товаров " + product);
            monitor.notify(); // освобождаем монитор
        }
    }
}

class Customer implements Runnable { //покупатель
    private Store store;

    public Customer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 7; i++) {
            store.get();
        }
    }
}

class Producer implements Runnable {//производитель
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            store.put();

        }
    }
}
