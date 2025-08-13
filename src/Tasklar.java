import java.util.Arrays;
import java.util.Scanner;

public class Tasklar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int duz = sc.nextInt();
//        duzHesablama(duz);
        int[] arr = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        for(int num : arr){
            num *=2;
            System.out.println(num);
        }
        System.out.println(        Arrays.equals(arr,arr2));
    }

    public static String duzHesablama(float duz){
        float netice  = (duz / 100) * 20;
        return "duz cavab" + duz + " bal: " + netice;
    }
}
