package courses;

import java.util.HashMap;
import java.util.Map;

public final class Human {
    private String name;
    private String surname;
    private Map<String,Double> courses = new HashMap<>();

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public void addCourse(String name, Double grade){
        courses.put(name,grade);
    }




    public final void removeCourse (String name){
        courses.remove(name);
    }





    public Double getAverage(){
        double totalAverage = 0.0;

        for(Double grade : courses.values()){
            totalAverage += grade;
        }
        return totalAverage / courses.size();
    }
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

    public Map<String, Double> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, Double> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", courses=" + courses +
                '}';
    }
}
