package streamdma;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
// git add .
//git commit -m"20.08.25"
// git push
public class Main {
    public static void main(String[] args) {
        Random rand = new Random(10);
        int skip = rand.nextInt(10);
        System.out.println(skip);
//        int limit = rand.nextInt(2,3);
//        List<String> box = Arrays.asList("Red","Yellow","Gray","Green","Purple");


//        List<String> lists =  Arrays.asList("Togrul","Nergiz",
//                "Aytac","Akshin","Vusal","Togrul","Ramazan","Akshin","Vusal");//"Togrul","Nergiz",
                //"Aytac","Akshin","Vusal","Togrul","Ramazan","Akshin","Vusal");
        // filter adinin uzunlugu 5 den boyuk olanlar
        // tekrarlari silirik
        // map ile adlarini boyuduruk
        // sorted edirik
        // tolist ceviririk
        // chapa yaziriq









//        lists.stream().skip(skip).limit(limit).toList().forEach(System.out::println);







//        List<Integer> intBox = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13
//                ,14,15,16,0,40,90,60,50,49);
//
//        intBox.stream().filter((e) -> e > 20).map((e) -> e + 20).toList().forEach(System.out::println);
    }

}
