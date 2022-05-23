import interfaces.Printable;

import java.util.List;

public class Magazine implements Printable {
    private  String magazineName;

    public Magazine(String name){
        this.magazineName = name;
    }


    public void print(){
        System.out.println("This is magazine");
    }

    public static void printMagazines(List<Printable> printable) {
        for (Printable item2 : printable){
            if (item2 instanceof Magazine){
                System.out.println(item2);
            }
        }
    }

    @Override
    public String toString(){
        return this.magazineName;
    }
}
