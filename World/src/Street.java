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
        Houses = new ArrayList<House>(new Random().nextInt(3));
        for (int i = 0; i < Houses.size(); i++) {
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