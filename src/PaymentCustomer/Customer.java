package PaymentCustomer;

public class Customer {
    private String id;
    private String username;
    private double balance;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer(String id, String username, double balance) {
        this.id = id;
        this.username = username;
        this.balance = balance;
    }
}
