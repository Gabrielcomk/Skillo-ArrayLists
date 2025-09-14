package SeventhChallenge;

public class Trip {
private String destiny;
private int durationDays;

    public Trip(int durationDays, String destiny) {
        this.durationDays = durationDays;
        this.destiny = destiny;
    }

    public int getDurationDays() {
        return durationDays;
    }
@Override
    public String toString(){
        return "--------------------" +
                "\nDestiny:" + destiny +
                "\nDuration: " + durationDays + " days.\n";
    }
}
