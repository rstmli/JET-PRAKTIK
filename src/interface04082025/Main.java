package interface04082025;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Detective[] detective = {
                new FingerPrint(),
                new FootPrint(),
                new HairSample(),
                new BloodSample()
        };

//        for (int i = 0; i < detective.length; i++) {
//            detective[i].analyze();
//        }


        for(Detective e : detective ){
            System.out.println(e);
        }

    }
}
