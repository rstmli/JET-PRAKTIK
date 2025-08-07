package Arraylist_praktik;

import java.util.Objects;

public class Human {
    private String fullName;
    private boolean gender;
    private int age;


    @Override
    public int hashCode() {
        return Objects.hash(fullName, gender, age);
    }

    @Override
    public String toString() {
        return "Human{" +
                "fullName='" + fullName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human(String fullName, boolean gender, int age) {
        this.fullName = fullName;
        this.gender = gender;
        this.age = age;
    }
}
