import java.util.ArrayList;
import java.util.Random;

public class Street {
    String nameStreet;
    ArrayList<House> Houses;

    Street(){
        String[] name = {
                " Pennsylvania Avenue ",
                "Broadway",
                " Bourbon Street",
                "Hollywood Boulevard"
        };
        nameStreet = name[new Random().nextInt(name.length)];
        Houses = new ArrayList<>();
        for (int i = 0; i < new Random().nextInt(3)+1; i++) {
            Houses.add(new House());
        }
    }

    void printStreet(){
        System.out.println();
        System.out.println();
        System.out.println("Street name: " + this.nameStreet);
        System.out.println("Houses: ");
        for (House c: Houses) {
            c.printHouse();
        }
    }
}