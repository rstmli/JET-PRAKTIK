package PaymentCustomer;

public class Main {

    public static void main(String[] args) {
        Shop saat = new Shop("Saat",1000);
        Shop telephone = new Shop("Iphone 16",3000);
        Customer taleh = new Customer("AZ123","taleh123",10_000);
        KapitalBank bank = new KapitalBank();

        taleh.setBalance(taleh.getBalance() - saat.getPrice());
        taleh.setBalance(taleh.getBalance() - telephone.getPrice());
        System.out.println("yeni balans " + taleh.getBalance());
    }

}







