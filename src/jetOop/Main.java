package jetOop;

public class Main {
    public static void main(String[] args) {
        var huseyn = new Customer("AZ01","Huseyn","Rustemli",15000.50);
        String huseynInfo = String.format("salam %s %s sizin balansiniz: %s",huseyn.getName(),huseyn.getSurname(),huseyn.getWallet());
        System.out.println(huseynInfo);
        double chanta = 50.50;
        huseyn.setWallet(huseyn.getWallet() - chanta);
        System.out.println(String.format("salam %s sizin balansinizdan %s" +
                " qeder mebleg cixildi guncel mebleg %s",huseyn.getName(),chanta,huseyn.getWallet()) );



    }

}

// Constructor = classin obyekti yaranan
// zaman ilk ise dusen methoddur
// xususiyyetleri = cagirmaq olmur
// methodun adi class adi ile eyni olur
// ustunluk = fieldlerin deyerlerini
// obyekt yaranan zaman set etmeye
// imkan yaradir
