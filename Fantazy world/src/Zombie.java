public class Zombie extends Monster{
    int decomposition;

    Zombie(int hp, int xp, String weapon, int decomposition){
        this.hp = hp;
        this.xp = xp;
        this.weapon = weapon;
        this.decomposition = decomposition;
    }

    @Override
    public void print(){
        System.out.println("HHello, im zombiiie");
    }

    void Infection(){
        System.out.println("You have infected your enemy! During the day he will become a zombie!");
    }
}
