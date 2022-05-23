import interfaces.Printable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        Book harry_potterBook = new Book("Harry Potter");
        Book tom_sawyerBook = new Book("Tom Sawyer");
        Book tarzanBook = new Book("Tharzan");

        Magazine cosmopolitanMagazine = new Magazine("Cosmopolitan");
        Magazine ringMagazine = new Magazine("Ring");
        Magazine forbesMagazine = new Magazine("Forbes");


        List<Printable> booksAndMagazinesList = new ArrayList<>();

        booksAndMagazinesList.add(cosmopolitanMagazine);
        booksAndMagazinesList.add(ringMagazine);
        booksAndMagazinesList.add(forbesMagazine);
        booksAndMagazinesList.add(harry_potterBook);
        booksAndMagazinesList.add(tom_sawyerBook);
        booksAndMagazinesList.add(tarzanBook);


        for (Printable items : booksAndMagazinesList){
                items.print();
        }

        System.out.println("Books below");
        Book.printBooks(booksAndMagazinesList);

        System.out.println("Magazines below");
        Magazine.printMagazines(booksAndMagazinesList);

    }
}
