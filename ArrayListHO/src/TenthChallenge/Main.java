package TenthChallenge;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
ArrayList<Athlete> athletes = new ArrayList<>();
Athlete athlete1 = new Athlete("M. Jordan", "Basketball", 7.5f);
        Athlete athlete2 = new Athlete("Elias", "Basketball", 3.5f);
        Athlete athlete3 = new Athlete("Donald", "Basketball", 6.5f);
        athletes.add(athlete1);athletes.add(athlete2);athletes.add(athlete3);
        athletes.forEach(System.out::println);

        System.out.println("Athlete which the highest score: ");
        Athlete highestScore = athletes.stream()
                .max((a1, a2) -> Float.compare(a1.getScore(), a2.getScore()))
                .orElse(null);
        System.out.print(highestScore);

    }
}
