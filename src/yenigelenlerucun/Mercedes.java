package yenigelenlerucun;

public class Mercedes extends Car{
   private String model;
   private String color;

    public Mercedes(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public void model(String model) {
        System.out.println("model: " + model);
    }

    @Override
    public void color(String color) {
        System.out.println("color: " + color);
    }


    public String getColor() {
        return color;
    }

    @Override
    public void displayInfo() {
        model(this.model);
        color(this.color);
    }
}
