package ThirdChallenge;

public class Book {
    private String title;
     private String author;
     private int year;

    public Book(String author, int year, String title) {
        this.author = author;
        this.year = year;
        this.title = title;
    }

    public int getYear() {
        return year;
    }

@Override
    public String toString(){
        return "--------------------" +
                "\nTitle:" + title +
                "\nAuthor: " + author +
                "\nYear: " + year + "\n";
    }
}
