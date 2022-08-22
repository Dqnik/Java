public class Elf extends Character{
    int mana;

    Elf(String name, int hp, int stamina, boolean sex, int xp, String weapon, int age,int mana){
        this.name = name;
        this.hp = hp;
        this.stamina = stamina;
        this.sex = sex;
        this.xp = xp;
        this.weapon = weapon;
        this.age = age;
        this.mana = mana;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("I am very fast and can move through trees.");
    }

    void ElfWisdom(){
        System.out.println("Your mana regeneration is doubled for the next minute!");
    }
}
