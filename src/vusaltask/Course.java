package vusaltask;

public class Course {
    private String name;
    private Integer grade;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Course(String name, Integer grade) {
        this.name = name;
        this.grade = grade;
    }
}
