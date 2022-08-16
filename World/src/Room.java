import java.util.Random;

public class Room {
    String roomTipe;
    double area;

    Room(){
        String[] roomTipes = {
                "living room",
                "kitchen",
                "batch",
                "bedroom"
        };
        roomTipe = roomTipes[(new Random()).nextInt(roomTipes.length)];
        area = new Random().nextDouble(15);
    }

    void  printRoom(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Tipe of this room: " + this.roomTipe);
        System.out.println("Room area: " + this.area);
    }
}
