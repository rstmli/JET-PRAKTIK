package talehetask;
import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        System.out.println( nameOneLetterUpperCase("                    nergiz             "));
//        Function<String,String> nameConverter = (name) -> nameOneLetterUpperCase(name);
//        System.out.println(nameConverter.apply("    nergiz             "));


        List<Integer> ballar = Arrays.asList(1,2,3,4,5,6,7,51,52,53,55);
        Map<Integer,Boolean> myMaps = new HashMap<>();


        for(Integer s : ballar){
            boolean f = s> 50;
            if(f){
                System.out.println(s+ " " +f);
            }
            myMaps.put(s,f);

        }
        System.out.println(myMaps);

    }
    public static String nameOneLetterUpperCase(String name){
        return name.trim().substring(0,1).toUpperCase() + name.trim().substring(1);
    }
}















