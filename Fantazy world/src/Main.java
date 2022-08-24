import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Character> heroes = new ArrayList<>();
        List<Monster> monsters = new ArrayList<>();
        List<Warrior> warriors = new ArrayList<>();
        List<Wizard> wizards = new ArrayList<>();
        Character human = new Human("Bob",200,200,true,700,"Sword",20,false);
        Character orc = new Orc("Grock",400,350,true,3500,"Mace", 30,50);
        Character elf = new Elf("Azariel",500,750,true,15000,"Bow",90,3500);
        Monster zombie = new Zombie(670,3000,"Sword",67);
        Monster skeleton = new Skeleton(350,1000,"Bow",35);

        heroes.add(human);
        heroes.add(orc);
        heroes.add(elf);
        monsters.add(zombie);
        monsters.add(skeleton);
    }

    static void fight(Warrior a, Monster b) {
        a.attack(b);
    }
}
