package JET.polimorphism;

public class OnlinePayment extends Payment{
    @Override
    public void pay() {
        System.out.println("odenis online sekilde edildi. :)");
    }
}
