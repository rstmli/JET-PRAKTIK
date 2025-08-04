package robot_2025;

public class MyHumanRobot implements RobotRunning, RobotTalking, RobotSwimming {

    @Override
    public void run() {
        System.out.println("Insan gezir");
    }


    @Override
    public void talk() {
        System.out.println("Insan danisir");
    }

    @Override
    public void swimm() {
        System.out.println("insan uzur");
    }
}
