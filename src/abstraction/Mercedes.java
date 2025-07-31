package abstraction;

public class Mercedes extends CarAbstract{
    @Override
    public void color() {
        System.out.println("metallic ");
    }

    @Override
    public void model() {
        System.out.println("c200");
    }

    @Override
    public void marka() {
        System.out.println("Mercedes");
    }

    public void displayInfo(){
        System.out.print("marka: "); marka();
        System.out.print("model: "); model();
        System.out.print("color: "); color();
    }
}
