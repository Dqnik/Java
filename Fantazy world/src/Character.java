public abstract class Character {
    String name;
    int hp;
    int stamina;
    boolean sex;
    int xp;
    int age;
    String weapon;

    Character(String name, int hp, int stamina, boolean sex, int xp, int age, String weapon){
        this.name = name;
        this.hp = hp;
        this.stamina = stamina;
        this.sex = sex;
        this.xp = xp;
        this.age = age;
        this.weapon = weapon;
    }

    public void print(){
        System.out.println("Hello, my name is " + this.name + ". I am " + this.age  + " years old.I am good with such weapons as " + this.weapon + ".");
    }

    abstract void heal();

    abstract void learn();
}
