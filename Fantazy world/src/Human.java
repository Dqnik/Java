public class Human extends Character{
    boolean DTDM; //Disposition to dark magic

    Human(String name, int hp, int stamina, boolean sex, int xp, String weapon, int age, boolean DTDM){
        this.name = name;
        this.hp = hp;
        this.stamina = stamina;
        this.sex = sex;
        this.xp = xp;
        this.weapon = weapon;
        this.age = age;
        this.DTDM = DTDM;
    }

    @Override
     public void print(){
        super.print();
        if (!DTDM){
            System.out.println("Unfortunately, I don't have a magical talent.");
        }
        else if (DTDM){
            System.out.println("I also have a penchant for dark magic.");
        }
    }

    void distraction(){
        System.out.println("You have distracted the enemy's attention!");
    }
}
