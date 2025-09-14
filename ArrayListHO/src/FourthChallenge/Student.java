package FourthChallenge;

public class Student {
    private String name;
    private float grade1;
    private float grade2;
    private float grade3;

    public Student(String name, float grade1, float grade2, float grade3) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public float getAverage() {
        return ((grade1 + grade2 + grade3) / 3);
    }

    @Override
    public String toString() {
        return "--------------------" +
                "\nName: " + name +
                "\nGrade 1: " + grade1 +
                "\nGrade 2: " + grade2 +
                "\nGrade 3: " + grade3 +
                "\nAverage: " + getAverage();
    }
}
