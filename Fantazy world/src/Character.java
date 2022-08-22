public class Character {
    String name;
    int hp;
    int stamina;
    boolean sex;
    int xp;
    int age;
    String weapon;

    public void print(){
        System.out.println("Hello, my name is " + this.name + ". I am " + this.age  + " years old.I am good with such weapons as " + this.weapon + ".");
    }
}
