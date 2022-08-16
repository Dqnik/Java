import java.util.ArrayList;
import java.util.Random;

public class House {
    String number;
    ArrayList<Floor> Floors;

    House(){
        String[] numbers = {
                "1/1",
                "1/2",
                "2/1",
                "2/2",
                "3/1",
                "3/2",
                "4/1",
                "4/2",
                "5/1",
                "5/2"
        };
        number = numbers[new Random().nextInt(numbers.length)];
        Floors = new ArrayList<Floor>(new Random().nextInt(15));
        for (int i = 0; i < Floors.size(); i++) {
            Floors.add(new Floor());
        }
    }

    void printHouse(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Number of house: " + this.number);
        System.out.println("Floors: ");
        for (Floor c: Floors) {
            c.printFloor();
        }
    }
}
