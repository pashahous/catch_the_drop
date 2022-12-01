package java_selfedu.les20.ex2;

import java.util.ArrayList;
import java.util.Map;

public final class Lib {

    private ArrayList<Book> arrBook;

    public Lib() {
        this.arrBook = new ArrayList<>(100);
    }

    public void addBook(Book book) {
        arrBook.add(book);
//        System.out.println("Book " + book + "добавлена в библиотеку");

    }

    public void deleteBook(Book book) {
        arrBook.remove(book);
        System.out.println("Book " + book + "удалена из библиотеки");
    }
    public void printAllBook(){
        for (Book book: arrBook ) {
            System.out.printf("Книга: %s Автор: %s Год: %s Цена: %s \n",book.getName(),book.getAutor(),book.getPrice(),
                    book.getPrice());
        }
    }

    public void findBookByAutor(String autor){
        System.out.println("Find autor by name " + autor);
            ArrayList<Book> bookByAutor = new ArrayList<>();
        for (Book book:this.arrBook) {
            if(autor.equals(book.getAutor())){
                bookByAutor.add(book);
            }
        }
        // вывод инфы, можно ретерном вернуть свормированный список
        for (Book book: bookByAutor ) {
            System.out.println("================================================================");
            System.out.printf("Книга: %s Автор: %s Год: %s Цена: %s \n",book.getName(),book.getAutor(),book.getPrice(),
                    book.getPrice());
        }
//        return bookByAutor

    }
    public void findBookByYear(Integer year){
        System.out.println("Find autor by year " + year);
        ArrayList<Book> bookByYear = new ArrayList<>();
        for (Book book:this.arrBook) {
            if(year.equals(book.getYear())){
                bookByYear.add(book);
            }
        }
        for (Book book: bookByYear ) {
            System.out.printf("Книга: %s Автор: %s Год: %s Цена: %s \n",book.getName(),book.getAutor(),book.getYear(),
                    book.getPrice());

        }
        if (bookByYear.size() == 0) System.out.println("Книг по данному году не найдено не найдено");
    }

}
