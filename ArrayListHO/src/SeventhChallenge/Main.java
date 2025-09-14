package SeventhChallenge;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Trip> trips = new ArrayList<>();
        Trip trip1 = new Trip(8, "Brazil");
        Trip trip2 = new Trip(3, "Arctic Monkeys");
        Trip trip3 = new Trip(9, "Japan");
        trips.add(trip1);trips.add(trip2);trips.add(trip3);
        trips.forEach(System.out::println);

        System.out.println("Trips whose duration are higher than 7 days.");
        for(Trip trip : trips){
            if (trip.getDurationDays() > 7){
                System.out.println(trip);
            }
        }
    }
}
