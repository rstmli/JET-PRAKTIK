package vusaltask;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Student vusal = new Student("Vusal");

        List<Course> coruses = new ArrayList<>();
        Course atl = new Course("Java",51);
        Course jet = new Course("Python",50);
        coruses.add(atl);
        coruses.add(jet);
        vusal.setCourse(coruses);



    }
}
