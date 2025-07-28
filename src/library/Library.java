package library;

import java.util.Arrays;

public class Library {
    private String libraryName;
    private Book[] books;

    public Library(String libraryName, Book[] books) {
        this.libraryName = libraryName;
        this.books = books;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "libraryName='" + libraryName + '\'' +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}
