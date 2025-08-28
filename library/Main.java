import java.util.ArrayList;
import java.util.Scanner;

class Book {
    int id;
    String name;

    Book(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();
        library.add(new Book(1, "Harry Potter"));
        library.add(new Book(2, "Java Basics"));

        System.out.println("All books:");
        for (Book b : library) {
            System.out.println(b.id + ": " + b.name);
        }
        int searchId = 2;
        for (Book b : library) {
            if (b.id == searchId) {
                System.out.println("The name and ID of book " + searchId + ": " + b.name);
            }
        }
        int deleteId = 1;
        library.removeIf(b -> b.id == deleteId);

        System.out.println("Books after deleting:");
        for (Book b : library) {
            System.out.println(b.id + ": " + b.name);
        }
    }
}
