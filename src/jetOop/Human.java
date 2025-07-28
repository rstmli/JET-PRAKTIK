package jetOop;

public class Human {
    public void salamla(String name, String surname, String gender, int age) {
        String genderSearch = "";
        if(gender.equals("male")) genderSearch = "kishi";
        else if (gender.equals("female")) genderSearch = "xanim";
        else {
            System.out.println("cinsinizi duzhun daxil edin");
        }
        System.out.println(String.format("adiniz: %s soyadiniz: %s cinsiniz: %s tevelludunuz: %s",name,surname,genderSearch,2025-age));
    }

    public static void main(String[] args) {
        Human obj = new Human();
        obj.salamla("Taleh","Aghayev","male",34);
    }
}
// ad soy ad  gender yas
// salam ad soyad gender cins kisidirse bey qadindirsa xanim
// siz tevellud



