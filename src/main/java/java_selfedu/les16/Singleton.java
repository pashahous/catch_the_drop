package java_selfedu.les16;

public class Singleton {
 private static Singleton singl = null; // создаем статическую переменную для класса
    static {
    }
    Singleton() {
        System.out.println("Class created");
    }
     public static Singleton getInstance(){ // вызываем метод у класса, если его нет то создаем новый класс
        if (singl == null){ // кладем в переменную и возвращаем эту переменную
            singl = new Singleton();
        }
        return singl;
     }

}
