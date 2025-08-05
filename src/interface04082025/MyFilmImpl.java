package interface04082025;

import java.time.LocalDate;
import java.util.Arrays;

public class MyFilmImpl implements MyFilm{

    private String name;
    private String[] category;
    private LocalDate year;
    @Override
    public String name() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "MyFilmImpl{" +
                "name='" + name + '\'' +
                ", category=" + Arrays.toString(category) +
                ", year=" + year +
                '}';
    }

    public void setCategory(String[] category) {
        this.category = category;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    @Override
    public String[] category() {
        return category;
    }

    @Override
    public LocalDate year() {
        return year;
    }

    public MyFilmImpl(String name, String[] category, LocalDate year) {
        this.name = name;
        this.category = category;
        this.year = year;
    }

}
