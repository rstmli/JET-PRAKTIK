package courses;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
//        Human ramazan =  new Human("Ramazan","Tinatiyev");
//
//        ramazan.addCourse("Java",100.0);
//        ramazan.addCourse("JavaScript",80.0);
//        System.out.println(ramazan.getAverage());
//        Human taleh = new Human("Taleh","Aghayev");
//        ramazan.removeCourse("c++");
//
//        System.out.println(ramazan);


        Map<String, Integer> maps = new HashMap<>();
        maps.put("Name", 1);
        maps.put("surname", 2);
        System.out.println(maps.getOrDefault("Hesderxan", 3));
        System.out.println(maps);










/*
aytac
duz cavab -  9
ramazan
duz cavab 6
nergiz
duz cavab 1
togrul
duz cavab - 13
taleh
duz cavab 10
vusal
duz cavab 7
 */













        Integer a = 5;
        Integer b = 5;
        System.out.println(a.equals(b)); // == ferqli obyektlerin bir birine beraber oldugunu yoxlamir
    }}