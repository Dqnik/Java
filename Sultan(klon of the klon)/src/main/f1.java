package main;

import java.util.ArrayList;
import java.util.Random;
class Sultan {
    String name;
    byte age;
    float wealth;
    ArrayList<Wife> Wifes = new ArrayList<>();
    //int len;
    static int SultAmout;

  //  Wife wf = new Wife();

    Sultan() {
        name = "Murad I";
        age = (byte) 30;
        wealth = 100f;
      //  ArrayList<Wife> Wifes = new ArrayList<>();
      //  len = 3;
        for (int i = 0; i < 3; i++) {
            Wifes.add(new Wife());
        }
    }

    Sultan(String name, byte vozrast) {
        this.name = name;
        age = vozrast;
        wealth = 100f;
      //  ArrayList<Wife> Wifes = new ArrayList<>();
     //   len = 3;
        for (int i = 0; i < 3; i++) {
            Wifes.add(new Wife());
        }
    }

    Sultan(float wealth) {
        name = "";
        age = 20;
        this.wealth = wealth;
       // len = 3;
        for (int i = 0; i < new Random().nextInt(10); i++) {
            Wifes.add(new Wife());
        }
    }

    Sultan(Sultan KtoTo) {
        name = KtoTo.name;
        age = KtoTo.age;
        wealth = KtoTo.wealth;
        //ArrayList<Wife> Wifes = new ArrayList<>();
        //len = KtoTo.len;
        for (Wife wf : KtoTo.Wifes) {
            Wifes.add(wf);
        }
    }

    void printSultan() {
        System.out.println("Имя султана: " + this.name);
        System.out.println("Возраст султана: " + this.age + " лет");
        System.out.printf("Богатство султана %.2f миллионов золота", this.wealth);
        System.out.println();
        System.out.println("Количество жен у султана: " + this.Wifes.size() + " жены");
        System.out.println("Жёны: ");
        for (Wife wf : Wifes) {
            wf.printWife();
        }
        for (Wife wf: Wifes) {
            if (MaxBeauty() == wf.beauty){
                System.out.println("Самая красивая жена: " + wf.name);
            }
        }
        System.out.println();
        SultAmout+=1;
    }

    void randomizer() {
        String[] imena = {
                "Ahmed",
                "Humam",
                "Hussein",
                "Hussam",
                "Shafi",
                "Sharif",
                "Shahbaz",
                "Shamili",
                "Chingiz",
                "Shaia"
        };
        name = imena[(new Random()).nextInt(imena.length)];
        age = (byte)((new Random()).nextInt(20) + 20);
        wealth = ((new Random()).nextFloat() * 100 + 100);
    }

    float sumAge() {
        int sum = 0;
        for (int i = 0; i < Wifes.size(); i++)
            sum += Wifes.get(i).age;
        return sum;
    }

    double averageAge() {
        return (sumAge() / Wifes.size());
    }

    float sumHarfulness() {
        float sum = 0;
        for (int i = 0; i < Wifes.size(); i++)
            sum += Wifes.get(i).harmfulness;
        return sum;
    }

    double averageHarmfulness() {
        return (sumHarfulness() / Wifes.size());
    }

    String MBWN;
    float MaxBeauty() {
        float MaxBeauty = 0;
        for (int i = 0; i < Wifes.size(); i++)
            if (Wifes.get(i).beauty > MaxBeauty) {
                MaxBeauty = Wifes.get(i).beauty;
                MBWN = Wifes.get(i).name;
            }
        return MaxBeauty;
    }

    double SultanHappiness() {
        return (averageAge()/averageHarmfulness());
    }

    public String getName() {
            return name;
    }

    public void setName(String NewName) {
        if(NewName!=name)
            name=NewName;
    }

    public float getWealth() {
        return wealth;
    }

    public void setWealth(float NewWealth) {
        if(NewWealth>=0)
            wealth=NewWealth;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte NewAge) {
        if(NewAge>=18 && NewAge!=age)
            age=NewAge;
    }

    public void setWifes(int NewWifes) {
        if (NewWifes<this.Wifes.size() && NewWifes!=this.Wifes.size() && NewWifes>0)
            for (int i = this.Wifes.size()-1; i < NewWifes; i--) {
                Wifes.remove(i);
            }
    }
}




