package Arraylist_praktik;

import java.util.*;

public class TalehMain {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//
//        String nameFormat = ilkAdBoyuducu(name.toLowerCase());
//        System.out.println(nameFormat);
//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(3);
//        myList.add(4);
//        myList.add(5);
//        myList.add(6);
//        myList.add(6);
//        myList.add(1);
//
//        Set<Integer> gorulen = new HashSet<>();
//        Set<Integer> tekrarlananElementler = new HashSet<>();
//
//        for (Integer reqem : myList){
//            if(!gorulen.add(reqem)){
//                tekrarlananElementler.add(reqem);
//            }
//        }
//        System.out.println(gorulen);
//        System.out.println(tekrarlananElementler);

        HashSet<Integer> ilkSet = new HashSet<>();
        Collection<Integer> hersey = new LinkedHashSet<>();
        Set<Integer> ikinciSet = new HashSet<>();
        ilkSet.add(1);
        ilkSet.add(12);
        ilkSet.add(13);
        ilkSet.add(14);
        ikinciSet.add(1);
        ikinciSet.add(12);
        ikinciSet.add(41);
        ikinciSet.add(20);
        ilkSet.retainAll(ikinciSet); // !ilkSet.contains(1) ilkSet.remove(1);
        System.out.println(ilkSet);

    }


    public static  String ilkAdBoyuducu(String name){
        return name.substring(0,1).toUpperCase() + name.substring(1);



    }
}
