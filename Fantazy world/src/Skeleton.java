public class Skeleton  extends Monster{
    int accuracy;

    Skeleton(int hp, int xp, String weapon, int accuracy){
        this.hp = hp;
        this.xp = xp;
        this.weapon = weapon;
        this.accuracy = accuracy;
    }

    @Override
    public void print(){
        System.out.println("Hello, im skeleton");
    }

    void IncreasedAccuracy(){
        if (weapon == "Bow"){
            System.out.println("Your shooting accuracy has been improved by two minutes!");
        }
        else {
            System.out.println("Your strike accuracy is increased by two minutes!");
        }
    }
}
