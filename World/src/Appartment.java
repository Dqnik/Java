import java.util.ArrayList;
import java.util.Random;

public class Appartment {
    int AppartmentNumber;
    ArrayList<Citizen> Citizens;
    ArrayList<Room> Rooms;

    Appartment(){
        AppartmentNumber = new Random().nextInt();
        Citizens = new ArrayList<Citizen>(new Random().nextInt(10) + 1);
        for (int i = 0; i < Citizens.size(); i++) {
            Citizens.add(new Citizen());
        }
        Rooms = new ArrayList<>(new Random().nextInt(6) + 1);
        for (int i = 0; i < Rooms.size(); i++) {
            Rooms.add(new Room());
        }
    }

    void printAppartment(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Number of this appartment: " + this.AppartmentNumber);
        System.out.println("Citiziens: ");
        for (Citizen c : Citizens) {
            c.PrintCitizien();
        }
        System.out.println("Rooms: ");
        for (Room c: Rooms) {
            c.printRoom();
        }
    }
}