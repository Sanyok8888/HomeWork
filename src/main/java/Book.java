import interfaces.Printable;

import java.util.List;

public class Book implements Printable {
    private String bookName;

    public Book(String name) {
        this.bookName = name;
    }

    public void print() {
        System.out.println("This is book");
    }

    public static void printBooks(List<Printable> printable) {
        for (Printable item : printable){
            if (item instanceof Book){
                System.out.println(item);
            }
        }
    }

    @Override
    public String toString(){
        return this.bookName;
    }
}

