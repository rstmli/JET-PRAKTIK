package tour;

import java.util.List;

public class HesderxanlaGez{
    private String tourName;
    private String guid;
    private TourCategory category;
    private Double tourPrice;




    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public TourCategory getCategory() {
        return category;
    }

    public void setCategory(TourCategory category) {
        this.category = category;
    }

    public Double getTourPrice() {
        return tourPrice;
    }

    public void setTourPrice(Double tourPrice) {
        this.tourPrice = tourPrice;
    }

    public HesderxanlaGez(String tourName, String guid, TourCategory category, Double tourPrice) {
        this.tourName = tourName;
        this.guid = guid;
        this.category = category;
        this.tourPrice = tourPrice;
    }
}
