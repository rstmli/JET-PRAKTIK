package JET.polimorphism;

public class CrediCartPayment extends Payment{
    @Override
    public void pay() {
        System.out.println("odenis credit karti ile edildi. :)");
    }
}
