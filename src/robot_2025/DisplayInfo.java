package robot_2025;

public class DisplayInfo {
    public static void displayInfo(MyDogRobot myDogRobot, MyFishingRobot myFishingRobot, MyHumanRobot myHumanRobot){
        System.out.println("baliqin xususiyyetleri");
        myFishingRobot.swimm();
        System.out.println("itin xususiyyetleri");
        myDogRobot.run();
        System.out.println("insanin xususiyyetleri");
        myHumanRobot.swimm();
        myHumanRobot.talk();
        myHumanRobot.run();

    }
}
