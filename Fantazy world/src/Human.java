public class Human extends Character{
    boolean DTM; //Disposition to magic

    Human(String name, int hp, int stamina, boolean sex, int xp, String weapon, int age, boolean DTM){
        this.name = name;
        this.hp = hp;
        this.stamina = stamina;
        this.sex = sex;
        this.xp = xp;
        this.weapon = weapon;
        this.age = age;
        this.DTM = DTM;
    }

    @Override
     public void print(){
        super.print();
        if (!DTM){
            System.out.println("Unfortunately, I don't have a magical talent.");
        }
        else if (DTM){
            System.out.println("I also have a penchant for magic.");
        }
    }

    public void distraction(){
        System.out.println("You have distracted the enemy's attention!");
    }
}
