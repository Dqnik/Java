import java.util.Random;

public class Citizen {
    int age;
    String name;
    boolean sex;

    Citizen(){
        age = new Random().nextInt(70);
        String[] Mnames = {
                "Mark",
                "Alex",
                "Sven",
                "Oliver",
                "Jack",
                "Harry",
                "Charley",
                "Jacob"
        };
        String[] Wnames = {
                "Sandra",
                "Ann",
                "Alice",
                "Elizabeth",
                "Margaret",
                "Barbara"
        };
        sex = new Random().nextBoolean();
        if (sex == true){
            name = Mnames[(new Random()).nextInt(Mnames.length)];
        }
        else {
            name = Wnames[(new Random()).nextInt(Wnames.length)];
        }
    }

    void PrintCitizien(){
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
        System.out.println("Citizen name: " + this.name);
        System.out.println("Citizen age: " + this.age);
        if (this.sex == true){
            System.out.println("Citizen is male");
        }
        if (this.sex == false){
            System.out.println("Citizen is female");
        }
    }
}
