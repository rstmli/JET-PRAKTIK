package tour;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HesderxanlaGez hesderxanlaGez = new HesderxanlaGez("Hesderxanla gez","Huseyn",TourCategory.CULTURAL,500.0) ;
        HesderxanlaGez huseynTurizim = new HesderxanlaGez("Huseyn Turu","Huseyn",TourCategory.SEA,6000.0) ;
        TourUser taleh = new TourUser("Taleh","Aghayev",35,5000.0);
        List<HesderxanlaGez> lists = List.of(hesderxanlaGez,huseynTurizim);
        taleh.userAddTour(lists);

    }
}
