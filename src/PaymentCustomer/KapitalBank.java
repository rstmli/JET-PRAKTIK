package PaymentCustomer;

public class KapitalBank implements Payment{
    @Override
    public String pay() {
        return "kapital bank";
    }
}
