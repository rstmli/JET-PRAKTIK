package steack_heap;

import java.util.Objects;

public class Human
{
    private String name;
    private String surname;
    private Integer age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o){
        if(o == null || getClass() != o.getClass()) return false;
        Human h = (Human) o;
        return Objects.equals(name,h.name) && Objects.equals(surname,h.surname) && Objects.equals(age,h.age);
    }




    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
