import java.util.ArrayList;
import java.util.Random;

public class Appartment {
    int AppartmentNumber;
    ArrayList<Citizen> Citizens;
    ArrayList<Room> Rooms;

    Appartment(){
        AppartmentNumber = new Random().nextInt(300);
        Citizens = new ArrayList<Citizen>();
        for (int i = 0; i < new Random().nextInt(10) + 1; i++) {
            Citizens.add(new Citizen());
        }
        Rooms = new ArrayList<>();
        for (int i = 0; i < new Random().nextInt(6) + 1; i++) {
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