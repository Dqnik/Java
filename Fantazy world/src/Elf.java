public class Elf extends Character{
    int mana;

    Elf(String name, int hp, int stamina, boolean sex, int xp, String weapon, int age,int mana){
        super(name, hp, stamina, sex, xp, age, weapon);
        this.mana = mana;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("I am very fast and can move through trees.");
    }

    @Override
    void heal() {

    }

    @Override
    void learn() {

    }

    void ElfWisdom(){
        System.out.println("Your mana regeneration is doubled for the next minute!");
    }
}
