package robot_2025;

public class Main {
    public static void main(String[] args) {
        MyHumanRobot t2000 =  new MyHumanRobot();


        MyDogRobot rex = new MyDogRobot();
        MyFishingRobot akula = new MyFishingRobot();

        DisplayInfo.displayInfo(rex,akula,t2000);
    }
}
