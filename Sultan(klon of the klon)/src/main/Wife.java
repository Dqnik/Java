package main;

import java.util.Random;

class Wife {
    String name;
    int age;
    float beauty;
    float harmfulness;

    Wife() {
        name = "";
        age = 1;
        beauty = 1;
        harmfulness = 1;
        randomizer();
    }

     void randomizer() {
        String[] names = {
                "Aila",
                "Aisha",
                "Alia",
                "Alifia",
                "Amali"
        };
        name = names[(new Random()).nextInt(names.length)];
        age = (new Random().nextInt(10) + 20);
        beauty = (new Random().nextFloat());
        harmfulness = (new Random().nextFloat());
    }

    void printWife(){
        System.out.println("name: " + this.name);
        System.out.println("age: " + this.age);
        System.out.printf("красота: %.2f",this.beauty);
        System.out.println();
        System.out.printf("вредность: %.2f",this.harmfulness);
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name!= this.name)
           this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age!=this.age && age >= 18)
            this.age = age;
    }

    public float getBeauty() {
        return beauty;
    }

    public void setBeauty(float beauty) {
        if (beauty!= this.beauty && beauty>=0)
            this.beauty = beauty;
    }

    public float getHarmfulness() {
        return harmfulness;
    }

    public void setHarmfulness(float harmfulness) {
        if (harmfulness!=this.harmfulness && harmfulness>=0)
          this.harmfulness = harmfulness;
    }
}
