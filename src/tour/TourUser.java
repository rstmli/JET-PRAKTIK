package tour;

import java.util.ArrayList;
import java.util.List;

public class TourUser {
    private String name;
    private String surname;
    private Integer age;
    private Double balance;

    @Override
    public String toString() {
        return "TourUser{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", balance=" + balance +
                '}';
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public TourUser(String name, String surname, Integer age, Double balance) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.balance = balance;
    }



    public void userAddTour(List<HesderxanlaGez> tours){
        for(HesderxanlaGez t : tours)
            if(balance >= t.getTourPrice()){
                setBalance(getBalance() - t.getTourPrice());
                System.out.println("Tur alindi turun adi: " + t.getTourName() +
                        " turun qiymeti: " + t.getTourPrice() +
                        " qalan balansiniz" + balance);
            }

    }
}
