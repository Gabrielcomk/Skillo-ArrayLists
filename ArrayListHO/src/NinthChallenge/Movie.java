package NinthChallenge;

public class Movie {
    private String title;
    private String gender;
    private int rate;

    public Movie(String title, int rate, String gender) {
        this.title = title;
        this.rate = rate;
        this.gender = gender;
    }

    public int getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "--------------------" +
                "\nTitle:" + title +
                "\ngender: " + gender +
                "\nduration: " + rate + "\n";
    }
}
