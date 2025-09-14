package ThirdChallenge;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Book book1 = new Book("Jesus", -1000, "Bible");
        Book book2 = new Book("Jorge", 2011, "How The World Ended That Way");
        Book book3 = new Book("Milton", 3000, "Kill la Kill Vol.3");
        books.add(book1);books.add(book2);books.add(book3);
        System.out.println("\nBook List: ");
        books.forEach(System.out::print);
        System.out.println("--------------------\n");

        System.out.println("Published after 2010:");
        for (Book book : books){
            if (book.getYear() > 2010){
                System.out.println(book);
            }
        }
    }
}
