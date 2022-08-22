public class Orc extends Character {
    int TNOEK; //the number of enemies killed

    Orc(String name, int hp, int stamina, boolean sex, int xp, String weapon, int age, int TNOEK){
        this.name = name;
        this.hp = hp;
        this.stamina = stamina;
        this.sex = sex;
        this.xp = xp;
        this.weapon = weapon;
        this.age = age;
        if (TNOEK > 0) {
            this.TNOEK = TNOEK;
        }
    }

    @Override
    public void print(){
        super.print();
        if (TNOEK < 10){
            System.out.println("I'm still a rookie and I'm learning how to kill.");
        }
        if (TNOEK >= 10){
            System.out.println("I have been in battle many times and killed many enemies.");
        }
    }
}
