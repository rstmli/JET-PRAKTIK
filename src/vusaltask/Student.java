package vusaltask;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Course> course = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }
}
