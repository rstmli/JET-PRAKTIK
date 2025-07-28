package JET;

import java.util.Scanner;

public class JetAcademy {
    public String name;
    public JetAcademy(String name) {
        this.name = name;
        System.out.println(name);
    }

    public static void main(String[] args) {
        // riyazi , serti
        // > < ==, <=
        // =, ==
        // camel case =  firstName
        // pascal
//        Scanner.
//        Random rd = new Random();
//        var otp = rd.nextInt(1, 999999999);
//        var c = String.format("AZ%09d", otp);
//        String salam = "Hello %s";
//        String c = String.format("Aytac %s",salam);
//        System.out.println(salam);
        // if else
        // AZ0515125125

        /*
        istifadecinin atasinin adini alin
        istifadecinin oz adini alin
        istifadecinin yasini alin
        istifadecinin atasinin yasini alin
        chapda yazsin "hormetli Flankes siz ataniz ata_adi-dan n yas kiciksiniz"
         */

        // startsWith("N");
//        String helloMessage = "Salam.";
//        boolean a = helloMessage.endsWith(".");
//        System.out.println(a);
        // subString();
        // System.out.println(a.substring(0,1));
        // RamAzAn RAmAmzan ramazan

        // toLowerCase;
        // toUpperCase;
        // split
        // replace


        // random yaranan ededle
        ;


//        String name = "Ramazan";
//
//        System.out.println(String.format("Salam %s",name));

//        String name = "MEHMAN"; &&
// toLoweCase, toUpperCase, equals, length, charAt, subString, startWith,


//        String nameOne = "RaMazan";
//        for (int i = 0;i<nameOne.length();i++){
//            String nameLower = nameOne.toLowerCase();
//            if (nameLower.charAt(i) != 'r' && nameLower.charAt(i) != 'a'&& nameLower.charAt(i) != 'm'){
//                System.out.println(nameOne.charAt(i));
//            }
//        }











        /*
        LOOP
         */

//        for (int i = 0;i<=5;i++){
//
//        }






//        String a = "Akshin";
//        for(int b = 0; b< a.length();b++){
//            System.out.print(a.charAt(b));
//        }








//        char b = a.charAt(5);
//        System.out.println(b);

























        // toLoweCase, toUpperCase, equals, length, charAt, subString, startWith,
        // length - Her hansisa bir String deyerin uzunlugunu yazdirir
        // charAt - verdiyimiz index nomresine gore metindeki hemen indexe beraber gelen herfi charateri qaytarir
        // toLowerCase - metindeki butun characterleri kicik herfe cevirir
        // toUpperCase - metindeki butun characterleri boyuk herfe cevirir
        // equals - metindeki charaterlerin bir birine beraber olub olmadigini yoxalyir
        // length - her hansisa metnin uzunlugunu qaytarir
        // charAt - metindeki teyin etdiyimiz indexdeki characteri qaytarir
        // subString - metindeki deyerleri teyin etdiyimiz baslama ve bitme indexine gore qaytarir ve verdiyimiz indexlerin xaricinde qalan characterleri ignore edir
        // StartWith - metinin hansi herfle basladigini yoxlayir









        // rus ruleti app
        /*
        int texminhaki = 10;
        texmin sayi teyin edin
        daha sonra while ile dongu acin ve shhhhhhhhhhhhhhhert olaraq texmin sayinin 0 dan boyuk oldugu halda islemeyini teyin edin

         */









        Scanner sc = new Scanner(System.in);// scannerin obyekti yaranib
//        int vahid = 0;
//        for(int i = sc.nextInt();i>0;i = i /10){
//            vahid = i%10;
//            if(vahid != 5){
//                System.out.print(vahid);
//            }
//        }















        /*
        Random random = new Random(); // random obyetkini yaradiriq
        Scanner sc = new Scanner(System.in);// scannerin obyekti yaranib
        int randomNumber = random.nextInt(1,7);// random 1-7-e qeder olan bir eded yaradir
        int heal = 3; // istifadeciye n qeder texmin haqqi teyin edirik
        while (heal>0){ // yoxlayiriq ki texmin haqqi 0 dan boyukdur mu?
            int guessNumber = sc.nextInt(); // istifadeciden texminini aliriq
            if (randomNumber == guessNumber){ // yaranmis random eded ile bizim texmin etdiyimiz ededin bir biri ile muqaise edir
                System.out.println("Siz qazandiniz"); // eger beraberdirse ekrana qazandiniz mesajini cixarir
                break; // bu setre qeder oxu daha sonra cix.
            }else { // yuxardaki sert odenmese isleyecek blok
                heal--; // cani azaldir
                if(heal==0){ // canin - a beraber oldugunu yoxlayiriq
                    System.out.println("siz uduzdunuz"); // ekrana qazandiniz mesajini chap edir.
                    break; // while loopdan cixir
                }
                System.out.println(String.format("siz yanlis texmin etdiniz qalan haqqiniz %s",heal)); // eger can 0-a beraber deyilse qalan haqqi gosterir
            }



        }



        for(int a = 4; a>=0;a/10){ 4 3 2 1 0
        sout(name.chartAt(a);
        }
        c
        a
        t
        y
        a













        */













//        String name = sc.nextLine();// index uzunluk = 7 length = 8
//        for(int i =0 ;i<name.length();i++){
//            System.out.print(i +"" +name.charAt(i) + " ");
//        }





//
//        Integer[] a = new Integer[5];
//        a[0] = 13;
//        a[1] = 2;
//        a[2] = 3;
//        a[3] = 4;
//        a[4] = 6;
//        int[] b = new int[a.length];
//        int[] c = new int[a.length];
//        for (int i = 0; i< a.length;i++){
//            if(a[i]%2==0){
//                b[i] = a[i];
////                System.out.println(a[i]);
//            }else {
//                c[i] = a[i];
////                System.out.println(a[i]);
//            }
//
//
//        }
//        System.out.println("cut ededlerin sayi");
//        System.out.println("cut ededler");
//        for (int i : b) {
//            if(i>0){
//                System.out.println(i);
//
//            }
//        }
//
//        System.out.println("tek ededler");
//        for (int i : c) {
//            if(i>0){
//                System.out.println(i);
//
//            }
//        }





























































    }
}