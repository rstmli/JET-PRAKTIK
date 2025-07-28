package jetOop;

public class Customer {
    private String id; // 4Sd123
    private String name;
    private String surname;
    private double wallet;

    public Customer(String id, String name, String surname, double wallet) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.wallet = wallet;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public Customer() {
    }



}
