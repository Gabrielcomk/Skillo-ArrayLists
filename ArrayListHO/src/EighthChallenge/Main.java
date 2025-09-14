package EighthChallenge;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
ArrayList<Revenue> revenues = new ArrayList<>();
Revenue revenue1 = new Revenue("Hotdog", 2);
        Revenue revenue2 = new Revenue("Macarronada", 19);
        Revenue revenue3 = new Revenue("Red Velvet Cake", 120);
        revenues.add(revenue1);revenues.add(revenue2);revenues.add(revenue3);
        revenues.forEach(System.out::println);
        System.out.println("Revenue whose preparation time is lesser than 20 mins:");
        for(Revenue revenue : revenues){
            if (revenue.getPreparationTime() < 20){
                System.out.println(revenue);
            }
        }
    }
}
