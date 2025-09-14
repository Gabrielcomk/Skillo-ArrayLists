package FifthChallenge;

public class Car {
    private String model;
    private int year;
    private String color;

    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getColor() {
        return color;
    }
@Override
    public String toString(){
        return "--------------------" +
                "\nModel:" + model +
                "\nYear: " + year +
                "\nColor: " + color;
    }

}
