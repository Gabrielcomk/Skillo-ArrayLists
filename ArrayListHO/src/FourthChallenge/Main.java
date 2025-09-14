package FourthChallenge;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
ArrayList<Student> students = new ArrayList<>();
Student student1 = new Student("Zé", 5, 8, 8);
Student student2 = new Student("Ingrid", 3, 6, 9);
Student student3 = new Student("Gabriel", 1, 4, 10);
students.add(student1);students.add(student2);students.add(student3);
        System.out.println("\nStudent List: ");
        students.forEach(System.out::print);
        System.out.println("--------------------\n");

        System.out.println("Students that passed:\n");
        for(Student student : students){
            if (student.getAverage() >= 7){
                System.out.println(student);
            }
        }
    }
}
