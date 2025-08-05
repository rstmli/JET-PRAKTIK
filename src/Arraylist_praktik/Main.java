package Arraylist_praktik;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
//        List<String> list = List.of("1","2","3");
//        System.out.println(list);




//        boolean gender = false;
//
//        String genderConvert = gender == true ? "bey" : "xanim";
//
//        System.out.println(genderConvert);













        Human ramazan = new Human("Ramazan",true,25);
        Human akshin = new Human("Akshin",true,27);
        Human huseyn = new Human("Huseyn",true,21);
        Human aytac = new Human("Aytac",false,25);


        ArrayList<Human> humans = new ArrayList<>();
        humans.add(ramazan);
        humans.add(akshin);
        humans.add(huseyn);
        humans.add(aytac);
        String convert;
        for (Human s : humans){
            convert = s.isGender() ? "bey" : "Xanim";
            System.out.println(String.format("adiniz: %s yasiniz: %s cinsiniz: " +
                    "%s",s.getFullName(), s.getAge(), convert));
        }



    }



}
