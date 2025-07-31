package yenigelenlerucun;

public class Main {

    public static void main(String[] args) {
        Mercedes merc = new Mercedes("c200","Black");
        Mercedes merc2 = new Mercedes("c300","White");
        Mercedes[] mercList = {merc,merc2};
        for (int i = 0; i < mercList.length; i++) {
            if(mercList[i].getColor().equals("Black") ) mercList[i].displayInfo();
        }

    }
}
