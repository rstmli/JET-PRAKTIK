package faizhesablama;

import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("mehsulun meblegini daxil edin -> ");
            float num = sc.nextFloat();
            System.out.print("endirimin faizini daxil edin -> ");
            int percentage  = sc.nextInt();
            System.out.println(faizHesabla(num,percentage));
        }
    }


    public static String faizHesabla(float num, int percentage){

        if(percentage > 100){
            return "faiz 100 den boyuk ola bilmez. :)";
        }
        return "mebleg: "+ num + " endirim olunan mebleg: "  + (num / 100) * percentage + " son mebleg: "  + (num - (num / 100) * percentage) ;
    }
}
