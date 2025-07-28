package inhertense;

import java.util.Arrays;

public class Parrent {
    private  String name;
    private  String surname;
    private  int age;
    private  Child[] children; // has a

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Child[] getChildren() {
        return children;
    }

    public void setChildren(Child[] children) {
        this.children = children;
    }

    public Parrent(String name, String surname, int age, Child[] children) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.children = children;
    }

    @Override
    public String toString() {
        return "Parrent{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", children=" + Arrays.toString(children) +
                '}';
    }
}
