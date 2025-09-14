package NinthChallenge;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
ArrayList<Movie> movies = new ArrayList<>();
Movie movie1 = new Movie("It's raining man", 3, "Comedy");
        Movie movie2 = new Movie("Para sempre seu", 4, "Romance");
        Movie movie3 = new Movie("Titanic", 9, "Drama");
        movies.add(movie1);movies.add(movie2);movies.add(movie3);
        movies.forEach(System.out::println);

        System.out.println("Movies whose rate are higher than 8: ");
        for(Movie movie : movies){
            if(movie.getRate() > 8){
                System.out.println(movie);
            }
        }
    }
}
