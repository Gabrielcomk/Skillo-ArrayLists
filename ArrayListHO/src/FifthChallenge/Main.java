package FifthChallenge;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
ArrayList<Car> kars = new ArrayList<>();
       Car car1 = new Car("Ultimate Life Form", 1990, "Divine");
        Car car2 = new Car("Thompson", 2000, "Black");
        Car car3 = new Car("Zeppeli", 2030, "Yellow");
        Car car4 = new Car("Requiem", 2060, "Red");
        kars.add(car1);kars.add(car2);kars.add(car3);kars.add(car4);
        kars.forEach(System.out::println);
        System.out.println("--------------------\n");
        System.out.println("Red cars:");
        for(Car car : kars){
            if(car.getColor() == "Red"){
                System.out.println(car);
            }
        }
    }
}
