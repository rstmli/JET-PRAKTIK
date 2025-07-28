package inhertense;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Boolean gender = sc.nextBoolean();
        String genderValue = gender ? "bey" : "xanim";
        String text = String.format("Salam %s xos geldiniz",genderValue);
        System.out.println(text);














        String day = "3";
        switch (day){
            case "3" :
                System.out.println("bugun ucuncu gundur");
                break;
            case "2" :
                System.out.println("Bugun 2-ci gundur");
                break;

            default:
                System.out.println("gun taninmadi");
        }


    }
}
