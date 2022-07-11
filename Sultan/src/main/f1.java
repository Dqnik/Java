package main;

import java.util.Random;

public class f1 {}

class Sultan {
    String name;
    byte age;
    float wealth;
    int wives;
    String names[];
    int ages[];
    float[] beauty;
    float harmfulness[];
    static int SultAmout;

    Sultan() {
        name = "Murad I";
        age = (byte) 30;
        wealth = 100f;
        wives = 3;
        names = new String[3];
        names[0] = "Halime";
        names[1] = "Kera";
        names[2] = "Olivera";
        ages = new int[3];
        ages[0] = 30;
        ages[1] = 25;
        ages[2] = 27;
        beauty = new float[3];
        beauty[0] = 0.7f;
        beauty[1] = 0.8f;
        beauty[2] = 0.5f;
        harmfulness = new float[3];
        harmfulness[0] = 0.2f;
        harmfulness[1] = 0.3f;
        harmfulness[2] = 0.1f;
        SultAmout+=1;
    }
    Sultan(String name, byte vozrast) {
        this.name = name;
        age = vozrast;
        wealth = 100f;
        wives = 3;
        names = new String[3];
        names[0] = "Haima";
        names[1] = "Kari";
        names[2] = "Omiria";
        ages = new int[3];
        ages[0] = 30;
        ages[1] = 25;
        ages[2] = 27;
        beauty = new float[3];
        beauty[0] = 0.7f;
        beauty[1] = 0.8f;
        beauty[2] = 0.75f;
        harmfulness = new float[3];
        harmfulness[0] = 0.2f;
        harmfulness[1] = 0.3f;
        harmfulness[2] = 0.1f;
        SultAmout+=1;
    }

    Sultan(float wealth) {
        this.name = name;
        age = age;
        wealth = 100f;
        wives = 3;
        names = new String[3];
        names[0] = "Haima";
        names[1] = "Kari";
        names[2] = "Omiria";
        ages = new int[3];
        ages[0] = 30;
        ages[1] = 25;
        ages[2] = 27;
        beauty = new float[3];
        beauty[0] = 0f;
        beauty[1] = 0f;
        beauty[2] = 0f;
        harmfulness = new float[3];
        harmfulness[0] = 0.2f;
        harmfulness[1] = 0.3f;
        harmfulness[2] = 0.1f;
        SultAmout+=1;
    }
    Sultan(Sultan KtoTo) {
        this.name = KtoTo.name;
        age = KtoTo.age;
        wealth = KtoTo.wealth;
        wives = KtoTo.wives;
        names = new String[KtoTo.wives];
        for (int i = 0; i < KtoTo.wives; i++)
            names[i] = KtoTo.names[i];
        ages = new int[KtoTo.wives];
        for (int i = 0; i < KtoTo.wives; i++)
            ages[i] = KtoTo.ages[i];
        beauty = new float[KtoTo.wives];
        for (int i = 0; i < KtoTo.wives; i++)
            beauty[i] = KtoTo.beauty[i];
        harmfulness = new float[KtoTo.wives];
        for (int i = 0; i < KtoTo.wives; i++)
            harmfulness[i] = KtoTo.harmfulness[i];
        SultAmout+=1;
    }
    void printSultan() {
        System.out.println("Имя султана: " + this.name);
        System.out.println("Возраст султана: " + this.age + " лет");
        System.out.printf("Богатство султана %.2f миллионов золота", this.wealth);
        System.out.println("");
        System.out.println("Количество жен у султана: " + this.wives + " жены");
        System.out.println("Имена жен:");
        for (int i = 0; i < this.wives; i++) {
            System.out.println(i + 1 + " Жена - " + this.names[i]);
        }
        System.out.println("Возраст жен:");
        for (int i = 0; i < this.wives; i++) {
            System.out.println(i + 1 + " Жена - " + this.ages[i] + " лет");
        }
        System.out.println("Коэффицент красоты жен султана от 0 до 1: ");
        for (int i = 0; i < this.wives; i++) {
            System.out.printf(i + 1 + " Жена - %.2f", this.beauty[i]);
            System.out.println("");
        }
        System.out.println("Коэффицент вредности жен султана от 0 до 1: ");
        for (int i = 0; i < this.wives; i++) {
            System.out.printf(i + 1 + " Жена - %.2f", this.harmfulness[i]);
            System.out.println("");
        }
        System.out.print("");
        System.out.printf("Средний возраст жен - %.2f", this.averageAge());
        System.out.println("");
        System.out.printf("Средняя вредность жен - %.3f",this.averageHarmfulness());
        System.out.println("");
        for (int i = 0; i < this.wives; i++) {
            if (this.beauty[i] == this.MaxBeauty()) System.out.println("Самая красивая жена - " + this.names[i]);
        }
        System.out.println("");
    }
    void randomizer() {
        String imena[] = {
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
        wives = ((new Random()).nextInt(2) + 1);
        String sheni[] = {
                "Aila",
                "Aisha",
                "Alia",
                "Alifia",
                "Amali"
        };
        names = new String[wives];
        for (int i = 0; i < wives; i++)
            names[i] = sheni[(new Random()).nextInt(sheni.length)];
        ages = new int[wives];
        for (int i = 0; i < wives; i++)
            ages[i] = (new Random().nextInt(10) + 20);
        beauty = new float[wives];
        for (int i = 0; i < wives; i++)
            beauty[i] = (new Random().nextFloat());
        harmfulness = new float[wives];
        for (int i = 0; i < wives; i++)
            harmfulness[i] = (new Random().nextFloat());
    }

    float sumAge() {
        int sum = 0;
        for (int i = 0; i < wives; i++)
            sum += ages[i];
        return sum;
    }

    double averageAge() {
        return (sumAge() / wives);
    }

    float sumHarfulness() {
        float sum = 0;
        for (int i = 0; i < wives; i++)
            sum += harmfulness[i];
        return sum;
    }

    double averageHarmfulness() {
        return (sumHarfulness() / wives);
    }

    String MBWN;
    float MaxBeauty() {
        float MaxBeauty = 0;
        for (int i = 0; i < wives; i++)
            if (beauty[i] > MaxBeauty) {
                MaxBeauty = beauty[i];
                MBWN = names[i];
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
        if(NewAge>=18)
            age=NewAge;
    }

    public int getWives() {
        return wives;
    }

    public String getNames(int id) {
        if(id>=0 && id<= wives)
            return names[id];
        return "-1";
    }

    public void setNames(int id, String NewName) {
        if(id>=0 && id <= wives)
            names[id] = NewName;
    }

    public int getAges(int id) {
        if(id>=0 && id<= wives)
            return ages[id];
        return -1;
    }

    public void setAges(int id, int NewAges) {
        if (id >= 0 && id <= wives && NewAges >= 18)
            ages[id] = NewAges;
    }

    public float getBeauty(int id) {
        if (id>=0 && id<=wives)
            return beauty[id];
        return  -1;
    }

    public void setBeauty(int id,float NewBeauty) {
        if (id>=0 && id<=wives && NewBeauty>=0 && NewBeauty<=1)
            beauty[id] = NewBeauty;
    }

    public float getHarmfulness(int id) {
        if (id>=0 && id<=wives)
            return harmfulness[id];
        return  -1;
    }

    public void setHarmfulness(int id,float NewHarmfulness) {
        if (id>=0 && id<=wives && NewHarmfulness>=0 && NewHarmfulness<=1)
            harmfulness[id] = NewHarmfulness;
    }

    public void setWives(int NewWives) {
        if (NewWives >= 0 && NewWives < 4 && wives != NewWives) {
            String save[] = new String[wives];
            for (int i = 0; i < wives; i++)
                save[i] = names[i];
            names = new String[NewWives];
            int min = (wives < NewWives) ? (wives) : (NewWives);
            for (int i = 0; i < min; i++)
                names[i] = save[i];
            wives = NewWives;
        }
    }
}



