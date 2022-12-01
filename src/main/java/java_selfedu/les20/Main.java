package java_selfedu.les20;

import java_selfedu.les20.ex2.Book;
import java_selfedu.les20.ex2.Lib;
import mysolution.GenForClass;

public class Main {
    public static void main(String[] args) {
        GenForClass gen = new GenForClass();
        long m = System.currentTimeMillis();

        Lib lib = new Lib();
        lib.addBook(new Book(gen.getNameOfBook("nps"),gen.getHumanName(),
                1788,gen.getRandomNum(1200)));
        lib.printAllBook();

        for (int i = 0; i <100000 ; i++) {
            lib.addBook(new Book(gen.getNameOfBook("nps"),gen.getHumanName(),
                    gen.getRandomNumFromAToB(1500,2022),gen.getRandomNum(1200)));
        }
        System.out.println((double) (System.currentTimeMillis() - m));
//        System.out.println("INit book end");
////        lib.printAllBook();
//        System.out.println("--------------------------------------------");
//        lib.findBookByAutor(gen.getHumanName());
//        lib.findBookByYear(1788);

    }
}
