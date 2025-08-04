package library;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("iqtisadiyyatin esaslari",
                "Juravliova", 50,3);
        Book book2 = new Book("Melikmemmedin nagli",
                "unknown",30,50 );
        Book book3 = new Book("Evrim",
                "Richad bukoviski",60,15);

        Book[] asifBookList = {book1,book2,book3};
        Book[] aytacBookList = {book1,book3};


        Library asifLibrary = new Library("Asif library_Paket_Structor.LibraryTwo",asifBookList);
        Library aytacLibrary = new Library("Aytac library_Paket_Structor.LibraryTwo",aytacBookList);

        System.out.println(aytacLibrary);

    }
}
