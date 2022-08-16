import java.util.ArrayList;
import java.util.Random;

public class Floor {
    byte number;
    ArrayList<Appartment> Appartments;

    Floor(){
        number = (byte) ((byte) new Random().nextInt(14)+(byte) 1);
        Appartments = new ArrayList<Appartment>(new Random().nextInt(7));
        for (int i = 0; i < Appartments.size(); i++) {
            Appartments.add(new Appartment());
        }
    }

    void printFloor(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Number of floor: " + this.number);
        System.out.println("Appartments: ");
        for (Appartment c: Appartments) {
            c.printAppartment();
        }
    }
}
